package Level_Jounin.Interfaces;

public class Missions {
    private String name;
    private MissionRank rank;

    public Missions(String name, MissionRank rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MissionRank getRank() {
        return rank;
    }

    public void setRank(MissionRank rank) {
        this.rank = rank;
    }

    public void showdetails() {
        System.out.println("Mission " + name + " Rank " + rank + " Description: " + rank.getDescrition() + " Difficult " + rank.getDifficult());
    }
}
