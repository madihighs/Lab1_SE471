public class Airplane extends Vehicle{

    private String airline;
    private String classTypesAvailable[];

    /** Constructor*/
    public Airplane(String make, String model, int capacity, String airline, String[] classTypesAvailable) {
        super(make, model, capacity);
        this.airline = airline;
        this.classTypesAvailable = classTypesAvailable;
    }

    /** Special Functionality*/
    public void land(){}
    public void takeOff(){}

    /** Setters and Getters*/
    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String[] getClassTypesAvailable() {
        return classTypesAvailable;
    }

    public void setClassTypesAvailable(String[] classTypesAvailable) {
        this.classTypesAvailable = classTypesAvailable;
    }
}
