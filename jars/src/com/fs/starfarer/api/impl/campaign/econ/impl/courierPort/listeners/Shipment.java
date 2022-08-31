package com.fs.starfarer.api.impl.campaign.econ.impl.courierPort.listeners;

import com.fs.starfarer.api.EveryFrameScript;
import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.campaign.CampaignEventListener;
import com.fs.starfarer.api.campaign.CampaignFleetAPI;
import com.fs.starfarer.api.campaign.CargoAPI;
import com.fs.starfarer.api.campaign.SectorEntityToken;
import com.fs.starfarer.api.campaign.comm.CommMessageAPI;
import com.fs.starfarer.api.campaign.econ.MarketAPI;
import com.fs.starfarer.api.campaign.econ.SubmarketAPI;
import com.fs.starfarer.api.campaign.econ.SubmarketSpecAPI;
import com.fs.starfarer.api.fleet.FleetMemberAPI;
import com.fs.starfarer.api.impl.PlayerFleetPersonnelTracker;
import com.fs.starfarer.api.impl.campaign.econ.impl.courierPort.ShippingCargoManager;
import com.fs.starfarer.api.impl.campaign.econ.impl.courierPort.ShippingContract;
import com.fs.starfarer.api.impl.campaign.econ.impl.courierPort.ShippingCostCalculator;
import com.fs.starfarer.api.impl.campaign.econ.impl.courierPort.fleet.CourierFleetAssignmentAI;
import com.fs.starfarer.api.impl.campaign.econ.impl.courierPort.fleet.CourierFleetCreator;
import com.fs.starfarer.api.impl.campaign.econ.impl.courierPort.intel.ShippingIntel;
import com.fs.starfarer.api.impl.campaign.ids.Commodities;
import com.fs.starfarer.api.impl.campaign.ids.Submarkets;
import com.fs.starfarer.api.impl.campaign.intel.BaseIntelPlugin;
import com.fs.starfarer.api.impl.campaign.intel.MessageIntel;
import com.fs.starfarer.api.plugins.IndEvo_modPlugin;
import com.fs.starfarer.api.plugins.timers.IndEvo_newDayListener;
import com.fs.starfarer.api.util.Misc;

import static com.fs.starfarer.api.impl.campaign.econ.impl.courierPort.listeners.ShippingManager.chargePlayer;

public class Shipment implements IndEvo_newDayListener, EveryFrameScript {
    public ShippingContract contract;
    public CargoAPI cargo;
    public CampaignFleetAPI fleet;
    public ShippingIntel intel;

    public int maxDaysBeforeFailsafe = 0;
    public int daysPassed = 0;
    public boolean done = false;
    public boolean alternate = false;

    public float cost = 0f;

    public static Shipment create(ShippingContract contract){
        CargoAPI cargo = ShippingCargoManager.getTargetCargoFromOrigin(contract, true);
        CampaignFleetAPI fleet = CourierFleetCreator.createFleet(contract, cargo);
        return new Shipment(contract.getCopy(), cargo, fleet);
    }

    public Shipment(ShippingContract contract, CargoAPI cargo, CampaignFleetAPI fleet) {
        this.contract = contract;
        this.cargo = cargo;
        this.fleet = fleet;
        this.intel = new ShippingIntel(this);
        this.cost = ShippingCostCalculator.getContractCargoCost(cargo, contract);
    }

    public void init(){
        CourierFleetCreator.spawnFleet(this);

        Global.getSector().getIntelManager().addIntel(intel);
        Global.getSector().addScript(this);

        setFailsafeTimer(contract.getFromMarket().getPrimaryEntity(), contract.getToMarket().getPrimaryEntity());
        fleet.addScript(new CourierFleetAssignmentAI(fleet, this));
        Global.getSector().getListenerManager().addListener(this, false);

        float amt = ShippingCostCalculator.getTotalContractCost(cargo, contract);
        chargePlayer(amt, this);
    }

    public int setFailsafeTimer(SectorEntityToken from, SectorEntityToken to){
        //failsafe timer is approx. travel time x1.5
        daysPassed = 0;

        float dist = Misc.getDistanceLY(from, to);
        float lyPerDay = Misc.getLYPerDayAtSpeed(fleet, fleet.getTravelSpeed());
        float days = dist / lyPerDay;

        this.maxDaysBeforeFailsafe = 7 + (int) Math.ceil(days * 3f);

        IndEvo_modPlugin.log("Courier delivery " + contract.name + " setting failsafe at " + maxDaysBeforeFailsafe);
        return maxDaysBeforeFailsafe;
    }

    public void finalizeAndRemove(){
        done = true;

        Global.getSector().getListenerManager().removeListener(this);
        Global.getSector().removeScript(this);

        fleet.despawn(CampaignEventListener.FleetDespawnReason.OTHER, null);

        if(contract.getToSubmarket() != null) {
            transfer(contract.getToSubmarket());
            if(alternate) intel.setStatus(ShippingIntel.ShippingStatus.DONE_ALTERNATE);
            else intel.setStatus(ShippingIntel.ShippingStatus.DONE_SUCCESS);
        } else {
            SubmarketAPI alternate = getAlternateTargetSubmarket();
            contract.toMarketId = alternate.getMarket().getId();
            contract.toSubmarketId = alternate.getSpecId();
            intel.setStatus(ShippingIntel.ShippingStatus.DONE_ALTERNATE);
            this.alternate = true;

            transfer(alternate);
        }

        intel.endAfterDelay();
    }

    public void transfer(SubmarketAPI toSubmarket){
        CargoAPI toCargo = toSubmarket.getCargo();
        toCargo.initMothballedShips("player");
        cargo.initMothballedShips("player");

        toCargo.addAll(cargo);
        for (FleetMemberAPI m : cargo.getMothballedShips().getMembersListCopy()) {
            toCargo.getMothballedShips().addFleetMember(m);
        }

        if(cargo.getMarines() > 0){
            PlayerFleetPersonnelTracker tracker = PlayerFleetPersonnelTracker.getInstance();
            PlayerFleetPersonnelTracker.PersonnelAtEntity from = tracker.getDroppedOffAt(Commodities.MARINES, contract.getFromMarket().getPrimaryEntity(), contract.getFromSubmarket(), true);
            PlayerFleetPersonnelTracker.PersonnelAtEntity to = tracker.getDroppedOffAt(Commodities.MARINES, toSubmarket.getMarket().getPrimaryEntity(), toSubmarket, true);
            PlayerFleetPersonnelTracker.transferPersonnel(from.data, to.data, cargo.getMarines(), from.data);
        }

        /*PlayerMarketTransaction transaction = new PlayerMarketTransaction(toSubmarket.getMarket(), toSubmarket, CampaignUIAPI.CoreUITradeMode.NONE);
        transaction.getSold().addAll(cargo);
        toSubmarket.getPlugin().reportPlayerMarketTransaction(transaction);*/

        cargo.clear();
        cargo.getMothballedShips().clear();
    }

    public void notifyPlayerOfMarketChange(String oldname, String oldsubmarket, SubmarketAPI newSubmarket){
        MessageIntel intel = new MessageIntel("A courier shipment has %s.", Misc.getTextColor(), new String[]{"changed destination"}, Misc.getHighlightColor());
        intel.addLine(BaseIntelPlugin.BULLET + "From %s to %s.", Misc.getTextColor(),
                new String[]{oldname  + ", " + oldsubmarket,
                        newSubmarket.getMarket().getName() + ", " + newSubmarket.getNameOneLine()},
                Misc.getNegativeHighlightColor(), newSubmarket.getMarket().getFaction().getColor());
        intel.addLine(BaseIntelPlugin.BULLET + "Contract: %s", Misc.getTextColor(), new String[]{contract.name}, Misc.getHighlightColor());
        intel.setIcon(Global.getSettings().getSpriteName("intel", "tradeFleet_valuable"));
        intel.setSound(BaseIntelPlugin.getSoundMajorPosting());
        Global.getSector().getCampaignUI().addMessage(intel, CommMessageAPI.MessageClickAction.COLONY_INFO, contract.getToMarket());

    }

    public void updateWithAlternateTarget(){
        SubmarketAPI alternateSub = getAlternateTargetSubmarket();
        MarketAPI alternate = alternateSub.getMarket();
        setFailsafeTimer(fleet, alternate.getPrimaryEntity());

        String oldName = contract.getToMarket() != null ? contract.getToMarket().getName() : "A dead planet";
        String oldSub = "unknown storage";;
        for(SubmarketSpecAPI s : Global.getSettings().getAllSubmarketSpecs()){
            if (s.getId().equals(contract.toSubmarketId)) {
                oldSub = s.getName();
                break;
            }
        }

        notifyPlayerOfMarketChange(oldName, oldSub, alternateSub);

        contract.toMarketId = alternate.getId();
        contract.toSubmarketId = alternateSub.getSpecId();

        CourierFleetAssignmentAI.get(fleet).updateAssignments();
        this.alternate = true;
    }

    public SubmarketAPI getAlternateTargetSubmarket(){
        boolean fromMarketExists = contract.getFromMarket() != null && !contract.getFromMarket().isPlanetConditionMarketOnly();
        boolean toMarketExists = contract.getToMarket() != null && !contract.getToMarket().isPlanetConditionMarketOnly();
        boolean fromSubmarketExists = contract.getFromSubmarket() != null;

        if(toMarketExists) return contract.getToMarket().getSubmarket(Submarkets.SUBMARKET_STORAGE);
        if(fromSubmarketExists) return contract.getFromSubmarket();
        if(fromMarketExists) return contract.getFromMarket().getSubmarket(Submarkets.SUBMARKET_STORAGE);

        //no player markets, return any market that is in the economy
        if(Misc.getPlayerMarkets(true).isEmpty()){
            for (MarketAPI m : Global.getSector().getEconomy().getMarketsCopy()){
                if (m.isInEconomy() && m.hasSubmarket(Submarkets.SUBMARKET_STORAGE)) return m.getSubmarket(Submarkets.SUBMARKET_STORAGE);
            }
        }

        return Misc.getPlayerMarkets(true).get(0).getSubmarket(Submarkets.SUBMARKET_STORAGE);
    }


    @Override
    public void onNewDay() {
        if(done) return;

        daysPassed++;

        if(daysPassed > maxDaysBeforeFailsafe) {
            IndEvo_modPlugin.log("Failsafe timer for " + contract.name + " expired, finalizing and aborting");
            finalizeAndRemove();
        }
    }

    @Override
    public boolean isDone() {
        return done;
    }

    @Override
    public boolean runWhilePaused() {
        return false;
    }

    @Override
    public void advance(float amount) {
        //check if market still exists, else replace it and update the intel and fleet assignments

        if(!contract.isValid() && contract.getToMarket() == null || contract.getToMarket().isPlanetConditionMarketOnly()){
            updateWithAlternateTarget();
        }
    }
}
