package logic;

public class M901 extends Vehicle implements IAntiTankDirectMissile{

    //Empty constructor
    public M901() {
    }

    //Abstract class methods
    @Override
    protected void startEngine() {
        System.out.println("Hello, I am a M901 and I am starting my engine");
    }

    @Override
    protected void breakEngine() {
        System.out.println("Hello, I am a M901 and I am breaking my engine");
    }

    //Interface methods
    @Override
    public void attackTank() {
        System.out.println("Hello, I am M901 and I am attacking a tank");
    }
}
