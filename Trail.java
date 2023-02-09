import java.awt.*;

public class Trail extends Route{

    private String terrainType;
    private int rating;
    private int difficultyLevel;

    /** Constructor*/
    public Trail(Point start_point, Point end_point, int routeNumber, String name, String terrainType, int rating, int difficultyLevel) {
        super(start_point, end_point, routeNumber, name);
        this.terrainType = terrainType;
        this.rating = rating;
        this.difficultyLevel = difficultyLevel;
    }

    /** Special Functionality*/
    public int currentAltitude(){}

    /** Setters and Getters*/
    public String getTerrainType() {
        return terrainType;
    }

    public void setTerrainType(String terrainType) {
        this.terrainType = terrainType;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}
