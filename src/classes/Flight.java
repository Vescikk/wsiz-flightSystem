package classes;

public class Flight  {

    private float ticketPrice;

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    // private String passengerList; ??
    private int totalSeats;

    public int getFreeSeats() {
        return freeSeats;
    }

    public void setFreeSeats(int freeSeats) {
        this.freeSeats = freeSeats;
    }

    private int freeSeats;
    private String flightId;

    private String from_location;
    private String to_location;
    private String flightDepartureDate;
    private String flightArrivalDate;
    public  String[] passengersList;



    public String getFrom_location() {
        System.out.println(from_location);
        return from_location;
    }

    public Flight(){
        ticketPrice = 0;
        totalSeats = 0;
        flightId = "undefined";
        from_location = "undefined";
        to_location = "undefined";
        flightDepartureDate = "Undefined";
        flightArrivalDate = "Undefined";
    }

    public Flight(float ticketPrice, int totalSeats, String flightId, String from_location,
                  String to_location, String flightDepartureDate, String flightArrivalDate) {

        setValues(ticketPrice, totalSeats, flightId,from_location,to_location,flightDepartureDate,flightArrivalDate);
    }

    public void setValues(float ticketPrice, int totalSeats, String flightId, String from_location,
                          String to_location, String flightDepartureDate, String flightArrivalDate) {
        this.ticketPrice = ticketPrice;
        this.totalSeats = totalSeats;
        this.flightId = flightId;
        this.from_location = from_location;
        this.to_location = to_location;
        this.flightDepartureDate = flightDepartureDate;
        this.flightArrivalDate = flightArrivalDate;
    }

}