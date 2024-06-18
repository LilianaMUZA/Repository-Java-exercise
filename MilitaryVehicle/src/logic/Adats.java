package logic;

public class Adats extends Vehicle implements ISurfaceToAirMissile{

    //Empty Constructor
    public Adats() {
    }

    //Abstract class methods
    @Override
    protected void startEngine() {
        System.out.println("Hello, I am a ADATS and I am starting my engine");
    }

    @Override
    protected void breakEngine() {
        System.out.println("Hello, I am a FJ15 Eagle and I am breaking my engine");
    }

    //Interface methods
    @Override
    public void attackMultiProper() {
        System.out.println("Hello, I am ADATS, an I am attacking multi proper");
    }
}
