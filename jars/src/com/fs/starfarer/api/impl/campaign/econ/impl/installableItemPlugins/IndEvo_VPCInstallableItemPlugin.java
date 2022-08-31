package com.fs.starfarer.api.impl.campaign.econ.impl.installableItemPlugins;

import com.fs.starfarer.api.IndEvo_StringHelper;
import com.fs.starfarer.api.campaign.CargoStackAPI;
import com.fs.starfarer.api.campaign.SpecialItemData;
import com.fs.starfarer.api.campaign.econ.Industry;
import com.fs.starfarer.api.impl.campaign.econ.impl.BaseInstallableIndustryItemPlugin;
import com.fs.starfarer.api.impl.campaign.econ.impl.IndEvo_AdAssem;
import com.fs.starfarer.api.impl.campaign.econ.impl.IndEvo_VPCUserIndustryAPI;
import com.fs.starfarer.api.impl.campaign.ids.Commodities;
import com.fs.starfarer.api.impl.campaign.ids.IndEvo_Items;
import com.fs.starfarer.api.ui.TooltipMakerAPI;
import com.fs.starfarer.api.util.Misc;

import java.util.HashMap;
import java.util.Map;

/**
 * Very important for implementations of this to not store *any* references to campaign data in data members, since
 * this is stored in a static map and persists between game loads etc.
 */

public class IndEvo_VPCInstallableItemPlugin extends BaseInstallableIndustryItemPlugin {

    public static final Map<String, IndEvo_ItemEffect> IndEvo_VPC_EFFECTS = new HashMap<String, IndEvo_ItemEffect>() {{

        put(IndEvo_Items.VPC_PARTS, new IndEvo_ItemEffect() {

            @Override
            public void apply(IndEvo_VPCUserIndustryAPI industry) {
                Map<String, Integer> supplyMap = new HashMap<>();
                supplyMap.put(IndEvo_Items.PARTS, -2);

                Map<String, Integer> demandMap = new HashMap<>();
                demandMap.put(Commodities.METALS, -1);
                demandMap.put(Commodities.RARE_METALS, -2);
                demandMap.put(Commodities.ORGANICS, -2);

                industry.setSupply(supplyMap);
                industry.setDemand(demandMap);
            }

            @Override
            public void unapply(IndEvo_VPCUserIndustryAPI industry) {
                industry.vpcUnapply();
            }

            public void addItemDescription(TooltipMakerAPI text, SpecialItemData data, InstallableItemDescriptionMode mode) {
                addSummaryItemDescription(text, data, mode);
            }
        });

        put(IndEvo_Items.VPC_SUPPLIES, new IndEvo_ItemEffect() {

            @Override
            public void apply(IndEvo_VPCUserIndustryAPI industry) {
                Map<String, Integer> supplyMap = new HashMap<>();
                supplyMap.put(Commodities.SUPPLIES, -2);

                Map<String, Integer> demandMap = new HashMap<>();
                demandMap.put(Commodities.METALS, -1);
                demandMap.put(Commodities.ORGANICS, -1);

                industry.setSupply(supplyMap);
                industry.setDemand(demandMap);
            }

            @Override
            public void unapply(IndEvo_VPCUserIndustryAPI industry) {
                industry.vpcUnapply();
            }

            public void addItemDescription(TooltipMakerAPI text, SpecialItemData data, InstallableItemDescriptionMode mode) {
                addSummaryItemDescription(text, data, mode);
            }
        });

        put(IndEvo_Items.VPC_MARINES, new IndEvo_ItemEffect() {

            @Override
            public void apply(IndEvo_VPCUserIndustryAPI industry) {
                Map<String, Integer> supplyMap = new HashMap<>();
                supplyMap.put(Commodities.MARINES, -1);

                Map<String, Integer> demandMap = new HashMap<>();
                demandMap.put(Commodities.METALS, 0);
                demandMap.put(Commodities.CREW, -1);

                industry.setSupply(supplyMap);
                industry.setDemand(demandMap);
            }

            @Override
            public void unapply(IndEvo_VPCUserIndustryAPI industry) {
                industry.vpcUnapply();
            }

            public void addItemDescription(TooltipMakerAPI text, SpecialItemData data, InstallableItemDescriptionMode mode) {
                addSummaryItemDescription(text, data, mode);
            }
        });

        put(IndEvo_Items.VPC_HEAVY_MACHINERY, new IndEvo_ItemEffect() {

            @Override
            public void apply(IndEvo_VPCUserIndustryAPI industry) {
                Map<String, Integer> supplyMap = new HashMap<>();
                supplyMap.put(Commodities.HEAVY_MACHINERY, 0);

                Map<String, Integer> demandMap = new HashMap<>();
                demandMap.put(Commodities.METALS, 0);
                demandMap.put(Commodities.RARE_METALS, -2);

                industry.setSupply(supplyMap);
                industry.setDemand(demandMap);
            }

            @Override
            public void unapply(IndEvo_VPCUserIndustryAPI industry) {
                industry.vpcUnapply();
            }

            public void addItemDescription(TooltipMakerAPI text, SpecialItemData data, InstallableItemDescriptionMode mode) {
                addSummaryItemDescription(text, data, mode);
            }
        });

        put(IndEvo_Items.VPC_DOMESTIC_GOODS, new IndEvo_ItemEffect() {

            @Override
            public void apply(IndEvo_VPCUserIndustryAPI industry) {
                Map<String, Integer> supplyMap = new HashMap<>();
                supplyMap.put(Commodities.DOMESTIC_GOODS, -1);

                Map<String, Integer> demandMap = new HashMap<>();
                demandMap.put(Commodities.ORGANICS, 0);

                industry.setSupply(supplyMap);
                industry.setDemand(demandMap);
            }

            @Override
            public void unapply(IndEvo_VPCUserIndustryAPI industry) {
                industry.vpcUnapply();
            }

            public void addItemDescription(TooltipMakerAPI text, SpecialItemData data, InstallableItemDescriptionMode mode) {
                addSummaryItemDescription(text, data, mode);
            }
        });

        put(IndEvo_Items.VPC_DRUGS, new IndEvo_ItemEffect() {

            @Override
            public void apply(IndEvo_VPCUserIndustryAPI industry) {
                Map<String, Integer> supplyMap = new HashMap<>();
                supplyMap.put(Commodities.DRUGS, 0);

                Map<String, Integer> demandMap = new HashMap<>();
                demandMap.put(Commodities.ORGANICS, 0);

                industry.setSupply(supplyMap);
                industry.setDemand(demandMap);
            }

            @Override
            public void unapply(IndEvo_VPCUserIndustryAPI industry) {
                industry.vpcUnapply();
            }

            public void addItemDescription(TooltipMakerAPI text, SpecialItemData data, InstallableItemDescriptionMode mode) {
                addSummaryItemDescription(text, data, mode);
            }
        });

        put(IndEvo_Items.VPC_HAND_WEAPONS, new IndEvo_ItemEffect() {

            @Override
            public void apply(IndEvo_VPCUserIndustryAPI industry) {
                Map<String, Integer> supplyMap = new HashMap<>();
                supplyMap.put(Commodities.HAND_WEAPONS, -1);

                Map<String, Integer> demandMap = new HashMap<>();
                demandMap.put(Commodities.METALS, 0);
                demandMap.put(Commodities.RARE_METALS, -1);

                industry.setSupply(supplyMap);
                industry.setDemand(demandMap);
            }

            @Override
            public void unapply(IndEvo_VPCUserIndustryAPI industry) {
                industry.vpcUnapply();
            }

            public void addItemDescription(TooltipMakerAPI text, SpecialItemData data, InstallableItemDescriptionMode mode) {
                addSummaryItemDescription(text, data, mode);
            }
        });

        put(IndEvo_Items.VPC_LUXURY_GOODS, new IndEvo_ItemEffect() {

            @Override
            public void apply(IndEvo_VPCUserIndustryAPI industry) {
                Map<String, Integer> supplyMap = new HashMap<>();
                supplyMap.put(Commodities.LUXURY_GOODS, -1);

                Map<String, Integer> demandMap = new HashMap<>();
                demandMap.put(Commodities.ORGANICS, 0);

                industry.setSupply(supplyMap);
                industry.setDemand(demandMap);
            }

            @Override
            public void unapply(IndEvo_VPCUserIndustryAPI industry) {
                industry.vpcUnapply();
            }

            public void addItemDescription(TooltipMakerAPI text, SpecialItemData data, InstallableItemDescriptionMode mode) {
                addSummaryItemDescription(text, data, mode);
            }
        });

        put(IndEvo_Items.VPC_MARINES_HAND_WEAPONS, new IndEvo_ItemEffect() {

            @Override
            public void apply(IndEvo_VPCUserIndustryAPI industry) {

                Map<String, Integer> supplyMap = new HashMap<>();
                supplyMap.put(Commodities.MARINES, -2);
                supplyMap.put(Commodities.HAND_WEAPONS, -2);

                Map<String, Integer> demandMap = new HashMap<>();
                demandMap.put(Commodities.METALS, +1);
                demandMap.put(Commodities.RARE_METALS, 0);
                demandMap.put(Commodities.CREW, -2);

                industry.setSupply(supplyMap);
                industry.setDemand(demandMap);
            }

            @Override
            public void unapply(IndEvo_VPCUserIndustryAPI industry) {
                industry.vpcUnapply();
            }

            public void addItemDescription(TooltipMakerAPI text, SpecialItemData data, InstallableItemDescriptionMode mode) {
                addSummaryItemDescription(text, data, mode);
            }
        });

        put(IndEvo_Items.VPC_SUPPLIES_FUEL, new IndEvo_ItemEffect() {

            @Override
            public void apply(IndEvo_VPCUserIndustryAPI industry) {
                Map<String, Integer> supplyMap = new HashMap<>();
                supplyMap.put(Commodities.FUEL, -2);
                supplyMap.put(Commodities.SUPPLIES, -2);

                Map<String, Integer> demandMap = new HashMap<>();
                demandMap.put(Commodities.METALS, -1);
                demandMap.put(Commodities.ORGANICS, -1);
                demandMap.put(Commodities.VOLATILES, -1);

                industry.setSupply(supplyMap);
                industry.setDemand(demandMap);
            }

            @Override
            public void unapply(IndEvo_VPCUserIndustryAPI industry) {
                industry.vpcUnapply();
            }

            public void addItemDescription(TooltipMakerAPI text, SpecialItemData data, InstallableItemDescriptionMode mode) {
                addSummaryItemDescription(text, data, mode);
            }
        });
    }};

    public static void addSummaryItemDescription(TooltipMakerAPI text, SpecialItemData data, InstallableItemDescriptionMode mode) {
        String id = data.getId();
        String name = IndEvo_Items.getItemNameString(id);
        String pre = "";
        float pad = 0f;
        if (mode == InstallableItemDescriptionMode.MANAGE_ITEM_DIALOG_LIST ||
                mode == InstallableItemDescriptionMode.INDUSTRY_TOOLTIP) {
            pre = name + ". ";
        } else if (mode == InstallableItemDescriptionMode.MANAGE_ITEM_DIALOG_INSTALLED ||
                mode == InstallableItemDescriptionMode.INDUSTRY_MENU_TOOLTIP) {
            pre = name + IndEvo_StringHelper.getString("IndEvo_items", "currentlyInstalled");
        }
        if (mode == InstallableItemDescriptionMode.INDUSTRY_MENU_TOOLTIP ||
                mode == InstallableItemDescriptionMode.CARGO_TOOLTIP) {
            pad = 10f;
        }
        text.addPara(pre + IndEvo_Items.getVPCDescriptionString(id),
                pad,
                Misc.getHighlightColor(),
                IndEvo_Items.getVPCOutputString(id));
    }

    private final Industry industry;

    public IndEvo_VPCInstallableItemPlugin(Industry industry) {
        this.industry = industry;
    }

    @Override
    public boolean isInstallableItem(CargoStackAPI stack) {
        if (!stack.isSpecialStack()) return false;

        return IndEvo_VPC_EFFECTS.containsKey(stack.getSpecialDataIfSpecial().getId());
    }

    private static String getVPCString() {
        return IndEvo_StringHelper.getString("IndEvo_items", "VPC");
    }

    @Override
    public String getMenuItemTitle() {
        if (getCurrentlyInstalledItemData() == null) {
            return IndEvo_StringHelper.getStringAndSubstituteToken("IndEvo_items", "install", "$itemName", getVPCString());
        }
        return IndEvo_StringHelper.getStringAndSubstituteToken("IndEvo_items", "manage", "$itemName", getVPCString());

    }

    @Override
    public String getUninstallButtonText() {
        return IndEvo_StringHelper.getStringAndSubstituteToken("IndEvo_items", "uninstall", "$itemName", getVPCString());

    }

    @Override
    public String getNoItemCurrentlyInstalledText() {
        return IndEvo_StringHelper.getStringAndSubstituteToken("IndEvo_items", "noCurrent", "$itemName", getVPCString());

    }

    @Override
    public String getNoItemsAvailableText() {
        return IndEvo_StringHelper.getStringAndSubstituteToken("IndEvo_items", "noAvailable", "$itemName", getVPCString());

    }

    @Override
    public String getNoItemsAvailableTextRemote() {
        return IndEvo_StringHelper.getStringAndSubstituteToken("IndEvo_items", "noStorage", "$itemName", getVPCString());

    }

    @Override
    public String getSelectItemToAssignToIndustryText() {
        Map<String, String> toReplace = new HashMap<>();
        toReplace.put("$itemName", getVPCString());
        toReplace.put("$industryName", industry.getCurrentName());

        return IndEvo_StringHelper.getStringAndSubstituteTokens("IndEvo_items", "selectForIndustry", toReplace);
    }

    @Override
    public void addItemDescription(TooltipMakerAPI text, SpecialItemData data,
                                   InstallableItemDescriptionMode mode) {
        IndEvo_ItemEffect effect = IndEvo_VPC_EFFECTS.get(data.getId());
        if (effect != null) {
            effect.addItemDescription(text, data, mode);
        }
    }

    @Override
    public boolean isMenuItemTooltipExpandable() {
        return false;
    }

    @Override
    public float getMenuItemTooltipWidth() {
        return super.getMenuItemTooltipWidth();
    }

    @Override
    public boolean hasMenuItemTooltip() {
        return super.hasMenuItemTooltip();
    }

    @Override
    public SpecialItemData getCurrentlyInstalledItemData() {
        if (industry instanceof IndEvo_AdAssem) return ((IndEvo_AdAssem) industry).getCurrentVPC();

        return null;
    }

    @Override
    public void setCurrentlyInstalledItemData(SpecialItemData data) {
        if (industry instanceof IndEvo_AdAssem) ((IndEvo_AdAssem) industry).setCurrentVPC(data);

    }

    @Override
    public void createMenuItemTooltip(TooltipMakerAPI tooltip, boolean expanded) {
        float pad = 3f;
        float opad = 10f;

        tooltip.addPara(IndEvo_StringHelper.getString("IndEvo_items", "vpcIndTooltip"), 0f);

        if (industry instanceof IndEvo_AdAssem) {
            SpecialItemData data = ((IndEvo_AdAssem) industry).getCurrentVPC();
            toolTipCreate(tooltip, data, opad);
        }
    }

    //Method to increase readability during checking which instance is used in createMenuItemTooltip
    private void toolTipCreate(TooltipMakerAPI tooltip, SpecialItemData data, float opad) {
        if (data == null) {
            tooltip.addPara(getNoItemCurrentlyInstalledText() + ".", opad);
        } else {
            IndEvo_ItemEffect effect = IndEvo_VPC_EFFECTS.get(data.getId());
            effect.addItemDescription(tooltip, data, InstallableItemDescriptionMode.INDUSTRY_MENU_TOOLTIP);
        }
    }

    public interface IndEvo_ItemEffect {
        void apply(IndEvo_VPCUserIndustryAPI industry);

        void unapply(IndEvo_VPCUserIndustryAPI industry);

        void addItemDescription(TooltipMakerAPI text, SpecialItemData data, InstallableItemDescriptionMode mode);
    }

}




