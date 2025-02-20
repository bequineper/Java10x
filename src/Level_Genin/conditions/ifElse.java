package Level_Genin.conditions;

public class ifElse {
    public static void main(String[] args) {

        /*
        *
        * Objective: Level up ninja, according missionNumber
        * */




    String name = "Naruto Uzumaki";
    int age = 16;
    boolean hokage = false;
    short missionNumber = 4;

        if (missionNumber > 10) {
            System.out.println("Naruto is Ready to level up");
        }
        else if (missionNumber > 5){
            System.out.println("Naruto can be a trainee");
        }
        else {
            System.out.println("Naruto have to practice");
        }




    }
}
