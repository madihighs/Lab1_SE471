import java.awt.*;

public class Highway extends Route{

    private boolean isTollRoad;
    private int speedLimit;

    /** Constructor*/
    public Highway(Point start_point, Point end_point, int routeNumber, String name, boolean isTollRoad, int speedLimit) {
        super(start_point, end_point, routeNumber, name);
        this.isTollRoad = isTollRoad;
        this.speedLimit = speedLimit;
    }

    /** Setters and Getters*/
    public boolean isTollRoad() {
        return isTollRoad;
    }

    public void setTollRoad(boolean tollRoad) {
        isTollRoad = tollRoad;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }
}
