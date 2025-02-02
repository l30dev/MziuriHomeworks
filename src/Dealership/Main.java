package Dealership;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
ArrayList<Car> cars = new ArrayList<>();
Scanner scanner = new Scanner(System.in);
boolean b=true;
      while(b){
            System.out.println("Enter details for car ");
            System.out.print("Model: ");
            String model = scanner.next();

            System.out.print("Year: ");
            int year = scanner.nextInt();

            System.out.print("Mileage: ");
            double mileage = scanner.nextDouble();

            System.out.print("Fuel Type: ");
            String fuelType = scanner.next();

            System.out.print("Number of Cylinders: ");
            int numCylinders = scanner.nextInt();

            System.out.print("Engine Volume: ");
            double volume = scanner.nextDouble();

            Engine engine = new Engine(fuelType, numCylinders, volume);
            Car car = new Car( model, year, mileage, engine);
            cars.add(car);
          System.out.println("Enter 1 if you are done");
          int num = scanner.nextInt();
          if(num==1) b=false;
        }
        System.out.println("Unsorted:");
        System.out.println();
        for(Car car:cars){
            System.out.println(car);
        }
        System.out.println();

        System.out.println("Sort by date of issue");
        cars.sort(Comparator.comparingInt(Car::getDateOfIssue));
        System.out.println();
        System.out.println("Cars (Sorted by Year):");
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println();
        cars.sort(Comparator.comparingDouble(Car::getMileage));
        System.out.println();
        System.out.println("Sort by mileage");
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println();
        cars.sort(Comparator.comparingDouble(car -> car.getEngine().getVolume()));
        System.out.println("Sort by engine volume ");
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println();
    }
}