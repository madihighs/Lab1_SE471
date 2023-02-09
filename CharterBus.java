public class CharterBus extends Bus{

    private String companyName;

    /** Full Constructor*/
    public CharterBus(String make, String model, int capacity, int busID, int plateNO, String busDriver, String city, String companyName) {
        super(make, model, capacity, busID, plateNO, busDriver, city);
        this.companyName = companyName;
    }

    /** Special Functionality*/
    public void loadLuggage(){}

    /** Setters and Getters*/
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


}
