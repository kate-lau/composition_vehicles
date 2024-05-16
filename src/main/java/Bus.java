public class Bus extends Vehicle implements ILandVehicle, IEngine {

    private boolean isDoubleDecker;
    private int numberOfWheels;
    private IEngine engine;

    public Bus(float weight, int maxSpeed, boolean isDoubleDecker, IEngine engine){
        super(weight, maxSpeed);
        this.isDoubleDecker = isDoubleDecker;
        this.numberOfWheels = 8;
        this.engine = engine; // INTERFACE IMPLEMENTATION
    }

    public boolean getIsDoubleDecker() {
        return isDoubleDecker;
    }
    public void setDoubleDecker(boolean doubleDecker) {
        isDoubleDecker = doubleDecker;
    }

    public int getNumberOfWheels(){
        return this.numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }

    public IEngine getEngine(){ // This is not part of the Interface, this is just so we have access to the bus's engine.
        return this.engine;
    }
    public void setEngine(IEngine engine){
        this.engine = engine;
    }

    public int getHorsePower(){ // We ask the Engine property to access HorsePower.
        return this.engine.getHorsePower(); // The Engine has not been built yet, it will live in the CombustionEngine class.
    }
    public void setHorsePower(int horsePower){
        this.engine.setHorsePower(horsePower);
    }

}
