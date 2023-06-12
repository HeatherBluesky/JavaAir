import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;
    CabinCrewMember flightAttendant;
    CabinCrewMember purser;

    @Before
    public void before(){cabinCrewMember = new CabinCrewMember("Sam McKeon", RankType.CAPTAIN);}
    {flightAttendant = new CabinCrewMember("Claire Miller", RankType.FLIGHTATTENDANT);}
    {purser = new CabinCrewMember("Lin Shaye", RankType.PURSER);}


    @Test
    public void crewMemberHasName(){
        assertEquals("Sam McKeon", cabinCrewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(RankType.CAPTAIN, cabinCrewMember.getRank());
    }
    @Test
    public void hasFlightAttendantRank(){
        assertEquals(RankType.FLIGHTATTENDANT, flightAttendant.getRank());
    }
    @Test
    public void hasPurserRank(){
        assertEquals(RankType.PURSER, purser.getRank());
    }

    @Test
    public void canMakeAnnouncement(){
        assertEquals("The exists are located at the front, middle and rear of the plane", cabinCrewMember.makeAnnouncement("The exists are located at the front, middle and rear of the plane"));
    }
}
