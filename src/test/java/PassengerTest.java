import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    private Passenger pass1;
    private Passenger pass2;

    @Before
    public void before(){
        pass1=new Passenger("Joseph",1,"JS300");
        pass2=new Passenger("Jack",2,"JP200");

    }

    @Test
    public void canGetName(){
        assertEquals("Joseph",pass1.getName());
    }

    @Test
    public void canGetNumberOfBags(){
        assertEquals(1,pass1.getBags());
    }

    @Test
    public void canGetFlightNumber(){
        assertEquals("JP200",pass2.getFlightNumber());
    }
}