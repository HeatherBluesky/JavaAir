import java.util.ArrayList;

public class Flight{
    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> bookedPassengers;
    private Plane plane;
    private int totalLuggage;


    public Flight(Pilot pilot, ArrayList<CabinCrewMember> cabinCrewMembers, ArrayList<Passenger> bookedPassengers, Plane plane) {
        this.pilot = pilot;
        this.cabinCrewMembers = cabinCrewMembers;
        this.bookedPassengers = bookedPassengers;
        this.plane = plane;
        this.cabinCrewMembers = new ArrayList<CabinCrewMember>();
        this.bookedPassengers = new ArrayList<Passenger>();

    }
    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public ArrayList<Passenger> getBookedPassengers() {
        return bookedPassengers;
    }

    public Plane getPlane() {
        return plane;
    }
    public void addCabinCrewMembers(CabinCrewMember cabinCrewmember) {
        this.cabinCrewMembers.add(cabinCrewmember);
    }

    public void addPassenger(Passenger passenger) {

        this.bookedPassengers.add(passenger);
    }


    public int getPassengerCount() {

        return this.bookedPassengers.size();
    }

    public int getBagCount(){
        for(Passenger passenger:bookedPassengers  ) {
            totalLuggage += passenger.getNoOfBags();
        }
        return totalLuggage;
    }

}
