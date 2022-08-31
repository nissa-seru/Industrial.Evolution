package com.fs.starfarer.api.impl.campaign.rulecmd.edictRules;

import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.campaign.InteractionDialogAPI;
import com.fs.starfarer.api.campaign.TextPanelAPI;
import com.fs.starfarer.api.campaign.econ.MarketAPI;
import com.fs.starfarer.api.campaign.rules.MemKeys;
import com.fs.starfarer.api.campaign.rules.MemoryAPI;
import com.fs.starfarer.api.impl.campaign.econ.conditions.edicts.IndEvo_EdictAPI;
import com.fs.starfarer.api.impl.campaign.rulecmd.BaseCommandPlugin;
import com.fs.starfarer.api.util.Misc;

import java.util.List;
import java.util.Map;

public class IndEvo_PrintPenaltyText extends BaseCommandPlugin {

    @Override
    public boolean execute(String ruleId, InteractionDialogAPI dialog, List<Misc.Token> params, Map<String, MemoryAPI> memoryMap) {
        MarketAPI market = Global.getSector().getEconomy().getMarket(memoryMap.get(MemKeys.MARKET).getString("$id"));
        TextPanelAPI text = dialog.getTextPanel();

        for (String id : IndEvo_CreateEdictSelectionList.getEdictIdSet()) {
            if (market.hasCondition(id)) {
                IndEvo_EdictAPI plugin = (IndEvo_EdictAPI) market.getCondition(id).getPlugin();
                plugin.printRemovalPenaltyText(text);
                return true;
            }
        }

        return false;

    }
}