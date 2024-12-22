package Serialization;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void createSampleData() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nata", 90.5));
        students.add(new Student(2, "Gio", 85.3));
        students.add(new Student(3, "Tea", 95.0));
        students.add(new Student(4, "Luka", 80.7));
        students.add(new Student(5, "Givi", 92.4));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\LeoGh\\Desktop\\Tryout\\input.txt"))) {
            oos.writeObject(students);
        } catch (IOException e) {
            System.out.println("Io exception found");
        }
    }

    public static void findTopStudent() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\LeoGh\\Desktop\\Tryout\\input.txt"))) {
            ArrayList<Student> students = (ArrayList<Student>) ois.readObject();
            Student topStudent = null;
            for (Student student : students) {
                if (topStudent == null || student.getGrade() > topStudent.getGrade()) {
                    topStudent = student;
                }
            }
            System.out.println("Top Student: " + topStudent);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Exception caught");
        }
    }

    public static void main(String[] args) {
        createSampleData();
        findTopStudent();
    }
}
