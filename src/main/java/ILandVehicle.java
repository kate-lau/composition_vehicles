public interface ILandVehicle { // The vehicle IS a Land Vehicle and it HAS an Engine. So different implementation for WHEELS versus ENGINE.

    int getNumberOfWheels();
    void setNumberOfWheels(int numberOfWheels);

}
