public class CabinCrewMember {
    private String name;
    private RankType rank;
    private String announcement;

    public CabinCrewMember(String name, RankType rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }
    public String getCrewMemberName(){return name;}

    public RankType getRank() {
        return rank;
    }

    public String makeAnnouncement(String newAnnouncement) {
        return announcement = newAnnouncement;
    }
}
