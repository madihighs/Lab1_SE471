import java.time.LocalTime;
import java.util.Date;

public class Schedule {
    private LocalTime start_time;
    private LocalTime end_time;
    private Date date;
    private Route route;
    private Vehicle vehicle;
    private Trip trip;

    /** Constructor*/
    public Schedule(LocalTime start_time, LocalTime end_time, Date date, Route route, Vehicle vehicle, Trip trip) {
        this.start_time = start_time;
        this.end_time = end_time;
        this.date = date;
        this.route = route; //Should a getter and setter be created for each of these objects within Schedule class?
        this.vehicle = vehicle;
        this.trip = trip;
    }

    /** Getters and Setters*/
    public LocalTime getStart_time() {
        return start_time;
    }

    public void setStart_time(LocalTime start_time) {
        this.start_time = start_time;
    }

    public LocalTime getEnd_time() {
        return end_time;
    }

    public void setEnd_time(LocalTime end_time) {
        this.end_time = end_time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
