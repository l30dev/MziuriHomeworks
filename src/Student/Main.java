package Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        ArrayList<Integer> grades1 = new ArrayList<>();
        grades1.add(85);
        grades1.add(90);
        grades1.add(75);
        students.add(new Student("John", "Doe", "25.01.95", grades1));

        ArrayList<Integer> grades2 = new ArrayList<>();
        grades2.add(92);
        grades2.add(88);
        grades2.add(95);
        students.add(new Student("Brandon", "Smith", "15.04.96", grades2));

        ArrayList<Integer> grades3 = new ArrayList<>();
        grades3.add(70);
        grades3.add(65);
        grades3.add(80);
        students.add(new Student("Bob", "Marley", "10.07.94", grades3));

        System.out.println("1) Unsorted:");
        printStudents(students);
        System.out.println();

        System.out.println("2) Lexicographically sorted:");
        lexicographicalSort(students);
        printStudents(students);
        System.out.println();

        System.out.println("3) Sorted by average grade:");
        averageGradeSort(students);
        printStudents(students);
        System.out.println();

        System.out.println("4) Sorted by birth date:");
        birthDateSort(students);
        printStudents(students);
    }

    public static void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void lexicographicalSort(ArrayList<Student> students) {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).getLastName().compareTo(students.get(j).getLastName()) > 0 ||
                        (students.get(i).getLastName().compareTo(students.get(j).getLastName()) == 0 &&
                                students.get(i).getFirstName().compareTo(students.get(j).getFirstName()) > 0)) {
                    Student temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }
    }

    public static void averageGradeSort(ArrayList<Student> students) {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).getAverageGrade() > students.get(j).getAverageGrade()) {
                    Student temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }
    }

    public static void birthDateSort(ArrayList<Student> students) {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = i + 1; j < students.size(); j++) {
                String[] birthDate1 = students.get(i).getBirthDate().split("\\.");
                String[] birthDate2 = students.get(j).getBirthDate().split("\\.");
                int year1 = Integer.parseInt(birthDate1[2]);
                int year2 = Integer.parseInt(birthDate2[2]);
                int month1 = Integer.parseInt(birthDate1[1]);
                int month2 = Integer.parseInt(birthDate2[1]);
                int day1 = Integer.parseInt(birthDate1[0]);
                int day2 = Integer.parseInt(birthDate2[0]);

                if (year1 > year2 || (year1 == year2 && month1 > month2) ||
                        (year1 == year2 && month1 == month2 && day1 > day2)) {
                    Student temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }
    }
}
