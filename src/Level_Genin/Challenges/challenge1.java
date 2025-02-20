package Level_Genin.Challenges;


public class challenge1 {
    public static void main(String[] args) {


        /*
        * Objective: Create three ninjas, with ages, names, missions, and Missions rank.
        * Objective+ :
        *
        * */






//  -------------------------------------------------------------------------------------------

//      Naruto
        String narutoName = "Naruto";
        byte narutoAge = 20;
        String narutoMission = "Fuck Sasuke";
        char narutoRank = 'S';
        boolean narutoDidIt;

//      Sasuke
        String sasukeName = "Sasuke";
        byte sasukeAge = 19;
        String sasukeMission = "Escape from Naruto";
        char sasukeRank = 'A';
        boolean sasukeDidIt;


//      Sakura
        String sakuraName = "Sakura";
        byte sakuraAge = 15;
        String sakuraMission = "Kill Naruto, to marry with Sasuke";
        char sakuraRank = 'S';
        boolean sakuraDidIt;

//  ------------------------------------------------------------------------------------------
        // Ninjas age > 20 can do every rank missions



        if (narutoAge < 20) {
            if (narutoRank == 'C' || narutoRank == 'D') {
                narutoDidIt = true;
            }
            else{
                narutoDidIt = false;
            }
        }
        else {
            narutoDidIt = true;
        };

        if (sasukeAge < 20) {
            if (sasukeRank == 'C' || sasukeRank == 'D') {
                sasukeDidIt = true;
            }
            else{
                sasukeDidIt = false;
            }
        }
        else {
            sasukeDidIt = true;
        };

        if (sakuraAge < 20) {
            if (sakuraRank == 'C' || sakuraRank == 'D') {
                sakuraDidIt = true;
            }
            else{
                sakuraDidIt = false;
            }
        }
        else {
            sakuraDidIt = true;
        };

//  ------------------------------------------------------------------------------------------

//      Show the ninjas on screen
        System.out.println("Here is the team 7:");
        System.out.println(" ");

        System.out.println(narutoName);
        System.out.println("Age: " + narutoAge);
        System.out.println("Him Mission: " + narutoMission + " --> Rank: " + narutoRank);
        System.out.println("He do it? " + narutoDidIt);

        System.out.println(" ");

        System.out.println(sasukeName);
        System.out.println("Age: " + sasukeAge);
        System.out.println("Him Mission: " + sasukeMission + " --> Rank: " + sasukeRank);
        System.out.println("He do it? " + sasukeDidIt);

        System.out.println(" ");

        System.out.println(sakuraName);
        System.out.println("Age: " + sakuraAge);
        System.out.println("Her Mission: " + sakuraMission + " --> Rank: " + sakuraRank);
        System.out.println("She do it? " + sakuraDidIt);






    }

}
