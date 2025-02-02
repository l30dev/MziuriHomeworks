package classWork;

import java.util.ArrayList;

public class classWork {
    public static void main(String[] args) {
        ArrayList<Student>list=new ArrayList<>();
//1
        list.add(new Student("Alice","orwell", 23));
        list.add(new Student("Kate","Peterson", 45));
        list.add(new Student("Bob","Marley.jr", 12));
        list.sort(new ageComparator());
        for(Student student:list){
            System.out.println(student);
        }
        //2
        /*

class Student implements Comparable<Student>
        public int compareTo(Student other) {

            return Integer.compare(this.age, other.age);

         */
        }
    }

