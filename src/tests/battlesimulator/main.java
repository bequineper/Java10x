package tests.battlesimulator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the ninja simulator");

        ninja userninja = new ninja();

        System.out.println("First, write your ninja name: ");
        userninja.name = input.next();

        boolean points = false;
        System.out.println("You have 200 points to distribute between health and damage.");
        while (!points) {
            System.out.println("How much health do you want? (Each health point costs 1 point): ");
            userninja.health = input.nextInt();

            System.out.println("How much damage do you want? (Each damage point costs 1 point): ");
            userninja.damage = input.nextInt();

            if (userninja.health + userninja.damage > 200) {
                System.out.println("You exceeded the 200 points limit! Please try again.");
            } else {
                points = true;
            }
        }
        System.out.println("Amazing! " + userninja.name + " has been created successfully!");
        System.out.println(userninja.name + " has " + userninja.health + " health points, and " + userninja.damage + " damage points");


        int initialHealth = userninja.health;
        int initialDamage = userninja.damage;

        enemys[] enemieslist = new enemys[4];
        enemieslist[0] = new enemys("Zabuza", 120, 80);
        enemieslist[1] = new enemys("Orochimaru", 150, 100);
        enemieslist[2] = new enemys("Itachi", 180, 120);
        enemieslist[3] = new enemys("Madara", 210, 140);

        boolean game = true;
        while (game) {

            userninja.health = initialHealth;
            userninja.damage = initialDamage;

            System.out.println("\nChoice your enemy:");
            for (int i = 0; i < enemieslist.length; i++) {
                if (enemieslist[i] != null) {
                    System.out.println((i + 1) + ". " + enemieslist[i].name + " (Rank: " + enemieslist[i].rank + ")");
                }
            }

            System.out.println("Enter the number of the enemy you want to fight (or 0 to quit): ");
            int choice = input.nextInt();

            if (choice == 0) {
                System.out.println("Thanks for playing! See you next time!");
                game = false;
            } else if (choice > 0 && choice <= enemieslist.length) {
                enemys chosenEnemy = enemieslist[choice - 1];

                if (chosenEnemy != null) {
                    battle(userninja, chosenEnemy);

                    if (chosenEnemy.health <= 0) {
                        System.out.println(chosenEnemy.name + " was defeated and, is no longer an enemy!");
                        enemieslist[choice - 1] = null;
                    }

                    boolean alldefeated = true;
                    for (enemys inimigo : enemieslist) {
                        if (inimigo != null) {
                            alldefeated = false;
                            break;
                        }
                    }

                    if (alldefeated) {
                        System.out.println("Congratulations! You defeated all enemies!");
                        game = false;
                    }
                } else {
                    System.out.println("That enemy has been defeated, try another");
                }
            } else {
                System.out.println("Invalid option! Try again.");
            }


            if (userninja.health <= 0) {
                System.out.println("Do you want to restart the game? (y/n)");
                char restart = input.next().toLowerCase().charAt(0);
                if (restart == 'y') {
                    // Reiniciar o jogo
                    game = true;
                    // Resetar a lista de inimigos
                    enemieslist[0] = new enemys("Zabuza", 120, 80);
                    enemieslist[1] = new enemys("Orochimaru", 150, 100);
                    enemieslist[2] = new enemys("Itachi", 180, 120);
                    enemieslist[3] = new enemys("Madara", 210, 140);
                } else {
                    System.out.println("Thanks for playing! See you next time!");
                    game = false;
                }
            }
        }
    }

    public static void battle(ninja user, enemys enemy) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nThe battle started! " + user.name + " vs " + enemy.name + "! Who will win?");

        while (true) {

            System.out.println("\nIt's " + user.name + " time!");
            System.out.println("Press ENTER to attack...");
            input.nextLine();


            enemy.health -= user.damage;
            System.out.println(user.name + " attack " + enemy.name + " and deal " + user.damage + " damage points!");
            if (enemy.health <= 0) {
                System.out.println(enemy.name + " was defeated! " + user.name + " won the battle!");
                System.out.println("You receive 50 points to redistribute how you want!");
                System.out.println("How many points do you wanna add on your damage?");
                System.out.println("[REMEMBER, WHATEVER REMAINS OF THE 50, WILL GO TOWARDS YOUR HEALTH]");
                int deal = input.nextInt();

                if (deal > 50) {
                    System.out.println("You can't add more than 50 points! Please try again.");
                } else {
                    user.damage += deal;
                    int lifepoints = 50 - deal;
                    user.health += lifepoints;

                    System.out.println(user.name + " now has " + user.health + " health and " + user.damage + " damage.");
                }
                break;
            }
            System.out.println(enemy.name + " now has " + enemy.health + " health points.");


            System.out.println("\nIt's " + enemy.name + " time!");


            user.health -= enemy.damage;
            System.out.println(enemy.name + " attack " + user.name + " and deal " + enemy.damage + " damage points!");
            System.out.println(user.name + " now has " + user.health + " health points.");


            if (user.health <= 0) {
                System.out.println(user.name + " was defeated! " + enemy.name + " won the battle!");
                break;
            }
        }
    }
}