public class Vehicle {
    private String make;
    private String model;
    private int capacity;

    /** Constructor*/
    public Vehicle(String make, String model, int capacity) {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
    }

    /** Special Functionality*/
    public void scanTicket(){}
    public double calcPrice(){}
    public boolean isAtCapacity(){}


    /** Setters and Getters*/
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
