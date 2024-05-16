public class Plane extends Vehicle implements IEngine, IRadar {

    private int seats;
    private String type;
    private boolean hasWings;
    private IRadar radar;
    private IEngine engine;

//    Plane constructor
    public Plane(float weight, int maxSpeed, int seats, String type, IRadar radar, IEngine engine){
        super(weight, maxSpeed);
        this.seats = seats;
        this.type = type;
        this.hasWings = true;
        this.radar = radar;
        this.engine = engine;
    }

    public int getSeats(){
        return this.seats;
    }

    public void setSeats(int seats){
        this.seats = seats;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public boolean getHasWings(){
        return this.hasWings;
    }

    public void setHasWings(boolean hasWings){
        this.hasWings = hasWings;
    }

    public IRadar getRadar() {
        return this.radar;
    }
    public void setRadar(IRadar radar) {
        this.radar = radar;
    }

    public int getRadarRange(){
        return this.radar.getRadarRange();
    }
    public void setRadarRange(int radarRange){
        this.radar.setRadarRange(radarRange);
    }

    public IEngine getEngine(){
        return this.engine;
    }
    public void setEngine(IEngine engine){
        this.engine = engine;
    }

    public int getHorsePower(){
        return this.engine.getHorsePower();
    }
    public void setHorsePower(int horsePower){
        this.engine.setHorsePower(horsePower);
    }

}
