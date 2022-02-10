package classes;

public class Flight  {

    private float ticketPrice;

    public String getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(String totalSeats) {
        this.totalSeats = totalSeats;
    }

    // private String passengerList; ??
    private String totalSeats;

    public int getFreeSeats() {
        return freeSeats;
    }

    public void setFreeSeats(int freeSeats) {
        this.freeSeats = freeSeats;
    }

    private int freeSeats;
    private String flightId;

    private String from_location;

    public String getTo_location() {
        return to_location;
    }

    public void setTo_location(String to_location) {
        this.to_location = to_location;
    }

    private String to_location;

    public String getFlightDepartureDate() {
        return flightDepartureDate;
    }

    public void setFlightDepartureDate(String flightDepartureDate) {
        this.flightDepartureDate = flightDepartureDate;
    }

    private String flightDepartureDate;

    public String getFlightArrivalDate() {
        return flightArrivalDate;
    }

    public void setFlightArrivalDate(String flightArrivalDate) {
        this.flightArrivalDate = flightArrivalDate;
    }

    private String flightArrivalDate;
    public  String[] passengersList;



    public String getFrom_location() {
        System.out.println(from_location);
        return from_location;
    }

    public Flight(){
        ticketPrice = 0;
        totalSeats = "undefined";
        flightId = "undefined";
        from_location = "undefined";
        to_location = "undefined";
        flightDepartureDate = "Undefined";
        flightArrivalDate = "Undefined";
    }

    public Flight(float ticketPrice, String totalSeats, String flightId, String from_location,
                  String to_location, String flightDepartureDate, String flightArrivalDate) {

        setValues(ticketPrice, totalSeats, flightId,from_location,to_location,flightDepartureDate,flightArrivalDate);
    }

    public void setValues(float ticketPrice, String totalSeats, String flightId, String from_location,
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