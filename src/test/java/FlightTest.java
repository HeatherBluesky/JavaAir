import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot Pilot;
    ArrayList<CabinCrewMember> cabinCrewMember;
    ArrayList<Passenger> passenger;
    Plane plane;
    Passenger passenger_1;
    Passenger passenger_2;
    Passenger passenger_3;
    Passenger passenger_4;
    CabinCrewMember member1;
    CabinCrewMember member2;



    @Before
    public void before(){
        flight = new Flight(Pilot, cabinCrewMember, passenger, plane);
        passenger_1 = new Passenger("Harry", 1);
        passenger_2 = new Passenger("Ron", 1);
        passenger_3 = new Passenger("Hermione", 1);

        flight.addPassenger(passenger_1);
        flight.addPassenger(passenger_2);
        flight.addPassenger(passenger_3);
    }

    @Test
    public void canAddPassenger(){
        passenger_4 = new Passenger("Ginny", 3);
        flight.addPassenger(passenger_4);
        assertEquals(4, flight.getPassengerCount());
    }

    @Test
    public void canAddCrew() {
        member1 = new CabinCrewMember("Eve", RankType.PURSER);
        member2 = new CabinCrewMember("Shobian", RankType.FLIGHTATTENDANT);
        flight.addCabinCrewMembers(member1);
        flight.addCabinCrewMembers(member2);
        {
            assertEquals(2, flight.getCabinCrewMembers().size());
            assertEquals(member2, flight.getCabinCrewMembers().get(1));

        }
    }

    @Test
    public void canCountBags(){
        assertEquals(3, flight.getBagCount());
    }
}

