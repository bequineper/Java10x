package tests.battlesimulator;

public class enemys {
    String name;
    int health;
    int damage;
    char rank;


    public enemys(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.rank = defineRank();
    }


    public char defineRank() {
        int totalPower = health + damage;

        if (totalPower <= 100) {
            rank = 'C';
        } else if (totalPower <= 150) {
            rank = 'B';
        } else if (totalPower <= 200) {
            rank = 'A';
        } else {
            rank = 'S';
        }

        return rank;
    }
}