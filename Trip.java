import java.awt.*;

public class Trip {
    private Point from;
    private Point destination;

    /** Constructor*/
    public Trip(Point from, Point destination) {
        this.from = from;
        this.destination = destination;
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
