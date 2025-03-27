package Level_Jounin.getters_and_setters;

public abstract class Ninja {
    private String name;
    private String village;
    private int age;
    private int missionNumber;
    private double height = 2.10;

    public Ninja() {
    }

    public Ninja(String name, String village, int age, int missionNumber, double height) {
        this.name = name;
        this.village = village;
        this.age = age;
        this.missionNumber = missionNumber;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMissionNumber() {
        return missionNumber;
    }

    public void setMissionNumber(int missionNumber) {
        this.missionNumber = missionNumber;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
