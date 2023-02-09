import java.awt.*;

public class Trip {
    private Point from;
    private Point destination;
    private Schedule schedules[];

    /** Constructor*/
    public Trip(Point from, Point destination, Schedule[] schedules) {
        this.from = from;
        this.destination = destination;
        this.schedules = schedules;
    }

    /** Setters and Getters*/
    public Point getFrom() {
        return from;
    }

    public void setFrom(Point from) {
        this.from = from;
    }

    public Point getDestination() {
        return destination;
    }

    public void setDestination(Point destination) {
        this.destination = destination;
    }
}
