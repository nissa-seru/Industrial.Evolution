package indevo.utils.helper;

import lunalib.lunaSettings.LunaSettings;

public class Settings {
    public static final int SHIP_PICKER_ROW_COUNT = LunaSettings.getInt("IndEvo", "IndEvo_shipPickerRowCount");
    public static final boolean COMMERCE_BALANCE_CHANGES = LunaSettings.getBoolean("IndEvo", "IndEvo_CommerceBalanceChanges");
    public static final boolean ADMANUF = LunaSettings.getBoolean("IndEvo", "IndEvo_AdManuf");
    public static final boolean ADASSEM = LunaSettings.getBoolean("IndEvo", "IndEvo_AdAssem");
    public static final boolean COMFORGE = LunaSettings.getBoolean("IndEvo", "IndEvo_ComForge");
    public static final boolean COMARRAY = LunaSettings.getBoolean("IndEvo", "IndEvo_ComArray");
    public static final boolean INTARRAY = LunaSettings.getBoolean("IndEvo", "IndEvo_IntArray");
    public static final boolean ADINFRA = LunaSettings.getBoolean("IndEvo", "IndEvo_AdInfra");
    public static final boolean SCRAPYARD = LunaSettings.getBoolean("IndEvo", "IndEvo_ScrapYard");
    public static final boolean SUPCOM = LunaSettings.getBoolean("IndEvo", "IndEvo_SupCom");
    public static final boolean EMBASSY = LunaSettings.getBoolean("IndEvo", "IndEvo_embassy");
    public static final boolean SENATE = LunaSettings.getBoolean("IndEvo", "IndEvo_senate");
    public static final boolean DRYDOCK = LunaSettings.getBoolean("IndEvo", "IndEvo_dryDock");
    public static final boolean ACADEMY = LunaSettings.getBoolean("IndEvo", "IndEvo_Academy");
    public static final boolean REQCENTER = LunaSettings.getBoolean("IndEvo", "IndEvo_ReqCenter");
    public static final boolean ENGHUB = LunaSettings.getBoolean("IndEvo", "IndEvo_EngHub");
    public static final boolean PRIVATEPORT = LunaSettings.getBoolean("IndEvo", "IndEvo_PrivatePort");
    public static final boolean PIRATEHAVEN = LunaSettings.getBoolean("IndEvo", "IndEvo_pirateHaven");
    public static final boolean SWITCHABLEREFINING = LunaSettings.getBoolean("IndEvo", "IndEvo_SwitchableRefining");
    public static final boolean SWITCHABLEMINING = LunaSettings.getBoolean("IndEvo", "IndEvo_SwitchableMining");
    public static final boolean DERELICT_DELIVER_TO_GATHERING = LunaSettings.getBoolean("IndEvo", "IndEvo_derelictDeliverToGathering");
    public static final double DERINFRA_BUILD_RED = LunaSettings.getDouble("IndEvo", "IndEvo_DerInfraBuildRed");
    public static final boolean ENABLE_DERELICTS = LunaSettings.getBoolean("IndEvo", "IndEvo_Enable_Derelicts");
    public static final double AUTOMATEDSHIPYARD_NUM = LunaSettings.getDouble("IndEvo", "IndEvo_AutomatedShipyardNum");
    public static final double SPECIAL_APPLICATION_CHANCE = LunaSettings.getDouble("IndEvo", "IndEvo_SpecialApplicationChance");
    public static final boolean ENABLE_DERELICT_STATIONS = LunaSettings.getBoolean("IndEvo", "IndEvo_enable_derelict_stations");
    public static final double DERELICT_STATION_AMOUNT = LunaSettings.getDouble("IndEvo", "IndEvo_derelictStationAmount");
    public static final boolean PARTS_DROP_IN_CAMPAIGN = LunaSettings.getBoolean("IndEvo", "IndEvo_PartsDropInCampaign");
    public static final double RELIC_COMPONENT_HARD_BATTLE_FP_ADVANTAGE = LunaSettings.getDouble("IndEvo", "IndEvo_relicComponentHardbattleFPAdvantage");
    public static final double RELIC_COMPONENT_FP_DESTROYED_FRACT = LunaSettings.getDouble("IndEvo", "IndEvo_relicComponentFPDestroyedFract");
    public static final boolean ENABLE_MINEFIELDS = LunaSettings.getBoolean("IndEvo", "IndEvo_Enable_minefields");
    public static final double MINEFIELD_HITCHANCE_FRIGATE = LunaSettings.getDouble("IndEvo", "IndEvo_Minefield_HitChance_frigate");
    public static final double MINEFIELD_HITCHANCE_DESTROYER = LunaSettings.getDouble("IndEvo", "IndEvo_Minefield_HitChance_destroyer");
    public static final double MINEFIELD_HITCHANCE_CRUISER = LunaSettings.getDouble("IndEvo", "IndEvo_Minefield_HitChance_cruiser");
    public static final double MINEFIELD_HITCHANCE_CAPITAL = LunaSettings.getDouble("IndEvo", "IndEvo_Minefield_HitChance_capital");
    public static final double MINEFIELD_NOHITUNTILSUM = LunaSettings.getDouble("IndEvo", "IndEvo_Minefield_NoHitUntilSum");
    public static final double MINEFIELD_CIVILIAN_SHIP_IMPACT_MULT = LunaSettings.getDouble("IndEvo", "IndEvo_Minefield_CivilianShipImpactMult");
    public static final double MINEFIELD_PHASE_SHIP_IMPACT_MULT = LunaSettings.getDouble("IndEvo", "IndEvo_Minefield_PhaseShipImpactMult");
    public static final boolean ENABLE_ARTILLERY = LunaSettings.getBoolean("IndEvo", "IndEvo_Enable_Artillery");
    public static final int ARTILLERY_SPAWN_WEIGHT = LunaSettings.getInt("IndEvo", "IndEvo_Artillery_spawnWeight");
    public static final int ARTILLERY_MIN_DELAY_BETWEEN_SHOTS = LunaSettings.getInt("IndEvo", "IndEvo_Artillery_minDelayBetweenShots");
    public static final int ARTILLERY_MAX_DELAY_BETWEEN_SHOTS = LunaSettings.getInt("IndEvo", "IndEvo_Artillery_maxDelayBetweenShots");
    public static final int ARTILLERY_MIN_COOLDOWN = LunaSettings.getInt("IndEvo", "IndEvo_Artillery_minCooldown");
    public static final int ARTILLERY_MAX_COOLDOWN = LunaSettings.getInt("IndEvo", "IndEvo_Artillery_maxCooldown");
    public static final int ARTILLERY_COOLDOWN_NPC_MULT = LunaSettings.getInt("IndEvo", "IndEvo_Artillery_cooldownNPCMult");
    public static final int ARTILLERY_MIN_RANGE = LunaSettings.getInt("IndEvo", "IndEvo_Artillery_minRange");
    public static final int ARTILLERY_MAX_RANGE = LunaSettings.getInt("IndEvo", "IndEvo_Artillery_maxRange");
    public static final int ARTILLERY_WATCHTOWER_RANGE = LunaSettings.getInt("IndEvo", "IndEvo_Artillery_WatchtowerRange");
    public static final int ARTILLERY_DEFENSE_FP = LunaSettings.getInt("IndEvo", "IndEvo_Artillery_defense_FP");
    public static final int ARTILLERY_MORTAR_PROJECTILES_PER_SHOT = LunaSettings.getInt("IndEvo", "IndEvo_Artillery_mortar_projectilesPerShot");
    public static final int ARTILLERY_MORTAR_PROJECTILES_IMPACT_TIME = LunaSettings.getInt("IndEvo", "IndEvo_Artillery_mortar_projectilesImpactTime");
    public static final int ARTILLERY_MORTAR_EXPLOSION_SIZE = LunaSettings.getInt("IndEvo", "IndEvo_Artillery_mortar_explosionSize");
    public static final int ARTILLERY_RAILGUN_PROJECTILES_PER_SHOT = LunaSettings.getInt("IndEvo", "IndEvo_Artillery_railgun_projectilesPerShot");
    public static final double ARTILLERY_RAILGUN_PROJECTILES_IMPACT_TIME = LunaSettings.getDouble("IndEvo", "IndEvo_Artillery_railgun_projectilesImpactTime");
    public static final double ARTILLERY_RAILGUN_SHOT_FUZZ_MULT = LunaSettings.getDouble("IndEvo", "IndEvo_Artillery_railgun_shotFuzzMult");
    public static final int ARTILLERY_MISSILE_PROJECTILES_PER_SHOT = LunaSettings.getInt("IndEvo", "IndEvo_Artillery_missile_projectilesPerShot");
    public static final int ARTILLERY_MISSILE_PROJECTILES_IMPACT_TIME = LunaSettings.getInt("IndEvo", "IndEvo_Artillery_missile_projectilesImpactTime");
    public static final int ARTILLERY_MISSILE_MAX_COVERED_AREA = LunaSettings.getInt("IndEvo", "IndEvo_Artillery_missile_maxCoveredArea");
    public static final int ARTILLERY_MISSILE_FUZZ = LunaSettings.getInt("IndEvo", "IndEvo_Artillery_missile_fuzz");
    public static final int ARTILLERY_MISSILE_EXPLOSION_RADIUS = LunaSettings.getInt("IndEvo", "IndEvo_Artillery_missile_explosionRadius");
    public static final int ARTILLERY_MISSILE_DURATION = LunaSettings.getInt("IndEvo", "IndEvo_Artillery_missile_duration");
    public static final boolean ENGHUB_IGNORE_WHITELISTS = LunaSettings.getBoolean("IndEvo", "IndEvo_EngHubIgnoreWhitelists");
    public static final boolean AUTO_SHIP_BP_TO_GATHERING_POINT = LunaSettings.getBoolean("IndEvo", "IndEvo_AutoshipBPToGatheringPoint");
    public static final int RARE_PARTS_AMOUNT_PER_FP = LunaSettings.getInt("IndEvo", "IndEvo_RarePartsAmountPerFP");
    public static final int SY_BASE_DMODS = LunaSettings.getInt("IndEvo", "IndEvo_SYBaseDMods");
    public static final double SY_PART_VALUE_MULT = LunaSettings.getDouble("IndEvo", "IndEvo_SYPartValueMult");
    public static final int SY_HULL_DELIVERY_TIME = LunaSettings.getInt("IndEvo", "IndEvo_SYHullDeliveryTime");
    public static final double SY_DMOD_MOVE_BASE_COST_MULT = LunaSettings.getDouble("IndEvo", "IndEvo_SYDModMoveBaseCostMult");
    public static final boolean RAID_FOR_UNKNOWN_ONLY = LunaSettings.getBoolean("IndEvo", "IndEvo_RaidForUnknownOnly");
    public static final boolean PRIVATEER_DELIVER_TO_GATHERING_POINT = LunaSettings.getBoolean("IndEvo", "IndEvo_PrivateerDeliverToGatheringPoint");
    public static final int RG_COOLDOWN_TIME = LunaSettings.getInt("IndEvo", "IndEvo_RG_cooldownTime");
    public static final int RG_RANGE = LunaSettings.getInt("IndEvo", "IndEvo_RG_range");
    public static final boolean RESLAB_AUTO_DELIVER_TO_CLOSEST_DECON = LunaSettings.getBoolean("IndEvo", "IndEvo_reslab_autoDeliverToClosestDecon");
    public static final boolean DECON_IGNORE_WHITELISTS = LunaSettings.getBoolean("IndEvo", "IndEvo_DeconIgnoreWhitelists");
    public static final boolean HULLDECON_AUTO_DELIVER_TO_CLOSEST_FORGE = LunaSettings.getBoolean("IndEvo", "IndEvo_hullDecon_autoDeliverToClosestForge");
    public static final int HULLDECON_DAYS_FRIGATE = LunaSettings.getInt("IndEvo", "IndEvo_hullDecon_days_FRIGATE");
    public static final int HULLDECON_DAYS_DESTROYER = LunaSettings.getInt("IndEvo", "IndEvo_hullDecon_days_DESTROYER");
    public static final int HULLDECON_DAYS_CRUISER = LunaSettings.getInt("IndEvo", "IndEvo_hullDecon_days_CRUISER");
    public static final int HULLDECON_DAYS_CAPITAL_SHIP = LunaSettings.getInt("IndEvo", "IndEvo_hullDecon_days_CAPITAL_SHIP");
    public static final boolean HULLFORGE_AUTO_QUEUE_SHIPS_UNTIL_EMPTY = LunaSettings.getBoolean("IndEvo", "IndEvo_hullForge_autoQueueShipsUntilEmpty");
    public static final boolean HULLFORGE_AUTO_DELIVER_TO_CLOSEST_LAB = LunaSettings.getBoolean("IndEvo", "IndEvo_hullForge_autoDeliverToClosestLab");
    public static final int HULLFORGE_DAYS_FRIGATE = LunaSettings.getInt("IndEvo", "IndEvo_hullForge_days_FRIGATE");
    public static final int HULLFORGE_DAYS_DESTROYER = LunaSettings.getInt("IndEvo", "IndEvo_hullForge_days_DESTROYER");
    public static final int HULLFORGE_DAYS_CRUISER = LunaSettings.getInt("IndEvo", "IndEvo_hullForge_days_CRUISER");
    public static final int HULLFORGE_DAYS_CAPITAL_SHIP = LunaSettings.getInt("IndEvo", "IndEvo_hullForge_days_CAPITAL_SHIP");
    public static final int ALPHA_CORE_RUNTIME = LunaSettings.getInt("IndEvo", "IndEvo_alpha_core_runtime");
    public static final int BETA_CORE_RUNTIME = LunaSettings.getInt("IndEvo", "IndEvo_beta_core_runtime");
    public static final int GAMMA_CORE_RUNTIME = LunaSettings.getInt("IndEvo", "IndEvo_gamma_core_runtime");
    public static final int RESTO_FEE_FRIGATE = LunaSettings.getInt("IndEvo", "IndEvo_restoFee_FRIGATE");
    public static final int RESTO_FEE_DESTROYER = LunaSettings.getInt("IndEvo", "IndEvo_restoFee_DESTROYER");
    public static final int RESTO_FEE_CRUISER = LunaSettings.getInt("IndEvo", "IndEvo_restoFee_CRUISER");
    public static final int RESTO_FEE_CAPITAL = LunaSettings.getInt("IndEvo", "IndEvo_restoFee_CAPITAL");
    public static final double DAILY_OFFICER_SPAWN_CHANCE = LunaSettings.getDouble("IndEvo", "IndEvo_dailyOfficerSpawnChance");
    public static final double DAILY_ADMIN_SPAWN_CHANCE = LunaSettings.getDouble("IndEvo", "IndEvo_dailyAdminSpawnChance");
    public static final int PERSONALITY_TRAINING_DAY_COUNT = LunaSettings.getInt("IndEvo", "IndEvo_personalityTrainingDayCount");
    public static final int PERSONALITY_TRAINING_COST = LunaSettings.getInt("IndEvo", "IndEvo_personalityTrainingCost");
    public static final int ADMIN_TRAINING_DAY_COUNT = LunaSettings.getInt("IndEvo", "IndEvo_adminTrainingDayCount");
    public static final int ADMIN_TRAINING_COST = LunaSettings.getInt("IndEvo", "IndEvo_adminTrainingCost");
    public static final int MONTHLY_AI_STORAGE_COST = LunaSettings.getInt("IndEvo", "IndEvo_monthlyAIStorageCost");
    public static final boolean VARIND_DELIVER_TO_PRODUCTION_POINT = LunaSettings.getBoolean("IndEvo", "IndEvo_VarInd_deliverToProductionPoint");
}
