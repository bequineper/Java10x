package Level_Genin.TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {


        /*
        * Primitive data, - int, double, float, char, boolean, short
        * Class objective: create a ninja -Naruto-
        * */



        short shurikens = 1500; // short = receive a small number up to 32.767
        byte kunais = 100; // byte = receive a small number up to 127
        int age = 16; // int = receive a integer [max 2billion]
        Long budget = 99999999999L; // Long = receive a number up to 9 trillion [requires a letter at the end]
        double height = 1.8000000; // double = receive a floating number up to 15 decimal characters
        float chackra = 3.14f; // float = receive a floating number up to 7 decimal chars[requires an f at the end]
        char initial = 'N'; // char = receive a character [use 'single quotes']
        boolean live = true; // boolean = receive a true or false

        System.out.print(age); // Shows the user what I want
        System.out.println(budget); // Shows the user what I want[In another line][Most used] - sout
        System.out.println(height);
        System.out.println("Budget = " + budget); // Shows the user a concatenation
        System.out.println("My age is " + age);




    }
}
