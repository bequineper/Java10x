package Level_Jounin.generics;

public class Main {
    public static void main(String[] args) {



    NinjaBackpack<Object> backpack = new NinjaBackpack<>();
    backpack.addItem(new Kunai ("Fire Kunai"));
    backpack.addItem(new Shuriken (2));
    backpack.addItem(new parchments ("Invoque Jutsu"));

        System.out.println("Items in our backpack: ");
        backpack.showItem();






















    }
}
