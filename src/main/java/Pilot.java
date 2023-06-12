public class Pilot extends CabinCrewMember{
    private String name;
    private RankType rank;
    private String pilotLicense;

    public Pilot(String name, RankType rank, String pilotLicense) {
        super(name, rank);
        this.name = name;
        this.rank = rank;
        this.pilotLicense = pilotLicense;
    }

    public String getPilotLicense() {
        return pilotLicense;
    }


    public String isPilotingThisPlane() {
            return "Welcome aboard this transcontinental flight";}

    public String isLandingThisPlane() {
        return "Thankyou, for flying with us";}
}
