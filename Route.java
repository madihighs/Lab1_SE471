public class Route {
    private static int start_point;
    private static int end_point;
    private static int number;
    private static String name;

    protected static void reRoute(){}
    protected static void addStop(){}
    protected static void routeProgress(){}
    protected static void eta(){}
    protected static void main(String[] args){}

}

class Trail extends Route {
    private String terrainType;
    private int rating;
    private int difficultyLevel;
    public void currentAltitude(){}

}

class Highway extends Route{
    private boolean isTollRoad;
    private int speedLimit;

    public void getSpeedLimit(){}
}

class Flight extends Route{
    private int boardingTime;
    private int gateNum;
    private String airportName;

    public void getSeatAssignment(){}
}
