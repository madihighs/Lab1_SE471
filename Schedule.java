import java.time.LocalTime;

public class Schedule {
    private LocalTime start_time;
    private LocalTime end_time;

    /** Constructor*/
    public Schedule(LocalTime start_time, LocalTime end_time) {
        this.start_time = start_time;
        this.end_time = end_time;
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
}
