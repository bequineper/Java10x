package Level_Genin.conditions;
import java.util.Scanner;

public class userScanner {
    public static void main(String[] args) {

        /*
        * Scanner = A way to bring the user to an app
        * Objective = The user will crate a ninja, and we will validate the data
        * */



        System.out.println("Write the Ninja Name: ");
        // Open Scanner
        Scanner textbox = new Scanner(System.in);
        String ninjaName = textbox.nextLine();

        System.out.println("Write here the ninja age: ");
        byte ninjaAge = textbox.nextByte();

        String minorAge;

        if (ninjaAge >= 18) {
            minorAge = "of legal age";
        }
        else {
            minorAge = "Underage";
        }


        System.out.println(
                "The Ninja " + ninjaName + " is " + minorAge);



        // Always close the scanner
        textbox.close();


    }
}
