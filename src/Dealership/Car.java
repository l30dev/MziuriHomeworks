package Dealership;

public class Car {
    private String model;
    private int dateOfIssue;
    private double mileage;
    private Engine engine;

    public Car(String model, int dateOfIssue, double mileage, Engine engine) {
        this.model = model;
        this.dateOfIssue = dateOfIssue;
        this.mileage = mileage;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public int getDateOfIssue() {
        return dateOfIssue;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setDateOfIssue(int dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", mileage=" + mileage +
                ", dateOfIssue=" + dateOfIssue +
                ", model='" + model + '\'' +
                '}';
    }
}
