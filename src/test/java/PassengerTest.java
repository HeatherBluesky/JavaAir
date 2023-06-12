import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Sean Jones", 2);
    }
    @Test
    public void hasName(){
        assertEquals( "Sean Jones", passenger.getName());
    }

    @Test
    public void hasBags(){
        assertEquals(2, passenger.getNoOfBags());
    }
}
