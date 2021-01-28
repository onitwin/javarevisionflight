public class Passenger {
    private String name;
    private int bags;
    private String flightNumber;


    public Passenger(String name,int bags,String flightNumber){
        this.name=name;
        this.bags=bags;
        this.flightNumber=flightNumber;
    }

    public String getName() {
        return name;
    }

    public int getBags() {
        return bags;
    }

    public String getFlightNumber() {
        return flightNumber;
    }
}