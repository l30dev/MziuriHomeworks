package Hw1;

public class AutoInsurance implements Insurance {
    private double carPrice;
    private int carAge;

    public AutoInsurance(double carPrice, int carAge) {
        this.carPrice = carPrice;
        this.carAge = carAge;
    }

    @Override
    public void packageInfo() {
        double price = carPrice * 0.04;
        if (carAge > 7) {
            price += 100;
        }
        System.out.println("Auto Insurance Package Info:");
        System.out.println("Company: " + companyName);
        System.out.println("Car Price: $" + carPrice);
        System.out.println("Car Age: " + carAge + " years");
        System.out.println("Insurance Price: $" + price);
    }

    public double getCarPrice() {
        return carPrice;
    }

    public int getCarAge() {
        return carAge;
    }
}