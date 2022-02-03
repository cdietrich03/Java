package week4;

import week3.Course;
import week3.Student;

public class StudentSchedule {
    public static void main(String[] args) {
        week3.Course cmsc = new Course("CMSC", "155", 4);
        week3.Student Bob = new Student("Bob", "1111111");
        System.out.println(cmsc);
        System.out.println(Bob);

        Bob.changeName("Mary");
        System.out.println(Bob);
    }
}
