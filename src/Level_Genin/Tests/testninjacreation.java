package Level_Genin.Tests;

import java.util.Scanner;

public class testninjacreation {
    public static void main(String[] args) {

        /*
        * Objective: Ask the user to create a ninja(name and chakra)
        * Objective+ : Use and if-else statement to assign them a rank based o their chackra
        *
        * */


        System.out.println("Welcome to the ninja creator, are you ready? :D ");
        System.out.println("--------------------------------------------------------------------");

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("First, write ur ninja name:");
        Scanner ninja = new Scanner(System.in);
        String ninjaName = ninja.nextLine();

        System.out.println("Great! " + ninjaName + " is a great name!");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Now, write how many chackra ur ninja have:" +
                "\n(Example -> Ino Yamanaka has 327 chackra and she's a chunnin)");
        System.out.println(" ");

        short ninjaChackra = ninja.nextShort();

        System.out.println(" ");
        System.out.println("Amazing, so, ur ninja's name is " + ninjaName +
                "\nand have " + ninjaChackra + " chackra points!");
        System.out.println("---------------------------------------------------------------");

        if (ninjaChackra < 300 ) {
            System.out.println(ninjaName + " is still a Gennin, have to practice more!");
        }

        else if (ninjaChackra < 500 ) {
            System.out.println(ninjaName + " is already a Chunnin, just a little bit missing!");

        }

        else if (ninjaChackra < 1000){
            System.out.println(ninjaName + " is a Jounin, very very strong!");

        }
        else {
            System.out.println("Congratulations!!! ---> " + ninjaName + " is ready to be a Hokage!");
            System.out.println(" ");
            System.out.println("Do you wanna evolve " + ninjaName + "to a hokage? ( y/n only )");

            while (true) {

                char evolve = ninja.next().charAt(0);

                if (evolve == 'y' || evolve == 'Y') {
                    System.out.println(ninjaName + " has evolved to Hokage! Believe it!");
                    break;

                } else if (evolve == 'n' || evolve == 'N') {
                    System.out.println(ninjaName + " will remain at their current rank. Keep working hard!");
                    break;

                } else {
                    System.out.println("I didn't understand your answer, can you repeat?");

                }
            }

        }












    }
}
