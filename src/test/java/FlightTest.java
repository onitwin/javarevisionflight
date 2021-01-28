import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Passenger pass1;
    private Passenger pass2;
    private Flight flight;
    private Flight flight2;

    @Before
    public void before(){
        pass1=new Passenger("Joseph",1,"JS300");
        pass2=new Passenger("Jack",2,"JP200");
        flight=new Flight(Plane.AIRBUSA830, "JS300","Edinburgh","Glasgow","13:00");
        flight2=new Flight(Plane.CESSNA172, "JP200","Glasgow", "Ebinburgh", "14:00");

    }

    @Test
    public void canGetPlane(){
        assertEquals(Plane.AIRBUSA830, flight.getPlane());
    }

    @Test
    public void canGetFlightNumber(){
        assertEquals("JS300",flight.getFlightNumber());
    }

    @Test
    public void canGetDestination(){
        assertEquals("Edinburgh",flight.getDestination());
    }

    @Test
    public void canGetDepartureAirport(){
        assertEquals("Glasgow",flight.getDepartureAirport());
    }

    @Test
    public void canGetDepartureTime(){
        assertEquals("13:00", flight.getDepartureTime());
    }

    @Test
    public void getAvailableSeats(){
        assertEquals(20, flight.getAvailableSeats());
    }

    @Test
    public void getNumberOfPassengers(){
        assertEquals(0,flight.getNumberOfPassengers());
    }

    @Test
    public void canAddPassenger(){
        assertEquals(0,flight.getNumberOfPassengers());
        flight.addPassenger(pass1);
        assertEquals(1,flight.getNumberOfPassengers());
    }

    @Test
    public void ifSeatsAvailableAddPassenger(){
        assertEquals(0,flight.getNumberOfPassengers());
        flight.bookIfSeatsAvailable(pass2);
        assertEquals(1,flight.getNumberOfPassengers());
    }

    @Test
    public void rejectPassengerIfFull(){
        flight2.bookIfSeatsAvailable(pass2);
        flight2.bookIfSeatsAvailable(pass1);
        flight2.bookIfSeatsAvailable(pass1);
        assertEquals(3,flight2.getNumberOfPassengers());
        flight2.bookIfSeatsAvailable(pass2);
        assertEquals(3,flight2.getNumberOfPassengers());
    }










}
