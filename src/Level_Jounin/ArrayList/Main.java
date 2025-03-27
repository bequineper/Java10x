package Level_Jounin.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";

        System.out.println("Ninja: " + ninjasArray[0]);


        // Lists are not statics, they can up or down
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto uzumaki");

        System.out.println(ninjasList);


    }
}
