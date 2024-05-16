public class Helicopter extends Vehicle implements IEngine, IRadar {

    private int numberOfBlades;
    private boolean hasWings;
    private IRadar radar;
    private IEngine engine;

    public Helicopter(float weight, int maxSpeed, int numberOfBlades, boolean hasWings, IRadar radar, IEngine engine){
        super(weight, maxSpeed);
        this.numberOfBlades = numberOfBlades;
        this.hasWings = false;
        this.radar = radar;
        this.engine = engine;
    }

    public int getNumberOfBlades() {
        return this.numberOfBlades;
    }
    public void setNumberOfBlades(int NumberOfBlades) {
        this.numberOfBlades = numberOfBlades;
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
