public class ExpressBus extends Bus {

    private String parkNRideLocation;

    /** Constructor*/
    public ExpressBus(String make, String model, int capacity, int busID, int plateNO, String busDriver, String city, String parkNRideLocation) {
        super(make, model, capacity, busID, plateNO, busDriver, city);
        this.parkNRideLocation = parkNRideLocation;
    }

    /** Special Functionality*/
    public void generateTicket(){}
    public void loadLuggage(){}

    /** Setters and Getters*/
    public String getParkNRideLocation() {
        return parkNRideLocation;
    }

    public void setParkNRideLocation(String parkNRideLocation) {
        this.parkNRideLocation = parkNRideLocation;
    }
}
