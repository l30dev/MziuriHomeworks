package Hw1;

public class TravelInsurance implements Insurance {
    private int days;
    private int peopleCount;
    private boolean insureBaggage;

    public TravelInsurance(int days, int peopleCount, boolean insureBaggage) {
        this.days = days;
        this.peopleCount = peopleCount;
        this.insureBaggage = insureBaggage;
    }

    @Override
    public void packageInfo() {
        double basePrice = days * 20;
        basePrice *= peopleCount;
        if (insureBaggage) {
            basePrice += basePrice * 0.10;
        }
        System.out.println("Travel Insurance Package Info:");
        System.out.println("Company: " + companyName);
        System.out.println("Days: " + days);
        System.out.println("People Count: " + peopleCount);
        System.out.println("Insure Baggage: " + (insureBaggage ? "Yes" : "No"));
        System.out.println("Insurance Price: $" + basePrice);
    }

    public int getDays() {
        return days;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public boolean isInsureBaggage() {
        return insureBaggage;
    }
}
