package airline.reservation.system;

public class Flight {
    //Initializing instance variables 
    private String flight_id;
    private String source;
    private String destination;
    private String date;
    private String departure_time;
    private String plane_id;
    private int no_of_seats;
    
    //Constructors 
    
    public Flight(String flight_id,String source,String destination,String date,String time,String plane_id,int no_of_seats){
        this.flight_id = flight_id;
        this.source = source;
        this.destination = destination;
        this.date = date;
        this.departure_time = time;
        this.plane_id = plane_id;
        this.no_of_seats = no_of_seats;
    }
    
    public Flight(String flight_id,String source,String destination,String date,String time,int no_of_seats){
        this.flight_id = flight_id;
        this.source = source;
        this.destination = destination;
        this.date = date;
        this.departure_time = time;
        this.no_of_seats = no_of_seats;
    }
    
    //getters and setters

    public String getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(String flight_id) {
        this.flight_id = flight_id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public String getPlane_id() {
        return plane_id;
    }

    public void setPlane_id(String plane_id) {
        this.plane_id = plane_id;
    }

    public int getNo_of_seats() {
        return no_of_seats;
    }

    public void setNo_of_seats(int no_of_seats) {
        this.no_of_seats = no_of_seats;
    }

    @Override
    public String toString() {
        return "Flight{" + "flight_id=" + flight_id + ", source=" + source + ", destination=" + destination + ", date=" + date + ", departure_time=" + departure_time + ", no_of_seats=" + no_of_seats + '}';
    }
         
    
    
}
