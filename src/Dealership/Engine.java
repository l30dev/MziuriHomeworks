package Dealership;

public class Engine {
    private String fuelType;
    private int cylinderCount;
    private double volume;

    public Engine(String fuelType, int cylinderCount, double volume) {
        this.fuelType = fuelType;
        this.cylinderCount = cylinderCount;
        this.volume = volume;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getCylinderCount() {
        return cylinderCount;
    }

    public void setCylinderCount(int cylinderCount) {
        this.cylinderCount = cylinderCount;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "fuelType='" + fuelType + '\'' +
                ", cylinderCount=" + cylinderCount +
                ", volume=" + volume +
                '}';
    }
}
