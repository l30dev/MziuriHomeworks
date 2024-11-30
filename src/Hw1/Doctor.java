package Hw1;

public class Doctor extends Person {
    private int doctorAge;
    private String department;
    private String position;
    private String hospitalName;
    private int experience;
    public Doctor(String firstName, String lastName, int age, int doctorAge,
                  String department, String position, String hospitalName, int experience) {
        super(firstName, lastName, age);
        this.doctorAge = doctorAge;
        this.department = department;
        this.position = position;
        this.hospitalName = hospitalName;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Doctor{" +
                "doctorAge=" + doctorAge +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", experience=" + experience +
                '}';
    }

    public int getDoctorAge() {
        return doctorAge;
    }

    public int getExperience() {
        return experience;
    }
}