package logic;

public class F15jeagle extends Vehicle implements IAirToAirMissile{

    //Empty Constructor
    public F15jeagle() {
    }

    //Abstract class methods
    @Override
    protected void startEngine() {
        System.out.println("Hello, I am a FJ15 Eagle and I am starting my engine");
    }

    @Override
    protected void breakEngine() {
        System.out.println("Hello, I am a FJ15 Eagle and I am breaking my engine");
    }

    //Interface methods
    @Override
    public void attackAircraft() {
        System.out.println("Hello, I am an fJ15 Eagle and I am attacking an aircraft");
    }
}
