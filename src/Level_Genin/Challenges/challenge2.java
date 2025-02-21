package Level_Genin.Challenges;

import Level_Genin.TiposDeDados.Array;

import java.util.Scanner;

public class challenge2 {
    public static void main(String[] args) {

       /*
        // System objective: Register how many ninjas the user wants.
        // By: Bernardo Quineper 20/02/2025
        // Version 1.0
        // Commit: ESSA BOSTA RODOU DE PRIMEIRA KKKKKKKKKKK VSF ACHEI QUE IA QUEBRAR, E NO FIM DEU CERTINHO PERFEITO
        // COMO EU IMAGINEI
       */

        System.out.println("Welcome to the ninja creator, the official Konoha \n" +
                "software to register ninjas!");
        System.out.println("----------------------------------------------------------");
        Scanner ninjainput = new Scanner(System.in) ;

        boolean stop = false;
        boolean stop2 = false;
        boolean stop3 = false;
        boolean stop4 = false;
        boolean stop5 = false;
        boolean stop6 = false;
        boolean stop7 = false;


        while (!stop) {

            System.out.println("Do you wanna create ninjas? (Y/N)");
            while (!stop2) {
                char createninjas = ninjainput.next().charAt(0);
//                --------------------------------------------------------------------------------------------------
//              OPTION 1: YES
                if (createninjas == 'y' || createninjas == 'Y') {

                    System.out.println("How many ninjas you wanna create? (Only numbers)");
                    int numberninjas = ninjainput.nextInt();

                    if (numberninjas > 0) {
                        String[] ninjasnames = new String[numberninjas];

                        for (int i = 0; i < numberninjas; i++) {
                            System.out.println("Write the Ninja-" + i + " name: ");
                            ninjasnames[i] = ninjainput.next();
                            System.out.println(" ");
                        }

                        System.out.println("Congratulations! You registered all " + numberninjas + " ninjas! \n" +
                                "Do you want to list them? (y/n)");

                        while (!stop4) {
                            char listninjas = ninjainput.next().charAt(0);
                            if (listninjas == 'y' || listninjas == 'Y') {
                                System.out.println("Great! Let's do this!");
                                System.out.println("------------------------------------------------------------------------");
                                for (int i = 0; i < numberninjas; i++) {
                                    System.out.println("Ninja " + i + ": " + ninjasnames[i]);
                                }
                                System.out.println("------------------------------------------------------------------------");
                                System.out.println("Here's all your ninjas! Do wanna start at begin again?(y/n)");
                                while (!stop6) {
                                    char restart = ninjainput.next().charAt(0);
                                    if (restart == 'y' || restart == 'Y') {
                                        System.out.println("Welcome to the ninja creator, the official Konoha \n" +
                                                "software to register ninjas!");
                                        System.out.println("----------------------------------------------------------");
                                        break;
                                    } else if (restart == 'n' || restart == 'N') {
                                        while (!stop7) {
                                            System.out.println("Do you wanna close the software? (Y/N)");
                                            char close = ninjainput.next().charAt(0);
                                            if (close == 'y' || close == 'Y') {
                                                System.out.println("Sistem Closing...");
                                                stop = true;
                                                break;
                                            } else if (close == 'n' || close == 'N') {
                                                System.out.println("So, do you restart at the begin?");
                                                break;
                                            } else {
                                                System.out.println("I didn't understand your answer, I'm gonna repeat");
                                                System.out.println(" ");
                                            }
                                        }
                                    } else {
                                        System.out.println("I didn't understand your answer, can you repeat please?");
                                    }


                                }
                                break;
                            } else if (listninjas == 'n' || listninjas == 'N') {
                                System.out.println("Do you wanna close the software? (Y/N)");
                                while (!stop5) {
                                    char close = ninjainput.next().charAt(0);
                                    if (close == 'y' || close == 'Y') {
                                        System.out.println("Sistem Closing...");
                                        stop = true;
                                        break;
                                    } else if (close == 'n' || close == 'N') {
                                        System.out.println("So, do you want to list them?");
                                        break;
                                    } else {
                                        System.out.println("I didn't understand your answer, can you repeat please?");
                                    }
                                }
                            } else {
                                System.out.println("I didn't understand your answer, can you repeat please?");
                            }
                        }
                        ;
                    }
                    else {
                        System.out.println("Invalid Number, try again");

                    }
                }
//                --------------------------------------------------------------------------------------------------
//              OPTION 2: NO
                else if (createninjas == 'n' || createninjas == 'N') {
                    System.out.println("Do you wanna close the software? (Y/N)");
                    while (!stop3){
                        char close = ninjainput.next().charAt(0);
                        if (close == 'y' || close == 'Y') {
                            System.out.println("Sistem Closing...");
                            stop = true;
                            break;
                        }
                        else if (close == 'n' || close == 'N'){
                            break;
                        }
                        else {
                            System.out.println("I didn't understand your answer, can you repeat please?");
                        }
                    }
                    break;
                }
//                --------------------------------------------------------------------------------------------------
//              OPTION 3: ERROR
                else {
                    System.out.println("I didn't understand your answer, can you repeat?");
                }
                break;
            }
        }
    }
}
