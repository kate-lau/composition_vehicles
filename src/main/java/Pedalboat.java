public class Pedalboat extends Vehicle implements IWaterVehicle {

    private int numberOfSeats;
    private String hullType;

    public Pedalboat(float weight, int maxSpeed, int numberOfSeats){
        super(weight, maxSpeed);
        this.numberOfSeats = numberOfSeats;
        this.hullType = "wood";
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getHullType(){
        return this.hullType;
    }
    public void setHullType(String hullType){
        this.hullType = hullType;
    }

}
