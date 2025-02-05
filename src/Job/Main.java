package Job;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees= new ArrayList<>();
        employees.add(new Employee("andriagamer sreseli",101));
        employees.add(new Employee("siMONA lursmanashvili",7));
        employees.add(new Employee("shavbada togonidze",2));
        Collections.sort(employees);
        System.out.println("Sort by age");
        System.out.println();
        for(Employee e: employees){
            System.out.println(e);
        }
        employees.sort(new NameComparator());
        System.out.println("Sort by name");
        System.out.println();
        for(Employee e: employees){
            System.out.println(e);
        }
       Employee max=Collections.max(employees, Comparator.comparingInt(e->e.age));
       Employee min=Collections.min(employees, Comparator.comparingInt(e->e.age));
        System.out.println("the eldest employee : "+max.getName());
        System.out.println("the youngest employee : "+min.getName());
        Collections.reverse(employees);
        System.out.println("Reversed list");
        for(Employee e: employees){
            System.out.println(e);
        }
    }
}
