public class Bus extends Vehicle{

    private int BusID;
    private int plateNO;
    private String busDriver;
    private String city;

    /** Constructor*/
    public Bus(String make, String model, int capacity, int busID, int plateNO, String busDriver, String city) {
        super(make, model, capacity);
        BusID = busID;
        this.plateNO = plateNO;
        this.busDriver = busDriver;
        this.city = city;
    }

    /** Special Functionality*/
    public boolean isOpen(){}
    public void stop(){}
    public void go(){}

    /** Setters and Getters*/
    public int getBusID() {
        return BusID;
    }

    public void setBusID(int busID) {
        BusID = busID;
    }

    public int getPlateNO() {
        return plateNO;
    }

    public void setPlateNO(int plateNO) {
        this.plateNO = plateNO;
    }

    public String getBusDriver() {
        return busDriver;
    }

    public void setBusDriver(String busDriver) {
        this.busDriver = busDriver;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
