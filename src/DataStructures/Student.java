package DataStructures;

class Student {
    String firstName;
    String lastName;
    String id;
    double averageGrade;

    public Student(String firstName, String lastName, String id, double averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.averageGrade = averageGrade;
    }
    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}