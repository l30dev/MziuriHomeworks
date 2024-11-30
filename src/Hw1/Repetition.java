package Hw1;

import java.util.Scanner;

public class Repetition {
    public static void main(String[] args) {
 Scanner scanner= new Scanner(System.in);
        System.out.println("Enter task number");
  int a=scanner.nextInt();
  switch(a){
      case 1:
          System.out.println("Enter countries name");
          String country= scanner.next();
          System.out.println("Enter capital city");
          String capitalName =scanner.next();
          System.out.println("Enter its population and area");
          int p1= scanner.nextInt();
          int a1= scanner.nextInt();
         City capital=new City(capitalName,p1,a1);
          System.out.println("How many other cities are there");
          int count=scanner.nextInt();
          City[] Cities= new City[count+1];
          Cities[0]=capital;
          for(int i=1; i<=count; i++){
              System.out.println(" City N"+i);
              System.out.print("Enter Name:");
              String city=scanner.next();
              System.out.println("Enter its population and area");
              int px = scanner.nextInt();
              int ax = scanner.nextInt();
              City capitalx=new City(city, px, ax);
              Cities[i]=capitalx;
          }
          Country Country = new Country(country,capital,Cities);
          System.out.println("Total area:");
          System.out.println(Country.getArea());
          System.out.println("Total population");
          System.out.println(Country.getPopulation());
          break;

      case 2:

          Doctor[] doctors = new Doctor[3];

          doctors[0] = new Doctor("Emily", "Green", 42, 48, "Pediatrics", "Pediatric Specialist", "Sunnydale Hospital", 20);
          doctors[1] = new Doctor("Michael", "Lee", 35, 40, "Oncology", "Oncologist", "Mountainview Hospital", 10);
          doctors[2] = new Doctor("Sarah", "Morris", 58, 63, "Dermatology", "Dermatologist", "Riverbend Hospital", 28);

          Doctor oldestDoctor = doctors[0];
          Doctor mostExperiencedDoctor = doctors[0];

          for (Doctor doctor : doctors) {
              if (doctor.getDoctorAge() > oldestDoctor.getDoctorAge()) {
                  oldestDoctor = doctor;
              }
              if (doctor.getExperience() > mostExperiencedDoctor.getExperience()) {
                  mostExperiencedDoctor = doctor;
              }
          }
          System.out.println("Oldest doctor:");
          System.out.println(oldestDoctor);
          System.out.println();
          System.out.println("Most experienced doctor:");
          System.out.println(mostExperiencedDoctor);

      case 3:
          System.out.println("Enter your name");
          String name=scanner.next();
          System.out.println("Enter your last name");
          String lastname=scanner.next();
          System.out.println("Enter your age");
          int age=scanner.nextInt();
          System.out.println("Enter your personal id");
          String id=scanner.next();
          Customer customer = new Customer(name,lastname,age,id);
          customer.registerAndChooseInsurance();

      case 4:

          System.out.println("Enter the number of countries:");
          int n = scanner.nextInt();

          Nation[] nations = new Nation[n];

          for (int i = 0; i < n; i++) {
              System.out.println("Enter the name of country " + (i + 1) + ":");
              String countryName = scanner.next();
              System.out.println("Enter the population of " + countryName + ":");
              int population = scanner.nextInt();

              System.out.println("Enter the capital of " + countryName + ":");
              String capitals = scanner.next();
              System.out.println("Enter the area of " + countryName + " in square kilometers:");
              double area = scanner.nextDouble();


              nations[i] = new Nation(countryName, population, capitals, area);
          }

          Nation.River[] rivers = new Nation.River[n];

          for (int i = 0; i < n; i++) {
              System.out.println("Enter the name of the river for " + nations[i].getName() + ":");
              String riverName = scanner.next();
              System.out.println("Enter the length of " + riverName + " in kilometers:");
              double riverLength = scanner.nextDouble();


              rivers[i] = nations[i].new River(riverName, riverLength);
          }

          for (int i = 0; i < n - 1; i++) {
              for (int j = 0; j < n - i - 1; j++) {
                  if (rivers[j].getLength() > rivers[j + 1].getLength()) {
                      Nation.River temp = rivers[j];
                      rivers[j] = rivers[j + 1];
                      rivers[j + 1] = temp;
                  }
              }
          }
          System.out.println();
          System.out.println("Sorted list of nations by river length:");
          for (int i = 0; i < n; i++) {
              System.out.println(nations[i].toString());
              System.out.println();
              System.out.println(rivers[i].toString());
              System.out.println();
          }
      default:
          System.out.println("Incorrect input");
  }
  }
    }
