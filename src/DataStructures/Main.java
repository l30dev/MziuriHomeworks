package DataStructures;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 6 to select a task:");
        int task = scanner.nextInt();

        switch (task) {
            case 1: {
                ArrayList<Integer> list = new ArrayList<>();
                int number = rand.nextInt(50);
                while (number != 40) {
                    list.add(number);
                    number = rand.nextInt(50);
                }
                list.add(number);
                System.out.println("List before removing even numbers:");
                System.out.println("List size: " + list.size());
                for (int n : list) {
                    System.out.print(n + " ");
                }
                for (int i = 0; i < list.size(); i++) {
                    int currentNum = list.get(i);
                    if (currentNum % 2 == 0) {
                        list.remove(i);
                        i--;
                    }
                }
                System.out.println("List after removing even numbers:");
                for (int n : list) {
                    System.out.print(n + " ");
                }
                break;
            }
            case 2: {
                int[] array = new int[5];
                for (int i = 0; i < array.length; i++) {
                    array[i] = rand.nextInt(50);
                }
                int max = array[0];
                int maxIndex = 0;
                for (int i = 1; i < array.length; i++) {
                    if (array[i] > max) {
                        max = array[i];
                        maxIndex = i;
                    }
                }
                System.out.println("Max element in array: " + max + ", Index: " + maxIndex);
                ArrayList<Integer> arrayList = new ArrayList<>();
                for (int i : array) {
                    arrayList.add(i);
                }
                int listMax = arrayList.getFirst();
                int listMaxIndex = 0;
                for (int i = 1; i < arrayList.size(); i++) {
                    if (arrayList.get(i) > listMax) {
                        listMax = arrayList.get(i);
                        listMaxIndex = i;
                    }
                }
                System.out.println("Max element in ArrayList: " + listMax + ", Index: " + listMaxIndex);
                break;
            }
            case 3: {
                ArrayList<Student> students = new ArrayList<>();
                students.add(new Student("Gio", "Gabatashvili", "123", 85.6));
                students.add(new Student("Irakli", "Sabiashvili", "124", 92.3));
                students.add(new Student("Luka", "Natadze", "125", 78.9));
                students.add(new Student("Alpen", "Gold", "126", 88.2));
                students.add(new Student("Milka", "MAXX", "127", 95.5));
                for (int i = 0; i < students.size(); i++) {
                    for (int j = 0; j < students.size() - 1-i; j++) {
                        double grade1 = students.get(j).getAverageGrade();
                        double grade2 = students.get(j + 1).getAverageGrade();

                        if (grade1 > grade2) {
                            Student temp = students.get(j);
                            students.set(j, students.get(j + 1));
                            students.set(j + 1, temp);
                        }
                    }
                }

                for (Student student : students) {
                    System.out.println(student);
                }
                break;
            }


        }
    }
}
