package Level_Jounin.Interfaces;




//===================================================================================================================
//SUPERCLASSE

public abstract class ninja implements strategys {

//    ---------------------------------------------------------------------------------------------------------
    //VARIÁVEIS || ATRIBUTOS
    String name;
    String village;
    int age;
    int missions;
    ninjaLevel rank;
    boolean alive;


//    ---------------------------------------------------------------------------------------------------------
    //MÉTODOS

    //Método final
    final void kunai(){
        System.out.println("Eu sou um ninja e estou tacando uma Kunai");
    }

    public void skill(){
        System.out.println("Meu nome é " + name + " e esse é meu ataque especial");
    }

    @Override
    public void strategy() {
        System.out.println("Meu nome é " + name + " e essa é minha estratégia de batalha");
    }
    public void combatQi() {
        System.out.println("Meu nome é " + name + " e esse é meu QI de batalha");
    }

    //Método overload(VULGO CONSTRUTORES DE MÉTODOS)
    public void combatQi(int qi) {
        if(qi >= 150) {
            System.out.println("Seu QI é de " + qi + " e voce é um genio");
        } else if (qi >= 130) {
            System.out.println("Seu QI é de " + qi + " e voce é um ninja esperto");
        } else {
            System.out.println("Seu QI é de " + qi + " e voce precisa treinar mais");
        }
    }

    //Override da resposta quando o local na memória do objeto é chamado
    @Override
    public String toString() {
        return "Meu nome é " + name + ", eu sou da aldeia " + village + " e tenho " + age + " anos!";
    }

    //CONSTRUTORES

    public ninja() {
    } public ninja(String name, String village, int age) {
        this.name = name;
        this.village = village;
        this.age = age;
    } public ninja(String name, String village, int age, int missions, ninjaLevel rank) {
        this(name, village, age);
        this.missions = missions;
        this.rank = rank;
    }

    public ninja(String name, String village, int age, int missions, ninjaLevel rank, boolean alive) {
        this.name = name;
        this.village = village;
        this.age = age;
        this.missions = missions;
        this.rank = rank;
        this.alive = alive;
    }

    //===================================================================================================================
} // Fim da Super Classe
//===================================================================================================================





//ENUMS

    enum element{
        FIRE,
        WATER,
        EARTH,
        AIR
    }
    enum ninjaLevel{
        GENIN,
        CHUUNIN,
        JOUNIN,
        KAGE
    }
    enum bijuus{
        SHUKAKU ( "Shukaku", "Gaara",   1),
        MATATABI ("Matataki", "Yugito Nii",   2),
        ISOBU ( "Isobu",   "Xaguca",   3),
        SON_GOKU ( "Son Goku", "Boshi", 4),
        KOKU ( "Kekue",   "Han",   5),
        SAIKEN ( "Saiken",   "Utakate",   6),
        CHOMEI ( "Shewed",   "Fuu", 7),
        GYUKE (  "Gyukd",   "Killer Bee",   8),
        KURAMA ( "Kurama",   "Naruto Uzumaki",   9);

        String name;
        String jinchuurik;
        int tails;

        bijuus() {
        }

        bijuus(String name, String jinchuurik, int tails) {
            this.name = name;
            this.jinchuurik = jinchuurik;
            this.tails = tails;
        }
    }

    enum MissionRank{
        S("Hard", 5),
        A("Complex", 4),
        B("Medium", 3),
        C("Easy", 2),
        D("UltraEasy", 1);

        private String descrition;
        private int difficult;

        MissionRank(String descrition, int difficult) {
            this.descrition = descrition;
            this.difficult = difficult;
        }

        public String getDescrition() {
            return descrition;
        }

        public void setDescrition(String descrition) {
            this.descrition = descrition;
        }

        public int getDifficult() {
            return difficult;
        }

        public void setDifficult(int difficult) {
            this.difficult = difficult;
        }
    }





//===================================================================================================================





//INTERFACES


interface strategys{
    void strategy();
    void combatQi();
    void combatQi(int qi);
}
interface sharinganInt{
    void sharingan();
}
interface Anbu {
    void anbu();
}
interface Hokage{
    void hokage();
}








//===================================================================================================================
//SUBCLASSES




//-------------------------------------------------------------------------------------------------------------------
//CLASSE UCHIHA
class uchiha extends ninja implements sharinganInt{

    @Override
    public void skill() {
        System.out.println("Meu nome é "+ name + " esse é meu ataque especial de fogo, eu sou um uchiha!");
    }

    @Override
    public void sharingan() {
        System.out.println("Meu nome é " + name + " e eu ativei o sharingan, sou um uchiha!");
    }


    public uchiha() {
    }

    public uchiha(String name, String village, int age) {
        super(name, village, age);
    }

    public uchiha(String name, String village, int age, int missions, ninjaLevel rank) {
        super(name, village, age, missions, rank);
    }

    public uchiha(String name, String village, int age, int missions, ninjaLevel rank, boolean alive) {
        super(name, village, age, missions, rank, alive);
    }
}
//-------------------------------------------------------------------------------------------------------------------



//CLASSE UZUMAKI

class uzumaki extends ninja implements Hokage{


    bijuus Bijuus;

    public uzumaki() {
    }

    public uzumaki(String name, String village, int age) {
        super(name, village, age);
    }

    public uzumaki(String name, String village, int age, int missions, ninjaLevel rank) {
        super(name, village, age, missions, rank);
    }

    public uzumaki(String name, String village, int age, int missions, ninjaLevel rank, bijuus Bijuus) {
        super(name, village, age, missions, rank);
        this.Bijuus = Bijuus;
    }

    public void sealing(){
        System.out.println(name + " ativou o selamento dos uzumaki!");
    }

    @Override
    public void skill() {
        System.out.println("Meu nome é " + name + " e esse é meu selamento especial uzumaki");

    }

    @Override
    public void hokage() {
        System.out.println("Eu sou um hokage!");
    }








}
//-------------------------------------------------------------------------------------------------------------------




//CLASSE HATAKE

class hatake extends ninja implements sharinganInt, Anbu, Hokage{
    public void hello(){
        System.out.println( "Meu nome é " + name + " eu sou um hatake");
    }
    @Override
    public void sharingan() {
        System.out.println("Meu nome é " + name + " e eu ativei o sharingan, pois eu ganhei o meu de presente!");
    }

    @Override
    public void hokage() {
        System.out.println("Eu sou um hokage!");
    }
    @Override
    public void anbu() {
        System.out.println(name+": Eu sou um ninja da Anbu");
    }

}
//-------------------------------------------------------------------------------------------------------------------

//ClASSE HATAKE
class anbu{

}