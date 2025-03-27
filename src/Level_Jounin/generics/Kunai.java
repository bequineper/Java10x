package Level_Jounin.generics;

public class Kunai {
    private String name;

    public Kunai() {
    }

    public Kunai(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Kunai name: " + name;
    }
}
