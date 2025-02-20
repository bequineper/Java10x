package Level_Genin.conditions;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {


        /*
        * SwitchCases: Make specific cases
        * Objective: Ask to the user choice a ninja
        * */


        Scanner scanner = new Scanner(System.in);




        System.out.println("Choice a character: ");
        System.out.println("1 - Naruto ");
        System.out.println("2 - Sasuke ");
        System.out.println("3 - Sakura ");


        int userChoice = scanner.nextInt();
        System.out.println("You choice the number " + userChoice);

        switch (userChoice) {
            case 1:
                System.out.println("User choice Naruto");
                break;

            case 2:
                System.out.println("User choice Sasuke");
                break;

            case 3:
                System.out.println("User choice Sakura");
                break;

            default:
                System.out.println(userChoice + " is not a valid answer, try again");

        }


        scanner.close();


    }
}
