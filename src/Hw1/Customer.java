package Hw1;

import java.util.Scanner;

public class Customer {
    private String firstName;
    private String lastName;
    private int age;
    private String personalId;
    private Insurance selectedInsurance;

    public Customer(String firstName, String lastName, int age, String personalId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.personalId = personalId;
    }

    public void registerAndChooseInsurance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an Insurance Package:");
        System.out.println("1. Auto Insurance");
        System.out.println("2. Health Care Insurance");
        System.out.println("3. Travel Insurance");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter car price:");
                double carPrice = scanner.nextDouble();
                System.out.println("Enter car age:");
                int carAge = scanner.nextInt();
                selectedInsurance = new AutoInsurance(carPrice, carAge);
                break;
            case 2:
                System.out.println("Enter your age:");
                int healthAge = scanner.nextInt();
                System.out.println("Enter your income:");
                double income = scanner.nextDouble();
                System.out.println("Do you want international coverage? (true/false):");
                boolean isInternational = scanner.nextBoolean();
                selectedInsurance = new HealthCare(healthAge, income, isInternational);
                break;
            case 3:
                System.out.println("Enter number of days:");
                int days = scanner.nextInt();
                System.out.println("Enter number of people:");
                int peopleCount = scanner.nextInt();
                System.out.println("Do you want to insure baggage? (true/false):");
                boolean insureBaggage = scanner.nextBoolean();
                selectedInsurance = new TravelInsurance(days, peopleCount, insureBaggage);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        selectedInsurance.packageInfo();
    }

    public String getPersonalId() {
        return personalId;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}