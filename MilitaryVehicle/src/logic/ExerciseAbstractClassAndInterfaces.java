package logic;

public class ExerciseAbstractClassAndInterfaces {
    public static void main (String []args){
        F15jeagle eagle= new F15jeagle();
        M901 m901= new M901();
        Maz7917 maz=new Maz7917();
        Adats adats=new Adats();

        //implementation of own methods and interface methods
        eagle.startEngine();
        eagle.attackAircraft();
        m901.startEngine();
        m901.attackTank();
        maz.startEngine();
        maz.attackArea();
        adats.startEngine();
        adats.attackMultiProper();
    }
}
