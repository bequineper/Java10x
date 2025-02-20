package Level_Genin.TiposDeDados;

public class Array {
    public static void main(String[] args) {

        /*
        String ninja1 = "Naruto";
        String ninja2 = "Sasuke";
        String ninja3 = "Sakura";
        */

//        int[] ages = new int[3];

//        Initiate an array

        String[] ninja = new String[5];
        ninja[0] = "Naruto";
        ninja[1] = "Sasuke";
        ninja[2] = "Sakura";
        ninja[3] = "Hinata";
        ninja[4] = "Kakashi";

        ninja = new String[7];
        ninja[0] = "Hashirama";
        ninja[1] = "Tobirama";
        ninja[2] = "Hiruzen";
        ninja[3] = "Minato";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi";
        ninja[6] = "Naruto";
        System.out.println(ninja[3] );

        // For to make a loop in the array
        for (int i = 0; i < 7 ; i++) {
            System.out.println(ninja[i]);
        }







    }
}
