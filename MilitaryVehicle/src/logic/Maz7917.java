package logic;

public class Maz7917 extends Vehicle implements IIntercontinentalBallisticMissile {

    //Empty Constructor
    public Maz7917() {
    }

    //Abstract class methods
    @Override
    protected void startEngine() {
        System.out.println("Hello, I am a MAZ7917 and I am starting my engine");
    }

    @Override
    protected void breakEngine() {
        System.out.println("Hello, I am a MAZ7917 and I am breaking my engine");
    }

    //Interface methods
    @Override
    public void attackArea() {
        System.out.println("Hello, I am MAZ7917 and I am attacking an area");
    }
}
