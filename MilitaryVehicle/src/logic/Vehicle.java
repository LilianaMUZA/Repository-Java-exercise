package logic;

public abstract class Vehicle {
    protected int id;
    protected String category;
    protected String name;

    //Airborne, terrestrial, maritime
    protected String transportation;

    //Abstract methods
    protected abstract void startEngine();
    protected abstract void breakEngine();
}
