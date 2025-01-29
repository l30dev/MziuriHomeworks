package Student;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private String birthDate;
    private ArrayList<Integer> grades;

    public Student(String firstName, String lastName, String birthDate, ArrayList<Integer> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.grades = grades;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double getAverageGrade() {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        if (grades.size() == 0) {
            return 0;
        } else {
            return sum / grades.size();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", grades=" + grades +
                '}';
    }

}
