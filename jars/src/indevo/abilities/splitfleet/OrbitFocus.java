package indevo.abilities.splitfleet;

import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.campaign.*;
import com.fs.starfarer.api.impl.campaign.ids.Factions;
import com.fs.starfarer.api.impl.campaign.terrain.*;
import com.fs.starfarer.api.util.Misc;
import org.apache.log4j.Logger;
import org.lazywizard.lazylib.VectorUtils;
import org.lwjgl.util.vector.Vector2f;

import java.util.Random;

public class OrbitFocus {

    public static final Logger log = Global.getLogger(OrbitFocus.class);

    public static final float MAXIMUM_DISTANCE_TO_NON_CENTERED_ENTITY = 400f;
    public static final String ORBIT_FOCUS_TAG = "SplinterFleet_OF";

    public static SectorEntityToken getOrbitFocusAtTokenPosition(SectorEntityToken token) {
        LocationAPI location = token.getContainingLocation();
        if (location == null) {
            Global.getLogger(OrbitFocus.class).error("No valid system for orbit focus", new Throwable());
            return null;
        }

        SectorEntityToken orbitFocus = location.addCustomEntity(Misc.genUID(), null, "SplinterFleet_OrbitFocus", Factions.NEUTRAL);
        orbitFocus.setLocation(token.getLocation().x, token.getLocation().y);
        orbitFocus.addTag(ORBIT_FOCUS_TAG);

        if (location.isNebula() || location.isHyperspace()) return orbitFocus;
        StarSystemAPI system = token.getStarSystem();

        for (SectorEntityToken systemEntity : system.getAllEntities()) {
            if (!systemEntity.isStar() && systemEntity instanceof PlanetAPI || systemEntity instanceof JumpPointAPI) {
                //check if there is a planet or JP closer than max dist
                //if there is, orbit it
                float dist = Misc.getDistance(token, systemEntity);
                boolean isInOrbitRange = dist < (systemEntity.getRadius() + MAXIMUM_DISTANCE_TO_NON_CENTERED_ENTITY);

                if (isInOrbitRange) {
                    float orbitDistance = dist < systemEntity.getRadius() ? systemEntity.getRadius() + 100f : dist;

                    OrbitAPI orbit = Global.getFactory().createCircularOrbit(systemEntity, 0f, orbitDistance, systemEntity.getOrbit().getOrbitalPeriod());
                    orbitFocus.setOrbit(orbit);
                    return orbitFocus;
                }
            }
        }

        //if there is not, get the orbit duration of the closest entity orbiting center or sun and use that instead to orbit the center
        SectorEntityToken closestEntity = getClosestEntityWithCenteredOrbit(token);

        float dist = Misc.getDistance(token, system.getCenter());
        float orbitDistance = dist < system.getStar().getRadius() ? system.getStar().getRadius() + 700f : dist; //if player wants to stay in the sun, adjust
        float angle = Misc.getAngleInDegrees(system.getCenter().getLocation(), token.getLocation());
        float orbitPeriod = closestEntity != null ? closestEntity.getCircularOrbitPeriod() : 31f;

        orbitFocus.setCircularOrbit(system.getCenter(), angle, orbitDistance, orbitPeriod);

        return orbitFocus;
    }

    public static SectorEntityToken getHideOrbitFocus(CampaignFleetAPI fleet) {
        LocationAPI system = fleet.getContainingLocation();
        SectorEntityToken hideOrbitFocus = null;

        if (system.isHyperspace()) {
            hideOrbitFocus = system.addCustomEntity(Misc.genUID(), null, "SplinterFleet_OrbitFocus", Factions.NEUTRAL);
            hideOrbitFocus.setLocation(fleet.getLocation().x, fleet.getLocation().y);
            hideOrbitFocus.addTag(ORBIT_FOCUS_TAG);

            return hideOrbitFocus;
        }

        SectorEntityToken orbitFocus = null;
        OrbitAPI bestOrbit = null;
        float orbitRadius = 0f;

        float minDist = Float.MAX_VALUE;

        Vector2f nebulaPos = getClosestNebulaTilePosition(fleet);
        if (nebulaPos != null) {
            minDist = Misc.getDistance(fleet.getLocation(), nebulaPos);
            log.info("system contains nebula, closest tile at " + minDist);
        }

        for (CampaignTerrainAPI terrain : system.getTerrainCopy()) {

            CampaignTerrainPlugin plugin = terrain.getPlugin();
            if (plugin instanceof StarCoronaTerrainPlugin || plugin instanceof PulsarBeamTerrainPlugin || plugin instanceof DebrisFieldTerrainPlugin)
                continue;

            String info = plugin.getNameForTooltip();
            if (info == null) continue;

            //if(plugin.hasAIFlag(TerrainAIFlags.REDUCES_DETECTABILITY) || plugin.hasAIFlag(TerrainAIFlags.HIDING_STATIONARY)){
            if (plugin instanceof BaseRingTerrain) {
                info += " is Ring,";

                //get orbit
                //get ring orbit distance
                //get the closest point on the ring compared to the position of the fleet
                //return that point as focus

                BaseRingTerrain.RingParams params = ((BaseRingTerrain) plugin).getRingParams();

                OrbitAPI orbit = terrain.getOrbit();

                float radius = params.middleRadius;
                SectorEntityToken relatedEntity = params.relatedEntity;

                if (relatedEntity == null) continue;
                if (relatedEntity.getMarket() != null && !relatedEntity.getMarket().isPlanetConditionMarketOnly() && radius < 700f)
                    continue;

                float fleetDistanceToOrbitFocus = Misc.getDistance(fleet, relatedEntity);
                float distanceToRingTerrain;
                if (fleetDistanceToOrbitFocus > radius) distanceToRingTerrain = fleetDistanceToOrbitFocus - radius;
                else distanceToRingTerrain = radius - fleetDistanceToOrbitFocus;

                info += " radius " + radius;
                info += " distance " + distanceToRingTerrain;

                //if there is a market too close by, skip this one, else check if closest entity
                if (distanceToRingTerrain < minDist) {
                    info += " is closest entity, orbit is " + bestOrbit + ", orbit focus is " + orbitFocus;
                    bestOrbit = orbit;
                    orbitFocus = orbit != null ? orbit.getFocus() : relatedEntity;
                    orbitRadius = radius;
                    minDist = distanceToRingTerrain;
                }
            }
            log.info(info);
        }

        if (bestOrbit != null) {
            hideOrbitFocus = system.addCustomEntity(Misc.genUID(), null, "SplinterFleet_OrbitFocus", Factions.NEUTRAL);
            hideOrbitFocus.addTag(ORBIT_FOCUS_TAG);

            float angle = Misc.getAngleInDegrees(orbitFocus.getLocation(), fleet.getLocation());
            hideOrbitFocus.setCircularOrbit(orbitFocus, angle, orbitRadius, bestOrbit.getOrbitalPeriod());

        } else if (nebulaPos != null) {
            hideOrbitFocus = system.addCustomEntity(Misc.genUID(), null, "SplinterFleet_OrbitFocus", Factions.NEUTRAL);
            hideOrbitFocus.setLocation(nebulaPos.x, nebulaPos.y);
            hideOrbitFocus.addTag(ORBIT_FOCUS_TAG);
        }

        if (hideOrbitFocus != null) return hideOrbitFocus;
        else return getAlternateHidingPosition(fleet);
    }

    /*
    Finds Vector2f of the center of the closest tile to the given token
    Rubi made this I have absolutely no idea how it works
    */
    public static Vector2f getClosestNebulaTilePosition(SectorEntityToken toToken) {
        for (CampaignTerrainAPI terrain : toToken.getContainingLocation().getTerrainCopy()) {
            if (terrain.getPlugin() instanceof NebulaTerrainPlugin) {
                float minDist = -1f;
                int tileI = -1;
                int tileJ = -1;
                NebulaTerrainPlugin ntp = (NebulaTerrainPlugin) terrain.getPlugin();
                int[][] tiles = ntp.getTiles();
                for (int i = 0; i < tiles.length; i++) { // x
                    for (int j = 0; j < tiles[0].length; j++) { // y
                        // I think this checks if the tile is actually a nebula
                        if (tiles[i][j] > 0) {
                            float[] f = ntp.getTileCenter(i, j);
                            Vector2f loc = new Vector2f(f[0], f[1]);
                            float dist = Misc.getDistance(toToken.getLocation(), loc);
                            if (minDist == -1f || dist < minDist) {
                                minDist = dist;
                                tileI = i;
                                tileJ = j;
                            }
                        }
                    }
                }
                float[] closestTileCenter = ntp.getTileCenter(tileI, tileJ);
                Vector2f loc = new Vector2f(closestTileCenter[0], closestTileCenter[1]);
                return loc;
            }
        }
        return null;
    }


    public static SectorEntityToken getAlternateHidingPosition(CampaignFleetAPI fleet) {
        /*Get a position behind the outer jump point. If there are no jump points, stay in place.

        You have location of star (point), location of jump point (point), thus have a vector A (point a, point b).
        Normalise this vector to have a unit vector (vector B).
        Randomize slightly direction of this unit vector if needed.
        Pick distance from jump point C.
        Multiply vector B by this scalar so you have vector D.
        Now your position is either jump point location shifted by vector D, or end of vector A + D.

        thanks jaghaimo
         */

        LocationAPI location = fleet.getContainingLocation();
        SectorEntityToken orbitFocus = location.addCustomEntity(null, null, "SplinterFleet_OrbitFocus", "neutral");
        orbitFocus.addTag(ORBIT_FOCUS_TAG);

        if (location.isHyperspace()) return orbitFocus;

        StarSystemAPI system = fleet.getStarSystem();

        //get outer JP
        SectorEntityToken center = system.getCenter();
        SectorEntityToken outerJP = null;
        float maxDist = Float.MIN_VALUE;

        for (SectorEntityToken jp : system.getJumpPoints()) {
            float dist = Misc.getDistance(center, jp);
            if (dist > maxDist) {
                outerJP = jp;
                maxDist = dist;
            }
        }

        if (outerJP != null) {
            //get the vector pointing from star to jump point
            Vector2f centerToJP = VectorUtils.getDirectionalVector(center.getLocation(), outerJP.getLocation());
            centerToJP.normalise();

            //Add random number to y to slightly move the direction it is pointing to
            Random rand = new Random();
            float randPosAmtY = rand.nextFloat() * 20 * (rand.nextBoolean() ? -1f : 1f); // TODO: 15.12.2021 check how much this actually changes the direction when scaled
            centerToJP.y += randPosAmtY;

            //magnitude of vector should be distance between center and JP + random amount
            //since vector is normalized (magnitude 1), multiplying it with above will give us the distance we want
            float randPosAmtX = 500f + (rand.nextFloat() * 500f);
            centerToJP.scale(maxDist + randPosAmtX);

            orbitFocus.setFixedLocation(centerToJP.x, centerToJP.y);

        } else orbitFocus.setFixedLocation(fleet.getLocation().x, fleet.getLocation().y);

        float dist = Misc.getDistance(orbitFocus, system.getCenter());
        float orbitDistance = system.getStar() != null && dist < system.getStar().getRadius() ? system.getStar().getRadius() + 700f : dist;
        float angle = Misc.getAngleInDegrees(system.getCenter().getLocation(), orbitFocus.getLocation());
        float orbitPeriod = 0f;

        SectorEntityToken closestEntity = getClosestEntityWithCenteredOrbit(orbitFocus);

        //add an orbit if there is any other object that orbits the center in the system, else stay still
        if (outerJP != null) orbitPeriod = outerJP.getCircularOrbitPeriod();
        else if (closestEntity != null) orbitPeriod = closestEntity.getCircularOrbitPeriod();
        if (orbitPeriod != 0f) orbitFocus.setCircularOrbit(system.getCenter(), angle, orbitDistance, orbitPeriod);

        return orbitFocus;
    }

    public static SectorEntityToken getClosestEntityWithCenteredOrbit(SectorEntityToken toToken) {
        StarSystemAPI system = toToken.getStarSystem();
        SectorEntityToken closestEntity = null;
        float minDist = Float.MAX_VALUE;

        for (SectorEntityToken entity : system.getAllEntities()) {
            if (entity.getOrbit() != null && entity.getOrbitFocus() != null) {
                String id = entity.getOrbitFocus().getId();
                boolean orbitFocusIsStarOrSystemCenter = id.equals(system.getCenter().getId()) || (system.getStar() != null && id.equals(system.getStar().getId()));

                if (!orbitFocusIsStarOrSystemCenter) continue;

                float dist = Misc.getDistance(toToken, entity);
                if (dist < minDist) {
                    closestEntity = entity;
                    minDist = dist;
                }
            }
        }

        return closestEntity;
    }

}
