package Level_Jounin.generics;

public class Shuriken {
    private int height;

    public Shuriken(int height) {
        this.height = height;
    }
    public Shuriken() {
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Shuriken height: " + height;
    }
}
