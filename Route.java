import java.awt.*;

public class Route {

    private Point start_point;
    private Point end_point;
    private Point currentPosition;
    private int routeNumber;
    private String routeName;

    /** Constructor*/
    public Route(Point start_point, Point end_point, int routeNumber, String name) {
        this.start_point = start_point;
        this.end_point = end_point;
        this.routeNumber = routeNumber;
        this.routeName = name;
    }

    /** Special Functionality*/
    public Route reRoute(){}
    public void addStop(){}
    public double routeProgress(){}
    public double eta(){}


    /** Setters and Getters*/
    public Point getStart_point() {
        return start_point;
    }

    public void setStart_point(Point start_point) {
        this.start_point = start_point;
    }

    public Point getEnd_point() {
        return end_point;
    }

    public void setEnd_point(Point end_point) {
        this.end_point = end_point;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public Point getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Point currentPosition) {
        this.currentPosition = currentPosition;
    }
}
