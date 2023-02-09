public class TourBus extends Bus{

    private String tourScript;
    private String guideName;

    /** Constructor*/
    public TourBus(String make, String model, int capacity, int busID, int plateNO, String busDriver, String city, String tourScript, String guideName) {
        super(make, model, capacity, busID, plateNO, busDriver, city);
        this.tourScript = tourScript;
        this.guideName = guideName;
    }

    /** Special Functionality*/
    public void generateTicket(){}

    /** Setters and Getters*/
    public String getTourScript() {
        return tourScript;
    }

    public void setTourScript(String tourScript) {
        this.tourScript = tourScript;
    }

    public String getGuideName() {
        return guideName;
    }

    public void setGuideName(String guideName) {
        this.guideName = guideName;
    }
}
