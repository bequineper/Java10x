package Level_Jounin.Challenges;

import java.util.Scanner;

public class ninja {

    String name;
    String mission;
    int missionrank;
    int ninjarank;
    String[] clan = {"Uchiha", "Uzumaki", "Hyuuga", "Senju"};
    int clanNumber;
    Scanner scanner = new Scanner(System.in);

    public String getinfo() {

        System.out.println("Write your ninja name:");
        name = scanner.nextLine();
        System.out.println(" ");

        System.out.println("And what's the " + name + " rank? (Lower) 1-2-3-4-5 (Bigger)");
        ninjarank = scanner.nextInt();
        scanner.nextLine();
        System.out.println("=============================================");
        System.out.println(" ");

        System.out.println("So, what's the " + name + " clan? ((0 for Uchiha, 1 for Uzumaki, 2 for Hyuuga, 3 for Senju): )");
        clanNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" ");

        System.out.println("=============================================");
        System.out.println("Now, what's " + name + " mission?");
        mission = scanner.nextLine();
        System.out.println(" ");

        System.out.println("And what's the " + mission + " rank? (Lower) 1-2-3-4-5 (Bigger)");
        missionrank = scanner.nextInt();
        scanner.nextLine();
        missionStatus();
        System.out.println("=============================================");

        System.out.println("Press enter to shows " + name + " info...");
        scanner.nextLine();
        return showinfo();
    }

    public boolean missionStatus() {
        return ninjarank >= missionrank;
    }

    public String showinfo() {
        System.out.println("-----------------''------------------");
        System.out.println("Showing your ninja info:");
        System.out.println("=========================");
        System.out.println(" ");
        System.out.println("Ninja name: " + name);
        System.out.println("---------------------------------------");
        System.out.println("Ninja rank: " + ninjarank);
        System.out.println("---------------------------------------");
        System.out.println("Ninja mission: " + mission);
        System.out.println("---------------------------------------");
        System.out.println("Ninja mission rank: " + missionrank);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(name + " did it the mission?");
        System.out.println("==================================");
        if (missionStatus()) {
            System.out.println("Yes, it's done!");
        } else {
            System.out.println("No, " + name + " failed to complete the mission");
        }
        System.out.println("===================================================");
        return checkClan();
    }

    public String checkClan() {
        System.out.println("And what about the clan? ");
        System.out.println("------------------------");

        if (clanNumber >= 0 && clanNumber < clan.length) {
            String clanName = clan[clanNumber];

            switch (clanName) {
                case "Uchiha":
                    System.out.println(name + " is from " + clanName + " and can activate the Sharingan!");
                    break;
                case "Uzumaki":
                    System.out.println(name + " is from " + clanName + " and has immense chakra reserves!");
                    break;
                case "Hyuuga":
                    System.out.println(name + " is from " + clanName + " and can use the Byakugan!");
                    break;
                case "Senju":
                    System.out.println(name + " is from " + clanName + " and is known for their strong life force!");
                    break;
                default:
                    System.out.println(name + " is from an unknown clan.");
                    break;
            }
        } else {
            System.out.println("Invalid clan number!");
        }
        return "Checked";
    }
}