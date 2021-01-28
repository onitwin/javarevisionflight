import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Passenger pass1;
    private Passenger pass2;
    private Flight flight;

    @Before
    public void before(){
        pass1=new Passenger("Joseph",1,"JS300");
        pass2=new Passenger("Jack",2,"JP200");
        flight=new Flight(Plane.AIRBUSA830, "JS300","Edinburgh","Glasgow","13:00");

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







}
