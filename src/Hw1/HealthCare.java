package Hw1;

public class HealthCare implements Insurance {
    private int age;
    private double income;
    private boolean isInternational;

    public HealthCare(int age, double income, boolean isInternational) {
        this.age = age;
        this.income = income;
        this.isInternational = isInternational;
    }

    @Override
    public void packageInfo() {
        double basePrice = age > 60 ? 500 : 300;
        if (isInternational) {
            basePrice += basePrice * 0.20;
        }
        System.out.println("Health Care Insurance Package Info:");
        System.out.println("Company: " + companyName);
        System.out.println("Age: " + age);
        System.out.println("Income: $" + income);
        System.out.println("International Coverage: " + (isInternational ? "Yes" : "No"));
        System.out.println("Insurance Price: $" + basePrice);
    }

    public int getAge() {
        return age;
    }

    public double getIncome() {
        return income;
    }

    public boolean isInternational() {
        return isInternational;
    }
}
