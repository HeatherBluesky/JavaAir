import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane("Hiss" , PlaneCapacity.BOEING747, PlaneWeight.BOEING747);}

    @Test
    public void canGetPlaneCapacity(){
        assertEquals(416, PlaneCapacity.BOEING747.getCapacity());
    }
    @Test
    public void canGetPlaneWeight(){
        assertEquals(18500.00, PlaneWeight.BOEING747.getWeight(), 0.0);
    }

    @Test
    public void canGetPlaneName(){
        assertEquals("Hiss", plane.getName());
    }
}
