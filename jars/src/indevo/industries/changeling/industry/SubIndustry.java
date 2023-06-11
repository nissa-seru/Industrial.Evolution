package indevo.industries.changeling.industry;

import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.campaign.econ.MarketAPI;
import com.fs.starfarer.api.loading.Description;

public abstract class SubIndustry implements SubIndustryAPI {
    public static final float BASE_COST = 50000;
    public static final float BASE_BUILD_TIME = 31;

    protected String id;
    protected String imageName;
    protected String name;
    protected String descriptionID;
    protected float cost;
    protected float buildTime;

    public SubIndustry(String id, String imageName, String name, String descriptionID) {
        this.id = id;
        this.imageName = imageName;
        this.name = name;
        this.descriptionID = descriptionID;
        this.cost = BASE_COST;
        this.buildTime = BASE_BUILD_TIME;
    }

    public SubIndustry(String id, String imageName, String name, String descriptionID, float cost, float buildTime) {
        this.id = id;
        this.imageName = imageName;
        this.name = name;
        this.descriptionID = descriptionID;
        this.cost = cost;
        this.buildTime = buildTime;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getImageName(MarketAPI market) {
        return imageName;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public Description getDescription() {
        return Global.getSettings().getDescription(descriptionID, Description.Type.CUSTOM);
    }

    @Override
    public boolean isBase() {
        return false;
    }

    @Override
    public float getCost() {
        return cost;
    }

    @Override
    public float getBuildTime() {
        return buildTime;
    }

    @Override
    public boolean isAvailableToBuild() {
        return true;
    }

    @Override
    public String getUnavailableReason() {
        return "Can not be built here";
    }
}
