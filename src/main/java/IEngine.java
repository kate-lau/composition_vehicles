public interface IEngine { // The vehicle IS a Land Vehicle and it HAS an Engine. So different implementation for WHEELS versus ENGINE.

    int getHorsePower();
    void setHorsePower(int horsePower);

}
