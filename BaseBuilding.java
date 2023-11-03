package SpaceGame;

public class BaseBuilding {
    private String name;
    private int level;
    private double constructionTime;
    private double metalRequired;
    private double crystalRequired;
    private double gasRequired;
    private double uraniumRequired;

    public BaseBuilding(String name, int level, double constructionTime, double metalRequired, double crystalRequired, double gasRequired, double uraniumRequired) {
        this.name = name;
        this.level = level;
        this.constructionTime = constructionTime;
        this.metalRequired = metalRequired;
        this.crystalRequired = crystalRequired;
        this.gasRequired = gasRequired;
        this.uraniumRequired = uraniumRequired;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public double getConstructionTime() {
        return constructionTime;
    }

    public double getMetalRequired() {
        return metalRequired;
    }

    public double getCrystalRequired() {
        return crystalRequired;
    }

    public double getGasRequired() {
        return gasRequired;
    }

    public double getUraniumRequired() {
        return uraniumRequired;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setConstructionTime(double constructionTime) {
        this.constructionTime = constructionTime;
    }

    public void setMetalRequired(double metalRequired) {
        this.metalRequired = metalRequired;
    }

    public void setCrystalRequired(double crystalRequired) {
        this.crystalRequired = crystalRequired;
    }

    public void setGasRequired(double gasRequired) {
        this.gasRequired = gasRequired;
    }

    public void setUraniumRequired(double uraniumRequired) {
        this.uraniumRequired = uraniumRequired;

       
    }
}
