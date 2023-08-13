package indevo.utils.helper;

import com.fs.starfarer.api.Global;
import lunalib.lunaSettings.LunaSettings;

public class Settings {
    public static int SHIP_PICKER_ROW_COUNT = Global.getSettings().getInt("IndEvo_shipPickerRowCount");
    public static boolean COMMERCE_BALANCE_CHANGES = Global.getSettings().getBoolean("IndEvo_CommerceBalanceChanges");
    public static boolean ADMANUF = Global.getSettings().getBoolean("Manufactory");
    public static boolean ADASSEM = Global.getSettings().getBoolean("Assembler");
    public static boolean COMFORGE = Global.getSettings().getBoolean("ComForge");
    public static boolean COMARRAY = Global.getSettings().getBoolean("MilArray");
    public static boolean INTARRAY = Global.getSettings().getBoolean("IndEvo_IntArray");
    public static boolean ADINFRA = Global.getSettings().getBoolean("CentBureau");
    public static boolean SCRAPYARD = Global.getSettings().getBoolean("ScrapYard");
    public static boolean SUPCOM = Global.getSettings().getBoolean("SupCom");
    public static boolean EMBASSY = Global.getSettings().getBoolean("Embassy");
    public static boolean SENATE = Global.getSettings().getBoolean("Senate");
    public static boolean DRYDOCK = Global.getSettings().getBoolean("dryDock");
    public static boolean ACADEMY = Global.getSettings().getBoolean("Academy");
    public static boolean REQCENTER = Global.getSettings().getBoolean("ReqCenter");
    public static boolean ENGHUB = Global.getSettings().getBoolean("EngHub");
    public static boolean PRIVATEPORT = Global.getSettings().getBoolean("PrivatePort");
    public static boolean PIRATEHAVEN = Global.getSettings().getBoolean("PirateHaven");
    public static boolean SWITCHABLEREFINING = Global.getSettings().getBoolean("IndEvo_SwitchableRefining");
    public static boolean SWITCHABLEMINING = Global.getSettings().getBoolean("IndEvo_SwitchableMining");
    public static boolean DERELICT_DELIVER_TO_GATHERING = Global.getSettings().getBoolean("IndEvo_derelictDeliverToGathering");
    public static float DERINFRA_BUILD_RED = Global.getSettings().getFloat("IndEvo_DerInfraBuildRed");
    public static boolean ENABLE_DERELICTS = Global.getSettings().getBoolean("Enable_Indevo_Derelicts");
    public static float AUTOMATEDSHIPYARD_NUM = Global.getSettings().getFloat("IndEvo_AutomatedShipyardNum");
    public static float SPECIAL_APPLICATION_CHANCE = Global.getSettings().getFloat("IndEvo_SpecialApplicationChance");
    public static boolean ENABLE_DERELICT_STATIONS = Global.getSettings().getBoolean("IndEvo_enable_derelict_stations");
    public static float DERELICT_STATION_AMOUNT = Global.getSettings().getFloat("IndEvo_derelictStationAmount");
    public static boolean PARTS_DROP_IN_CAMPAIGN = Global.getSettings().getBoolean("IndEvo_PartsDropInCampaign");
    public static float RELIC_COMPONENT_HARD_BATTLE_FP_ADVANTAGE = Global.getSettings().getFloat("IndEvo_relicComponentHardbattleFPAdvantage");
    public static float RELIC_COMPONENT_FP_DESTROYED_FRACT = Global.getSettings().getFloat("IndEvo_relicComponentFPDestroyedFract");
    public static boolean ENABLE_MINEFIELDS = Global.getSettings().getBoolean("Enable_IndEvo_minefields");
    public static float MINEFIELD_HITCHANCE_FRIGATE = Global.getSettings().getFloat("IndEvo_Minefield_HitChance_frigate");
    public static float MINEFIELD_HITCHANCE_DESTROYER = Global.getSettings().getFloat("IndEvo_Minefield_HitChance_destroyer");
    public static float MINEFIELD_HITCHANCE_CRUISER = Global.getSettings().getFloat("IndEvo_Minefield_HitChance_cruiser");
    public static float MINEFIELD_HITCHANCE_CAPITAL = Global.getSettings().getFloat("IndEvo_Minefield_HitChance_capital");
    public static float MINEFIELD_NOHITUNTILSUM = Global.getSettings().getFloat("IndEvo_Minefield_NoHitUntilSum");
    public static float MINEFIELD_CIVILIAN_SHIP_IMPACT_MULT = Global.getSettings().getFloat("IndEvo_Minefield_CivilianShipImpactMult");
    public static float MINEFIELD_PHASE_SHIP_IMPACT_MULT = Global.getSettings().getFloat("IndEvo_Minefield_PhaseShipImpactMult");
    public static boolean ENABLE_ARTILLERY = Global.getSettings().getBoolean("Enable_IndEvo_Artillery");
    public static float ARTILLERY_SPAWN_WEIGHT = Global.getSettings().getFloat("IndEvo_Artillery_spawnWeight");
    public static float ARTILLERY_MIN_DELAY_BETWEEN_SHOTS = Global.getSettings().getFloat("IndEvo_Artillery_minDelayBetweenShots");
    public static float ARTILLERY_MAX_DELAY_BETWEEN_SHOTS = Global.getSettings().getFloat("IndEvo_Artillery_maxDelayBetweenShots");
    public static float ARTILLERY_MIN_COOLDOWN = Global.getSettings().getFloat("IndEvo_Artillery_minCooldown");
    public static float ARTILLERY_MAX_COOLDOWN = Global.getSettings().getFloat("IndEvo_Artillery_maxCooldown");
    public static float ARTILLERY_COOLDOWN_NPC_MULT = Global.getSettings().getFloat("IndEvo_Artillery_cooldownNPCMult");
    public static float ARTILLERY_MIN_RANGE = Global.getSettings().getFloat("IndEvo_Artillery_minRange");
    public static float ARTILLERY_MAX_RANGE = Global.getSettings().getFloat("IndEvo_Artillery_maxRange");
    public static float ARTILLERY_WATCHTOWER_RANGE = Global.getSettings().getFloat("IndEvo_Artillery_WatchtowerRange");
    public static float ARTILLERY_DEFENSE_FP = Global.getSettings().getFloat("IndEvo_Artillery_defense_FP");
    public static int ARTILLERY_MORTAR_PROJECTILES_PER_SHOT = Global.getSettings().getInt("IndEvo_Artillery_mortar_projectilesPerShot");
    public static float ARTILLERY_MORTAR_PROJECTILES_IMPACT_TIME = Global.getSettings().getFloat("IndEvo_Artillery_mortar_projectilesImpactTime");
    public static float ARTILLERY_MORTAR_EXPLOSION_SIZE = Global.getSettings().getFloat("IndEvo_Artillery_mortar_explosionSize");
    public static int ARTILLERY_RAILGUN_PROJECTILES_PER_SHOT = Global.getSettings().getInt("IndEvo_Artillery_railgun_projectilesPerShot");
    public static float ARTILLERY_RAILGUN_PROJECTILES_IMPACT_TIME = Global.getSettings().getFloat("IndEvo_Artillery_railgun_projectilesImpactTime");
    public static float ARTILLERY_RAILGUN_SHOT_FUZZ_MULT = Global.getSettings().getFloat("IndEvo_Artillery_railgun_shotFuzzMult");
    public static int ARTILLERY_MISSILE_PROJECTILES_PER_SHOT = Global.getSettings().getInt("IndEvo_Artillery_missile_projectilesPerShot");
    public static float ARTILLERY_MISSILE_PROJECTILES_IMPACT_TIME = Global.getSettings().getFloat("IndEvo_Artillery_missile_projectilesImpactTime");
    public static float ARTILLERY_MISSILE_MAX_COVERED_AREA = Global.getSettings().getFloat("IndEvo_Artillery_missile_maxCoveredArea");
    public static float ARTILLERY_MISSILE_FUZZ = Global.getSettings().getFloat("IndEvo_Artillery_missile_fuzz");
    public static float ARTILLERY_MISSILE_EXPLOSION_RADIUS = Global.getSettings().getFloat("IndEvo_Artillery_missile_explosionRadius");
    public static float ARTILLERY_MISSILE_DURATION = Global.getSettings().getFloat("IndEvo_Artillery_missile_duration");
    public static boolean ENGHUB_IGNORE_WHITELISTS = Global.getSettings().getBoolean("IndEvo_EngHubIgnoreWhitelists");
    public static boolean AUTO_SHIP_BP_TO_GATHERING_POINT = Global.getSettings().getBoolean("IndEvo_AutoshipBPToGatheringPoint");
    public static int RARE_PARTS_AMOUNT_PER_FP = Global.getSettings().getInt("IndEvo_RarePartsAmountPerFP");
    public static int SY_BASE_DMODS = Global.getSettings().getInt("IndEvo_SYBaseDMods");
    public static float SY_PART_VALUE_MULT = Global.getSettings().getFloat("IndEvo_SYPartValueMult");
    public static int SY_HULL_DELIVERY_TIME = Global.getSettings().getInt("IndEvo_SYHullDeliveryTime");
    public static float SY_DMOD_MOVE_BASE_COST_MULT = Global.getSettings().getFloat("IndEvo_SYDModMoveBaseCostMult");
    public static boolean RAID_FOR_UNKNOWN_ONLY = Global.getSettings().getBoolean("IndEvo_RaidForUnknownOnly");
    public static boolean PRIVATEER_DELIVER_TO_GATHERING_POINT = Global.getSettings().getBoolean("IndEvo_PrivateerDeliverToGatheringPoint");
    public static int RG_COOLDOWN_TIME = Global.getSettings().getInt("RG_cooldownTime");
    public static int RG_RANGE = Global.getSettings().getInt("RG_range");
    public static boolean RESLAB_AUTO_DELIVER_TO_CLOSEST_DECON = Global.getSettings().getBoolean("reslab_autoDeliverToClosestDecon");
    public static boolean DECON_IGNORE_WHITELISTS = Global.getSettings().getBoolean("IndEvo_DeconIgnoreWhitelists");
    public static boolean HULLDECON_AUTO_DELIVER_TO_CLOSEST_FORGE = Global.getSettings().getBoolean("hullDecon_autoDeliverToClosestForge");
    public static int HULLDECON_DAYS_FRIGATE = Global.getSettings().getInt("hullDecon_days_FRIGATE");
    public static int HULLDECON_DAYS_DESTROYER = Global.getSettings().getInt("hullDecon_days_DESTROYER");
    public static int HULLDECON_DAYS_CRUISER = Global.getSettings().getInt("hullDecon_days_CRUISER");
    public static int HULLDECON_DAYS_CAPITAL_SHIP = Global.getSettings().getInt("hullDecon_days_CAPITAL_SHIP");
    public static boolean HULLFORGE_AUTO_QUEUE_SHIPS_UNTIL_EMPTY = Global.getSettings().getBoolean("hullForge_autoQueueShipsUntilEmpty");
    public static boolean HULLFORGE_AUTO_DELIVER_TO_CLOSEST_LAB = Global.getSettings().getBoolean("hullForge_autoDeliverToClosestLab");
    public static int HULLFORGE_DAYS_FRIGATE = Global.getSettings().getInt("hullForge_days_FRIGATE");
    public static int HULLFORGE_DAYS_DESTROYER = Global.getSettings().getInt("hullForge_days_DESTROYER");
    public static int HULLFORGE_DAYS_CRUISER = Global.getSettings().getInt("hullForge_days_CRUISER");
    public static int HULLFORGE_DAYS_CAPITAL_SHIP = Global.getSettings().getInt("hullForge_days_CAPITAL_SHIP");
    public static int ALPHA_CORE_RUNTIME = Global.getSettings().getInt("alpha_core_runtime");
    public static int BETA_CORE_RUNTIME = Global.getSettings().getInt("beta_core_runtime");
    public static int GAMMA_CORE_RUNTIME = Global.getSettings().getInt("gamma_core_runtime");
    public static float RESTO_FEE_FRIGATE = Global.getSettings().getFloat("restoFee_FRIGATE");
    public static float RESTO_FEE_DESTROYER = Global.getSettings().getFloat("restoFee_DESTROYER");
    public static float RESTO_FEE_CRUISER = Global.getSettings().getFloat("restoFee_CRUISER");
    public static float RESTO_FEE_CAPITAL = Global.getSettings().getFloat("restoFee_CAPITAL");
    public static float DAILY_OFFICER_SPAWN_CHANCE = Global.getSettings().getFloat("dailyOfficerSpawnChance");
    public static float DAILY_ADMIN_SPAWN_CHANCE = Global.getSettings().getFloat("dailyAdminSpawnChance");
    public static int PERSONALITY_TRAINING_DAY_COUNT = Global.getSettings().getInt("personalityTrainingDayCount");
    public static int PERSONALITY_TRAINING_COST = Global.getSettings().getInt("personalityTrainingCost");
    public static int ADMIN_TRAINING_DAY_COUNT = Global.getSettings().getInt("adminTrainingDayCount");
    public static int ADMIN_TRAINING_COST = Global.getSettings().getInt("adminTrainingCost");
    public static int MONTHLY_AI_STORAGE_COST = Global.getSettings().getInt("monthlyAIStorageCost");
    public static boolean VARIND_DELIVER_TO_PRODUCTION_POINT = Global.getSettings().getBoolean("VarInd_deliverToProductionPoint");
    public static boolean PETS = Global.getSettings().getBoolean("IndEvo_pets");

    //todo pet shop

    public static void reloadLunaSettings(){
        SHIP_PICKER_ROW_COUNT = LunaSettings.getInt("IndEvo", "IndEvo_shipPickerRowCount");
        COMMERCE_BALANCE_CHANGES = LunaSettings.getBoolean("IndEvo", "IndEvo_CommerceBalanceChanges");
        ADMANUF = LunaSettings.getBoolean("IndEvo", "IndEvo_AdManuf");
        ADASSEM = LunaSettings.getBoolean("IndEvo", "IndEvo_AdAssem");
        COMFORGE = LunaSettings.getBoolean("IndEvo", "IndEvo_ComForge");
        COMARRAY = LunaSettings.getBoolean("IndEvo", "IndEvo_ComArray");
        INTARRAY = LunaSettings.getBoolean("IndEvo", "IndEvo_IntArray");
        ADINFRA = LunaSettings.getBoolean("IndEvo", "IndEvo_AdInfra");
        SCRAPYARD = LunaSettings.getBoolean("IndEvo", "IndEvo_ScrapYard");
        SUPCOM = LunaSettings.getBoolean("IndEvo", "IndEvo_SupCom");
        EMBASSY = LunaSettings.getBoolean("IndEvo", "IndEvo_embassy");
        SENATE = LunaSettings.getBoolean("IndEvo", "IndEvo_senate");
        DRYDOCK = LunaSettings.getBoolean("IndEvo", "IndEvo_dryDock");
        ACADEMY = LunaSettings.getBoolean("IndEvo", "IndEvo_Academy");
        REQCENTER = LunaSettings.getBoolean("IndEvo", "IndEvo_ReqCenter");
        ENGHUB = LunaSettings.getBoolean("IndEvo", "IndEvo_EngHub");
        PRIVATEPORT = LunaSettings.getBoolean("IndEvo", "IndEvo_PrivatePort");
        PIRATEHAVEN = LunaSettings.getBoolean("IndEvo", "IndEvo_pirateHaven");
        SWITCHABLEREFINING = LunaSettings.getBoolean("IndEvo", "IndEvo_SwitchableRefining");
        SWITCHABLEMINING = LunaSettings.getBoolean("IndEvo", "IndEvo_SwitchableMining");
        DERELICT_DELIVER_TO_GATHERING = LunaSettings.getBoolean("IndEvo", "IndEvo_derelictDeliverToGathering");
        DERINFRA_BUILD_RED = LunaSettings.getFloat("IndEvo", "IndEvo_DerInfraBuildRed");
        ENABLE_DERELICTS = LunaSettings.getBoolean("IndEvo", "IndEvo_Enable_Derelicts");
        AUTOMATEDSHIPYARD_NUM = LunaSettings.getFloat("IndEvo", "IndEvo_AutomatedShipyardNum");
        SPECIAL_APPLICATION_CHANCE = LunaSettings.getFloat("IndEvo", "IndEvo_SpecialApplicationChance");
        ENABLE_DERELICT_STATIONS = LunaSettings.getBoolean("IndEvo", "IndEvo_enable_derelict_stations");
        DERELICT_STATION_AMOUNT = LunaSettings.getFloat("IndEvo", "IndEvo_derelictStationAmount");
        PARTS_DROP_IN_CAMPAIGN = LunaSettings.getBoolean("IndEvo", "IndEvo_PartsDropInCampaign");
        RELIC_COMPONENT_HARD_BATTLE_FP_ADVANTAGE = LunaSettings.getFloat("IndEvo", "IndEvo_relicComponentHardbattleFPAdvantage");
        RELIC_COMPONENT_FP_DESTROYED_FRACT = LunaSettings.getFloat("IndEvo", "IndEvo_relicComponentFPDestroyedFract");
        ENABLE_MINEFIELDS = LunaSettings.getBoolean("IndEvo", "IndEvo_Enable_minefields");
        MINEFIELD_HITCHANCE_FRIGATE = LunaSettings.getFloat("IndEvo", "IndEvo_Minefield_HitChance_frigate");
        MINEFIELD_HITCHANCE_DESTROYER = LunaSettings.getFloat("IndEvo", "IndEvo_Minefield_HitChance_destroyer");
        MINEFIELD_HITCHANCE_CRUISER = LunaSettings.getFloat("IndEvo", "IndEvo_Minefield_HitChance_cruiser");
        MINEFIELD_HITCHANCE_CAPITAL = LunaSettings.getFloat("IndEvo", "IndEvo_Minefield_HitChance_capital");
        MINEFIELD_NOHITUNTILSUM = LunaSettings.getFloat("IndEvo", "IndEvo_Minefield_NoHitUntilSum");
        MINEFIELD_CIVILIAN_SHIP_IMPACT_MULT = LunaSettings.getFloat("IndEvo", "IndEvo_Minefield_CivilianShipImpactMult");
        MINEFIELD_PHASE_SHIP_IMPACT_MULT = LunaSettings.getFloat("IndEvo", "IndEvo_Minefield_PhaseShipImpactMult");
        ENABLE_ARTILLERY = LunaSettings.getBoolean("IndEvo", "IndEvo_Enable_Artillery");
        ARTILLERY_SPAWN_WEIGHT = LunaSettings.getFloat("IndEvo", "IndEvo_Artillery_spawnWeight");
        ARTILLERY_MIN_DELAY_BETWEEN_SHOTS = LunaSettings.getFloat("IndEvo", "IndEvo_Artillery_minDelayBetweenShots");
        ARTILLERY_MAX_DELAY_BETWEEN_SHOTS = LunaSettings.getFloat("IndEvo", "IndEvo_Artillery_maxDelayBetweenShots");
        ARTILLERY_MIN_COOLDOWN = LunaSettings.getFloat("IndEvo", "IndEvo_Artillery_minCooldown");
        ARTILLERY_MAX_COOLDOWN = LunaSettings.getFloat("IndEvo", "IndEvo_Artillery_maxCooldown");
        ARTILLERY_COOLDOWN_NPC_MULT = LunaSettings.getFloat("IndEvo", "IndEvo_Artillery_cooldownNPCMult");
        ARTILLERY_MIN_RANGE = LunaSettings.getFloat("IndEvo", "IndEvo_Artillery_minRange");
        ARTILLERY_MAX_RANGE = LunaSettings.getFloat("IndEvo", "IndEvo_Artillery_maxRange");
        ARTILLERY_WATCHTOWER_RANGE = LunaSettings.getFloat("IndEvo", "IndEvo_Artillery_WatchtowerRange");
        ARTILLERY_DEFENSE_FP = LunaSettings.getFloat("IndEvo", "IndEvo_Artillery_defense_FP");
        ARTILLERY_MORTAR_PROJECTILES_PER_SHOT = LunaSettings.getInt("IndEvo", "IndEvo_Artillery_mortar_projectilesPerShot");
        ARTILLERY_MORTAR_PROJECTILES_IMPACT_TIME = LunaSettings.getFloat("IndEvo", "IndEvo_Artillery_mortar_projectilesImpactTime");
        ARTILLERY_MORTAR_EXPLOSION_SIZE = LunaSettings.getFloat("IndEvo", "IndEvo_Artillery_mortar_explosionSize");
        ARTILLERY_RAILGUN_PROJECTILES_PER_SHOT = LunaSettings.getInt("IndEvo", "IndEvo_Artillery_railgun_projectilesPerShot");
        ARTILLERY_RAILGUN_PROJECTILES_IMPACT_TIME = LunaSettings.getFloat("IndEvo", "IndEvo_Artillery_railgun_projectilesImpactTime");
        ARTILLERY_RAILGUN_SHOT_FUZZ_MULT = LunaSettings.getFloat("IndEvo", "IndEvo_Artillery_railgun_shotFuzzMult");
        ARTILLERY_MISSILE_PROJECTILES_PER_SHOT = LunaSettings.getInt("IndEvo", "IndEvo_Artillery_missile_projectilesPerShot");
        ARTILLERY_MISSILE_PROJECTILES_IMPACT_TIME = LunaSettings.getFloat("IndEvo", "IndEvo_Artillery_missile_projectilesImpactTime");
        ARTILLERY_MISSILE_MAX_COVERED_AREA = LunaSettings.getFloat("IndEvo", "IndEvo_Artillery_missile_maxCoveredArea");
        ARTILLERY_MISSILE_FUZZ = LunaSettings.getFloat("IndEvo", "IndEvo_Artillery_missile_fuzz");
        ARTILLERY_MISSILE_EXPLOSION_RADIUS = LunaSettings.getFloat("IndEvo", "IndEvo_Artillery_missile_explosionRadius");
        ARTILLERY_MISSILE_DURATION = LunaSettings.getFloat("IndEvo", "IndEvo_Artillery_missile_duration");
        ENGHUB_IGNORE_WHITELISTS = LunaSettings.getBoolean("IndEvo", "IndEvo_EngHubIgnoreWhitelists");
        AUTO_SHIP_BP_TO_GATHERING_POINT = LunaSettings.getBoolean("IndEvo", "IndEvo_AutoshipBPToGatheringPoint");
        RARE_PARTS_AMOUNT_PER_FP = LunaSettings.getInt("IndEvo", "IndEvo_RarePartsAmountPerFP");
        SY_BASE_DMODS = LunaSettings.getInt("IndEvo", "IndEvo_SYBaseDMods");
        SY_PART_VALUE_MULT = LunaSettings.getFloat("IndEvo", "IndEvo_SYPartValueMult");
        SY_HULL_DELIVERY_TIME = LunaSettings.getInt("IndEvo", "IndEvo_SYHullDeliveryTime");
        SY_DMOD_MOVE_BASE_COST_MULT = LunaSettings.getFloat("IndEvo", "IndEvo_SYDModMoveBaseCostMult");
        RAID_FOR_UNKNOWN_ONLY = LunaSettings.getBoolean("IndEvo", "IndEvo_RaidForUnknownOnly");
        PRIVATEER_DELIVER_TO_GATHERING_POINT = LunaSettings.getBoolean("IndEvo", "IndEvo_PrivateerDeliverToGatheringPoint");
        RG_COOLDOWN_TIME = LunaSettings.getInt("IndEvo", "IndEvo_RG_cooldownTime");
        RG_RANGE = LunaSettings.getInt("IndEvo", "IndEvo_RG_range");
        RESLAB_AUTO_DELIVER_TO_CLOSEST_DECON = LunaSettings.getBoolean("IndEvo", "IndEvo_reslab_autoDeliverToClosestDecon");
        DECON_IGNORE_WHITELISTS = LunaSettings.getBoolean("IndEvo", "IndEvo_DeconIgnoreWhitelists");
        HULLDECON_AUTO_DELIVER_TO_CLOSEST_FORGE = LunaSettings.getBoolean("IndEvo", "IndEvo_hullDecon_autoDeliverToClosestForge");
        HULLDECON_DAYS_FRIGATE = LunaSettings.getInt("IndEvo", "IndEvo_hullDecon_days_FRIGATE");
        HULLDECON_DAYS_DESTROYER = LunaSettings.getInt("IndEvo", "IndEvo_hullDecon_days_DESTROYER");
        HULLDECON_DAYS_CRUISER = LunaSettings.getInt("IndEvo", "IndEvo_hullDecon_days_CRUISER");
        HULLDECON_DAYS_CAPITAL_SHIP = LunaSettings.getInt("IndEvo", "IndEvo_hullDecon_days_CAPITAL_SHIP");
        HULLFORGE_AUTO_QUEUE_SHIPS_UNTIL_EMPTY = LunaSettings.getBoolean("IndEvo", "IndEvo_hullForge_autoQueueShipsUntilEmpty");
        HULLFORGE_AUTO_DELIVER_TO_CLOSEST_LAB = LunaSettings.getBoolean("IndEvo", "IndEvo_hullForge_autoDeliverToClosestLab");
        HULLFORGE_DAYS_FRIGATE = LunaSettings.getInt("IndEvo", "IndEvo_hullForge_days_FRIGATE");
        HULLFORGE_DAYS_DESTROYER = LunaSettings.getInt("IndEvo", "IndEvo_hullForge_days_DESTROYER");
        HULLFORGE_DAYS_CRUISER = LunaSettings.getInt("IndEvo", "IndEvo_hullForge_days_CRUISER");
        HULLFORGE_DAYS_CAPITAL_SHIP = LunaSettings.getInt("IndEvo", "IndEvo_hullForge_days_CAPITAL_SHIP");
        ALPHA_CORE_RUNTIME = LunaSettings.getInt("IndEvo", "IndEvo_alpha_core_runtime");
        BETA_CORE_RUNTIME = LunaSettings.getInt("IndEvo", "IndEvo_beta_core_runtime");
        GAMMA_CORE_RUNTIME = LunaSettings.getInt("IndEvo", "IndEvo_gamma_core_runtime");
        RESTO_FEE_FRIGATE = LunaSettings.getFloat("IndEvo", "IndEvo_restoFee_FRIGATE");
        RESTO_FEE_DESTROYER = LunaSettings.getFloat("IndEvo", "IndEvo_restoFee_DESTROYER");
        RESTO_FEE_CRUISER = LunaSettings.getFloat("IndEvo", "IndEvo_restoFee_CRUISER");
        RESTO_FEE_CAPITAL = LunaSettings.getFloat("IndEvo", "IndEvo_restoFee_CAPITAL");
        DAILY_OFFICER_SPAWN_CHANCE = LunaSettings.getFloat("IndEvo", "IndEvo_dailyOfficerSpawnChance");
        DAILY_ADMIN_SPAWN_CHANCE = LunaSettings.getFloat("IndEvo", "IndEvo_dailyAdminSpawnChance");
        PERSONALITY_TRAINING_DAY_COUNT = LunaSettings.getInt("IndEvo", "IndEvo_personalityTrainingDayCount");
        PERSONALITY_TRAINING_COST = LunaSettings.getInt("IndEvo", "IndEvo_personalityTrainingCost");
        ADMIN_TRAINING_DAY_COUNT = LunaSettings.getInt("IndEvo", "IndEvo_adminTrainingDayCount");
        ADMIN_TRAINING_COST = LunaSettings.getInt("IndEvo", "IndEvo_adminTrainingCost");
        MONTHLY_AI_STORAGE_COST = LunaSettings.getInt("IndEvo", "IndEvo_monthlyAIStorageCost");
        VARIND_DELIVER_TO_PRODUCTION_POINT = LunaSettings.getBoolean("IndEvo", "IndEvo_VarInd_deliverToProductionPoint");
        PETS = LunaSettings.getBoolean("IndEvo", "IndEvo_pets");
    }
}
