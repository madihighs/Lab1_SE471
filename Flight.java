import java.awt.*;
import java.time.LocalTime;

public class Flight extends Route{

    private LocalTime boardingTime;
    private int gateNum;
    private String airportName;

    /** Constructor*/
    public Flight(Point start_point, Point end_point, int routeNumber, String name, LocalTime boardingTime, int gateNum, String airportName) {
        super(start_point, end_point, routeNumber, name);
        this.boardingTime = boardingTime;
        this.gateNum = gateNum;
        this.airportName = airportName;
    }

    /** Special Functionality*/
    public int getSeatAssignment(){}

    /** Setters and Getters*/
    public LocalTime getBoardingTime() {
        return boardingTime;
    }

    public void setBoardingTime(LocalTime boardingTime) {
        this.boardingTime = boardingTime;
    }

    public int getGateNum() {
        return gateNum;
    }

    public void setGateNum(int gateNum) {
        this.gateNum = gateNum;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }
}
