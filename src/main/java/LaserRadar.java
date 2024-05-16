public class LaserRadar implements IRadar{

    private int radarRange;

    public LaserRadar(int radarRange){
        this.radarRange = radarRange;
    }

    public int getRadarRange() {
        return this.radarRange;
    }
    public void setRadarRange(int radarRange) {
        this.radarRange = radarRange;
    }
}
