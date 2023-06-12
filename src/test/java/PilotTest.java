import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;
    Pilot pilot3;

    @Before
    public void before(){pilot = new Pilot("Rudolph Erasmus", RankType.CAPTAIN, "783525");}
    {pilot3 = new Pilot("steve the pirate", RankType.FLIGHTATTENDANT, "354637");}

    @Test
    public void  pilotHasName(){
        assertEquals("Rudolph Erasmus", pilot.getName());
    }
    @Test
    public void pilotHasARank(){
        assertEquals(RankType.CAPTAIN, pilot.getRank());
    }

    @Test
    public void pilotHasALicenseNum(){
        assertEquals("783525", pilot.getPilotLicense());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("Welcome aboard this transcontinental flight", pilot.isPilotingThisPlane());
    }

    @Test
    public void canLandPlane(){
        assertEquals("Thankyou, for flying with us", pilot.isLandingThisPlane());
    }}
