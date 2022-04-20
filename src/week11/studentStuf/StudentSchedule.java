package week11.studentStuf;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.HashMap;

public class StudentSchedule {
    public static void main(String[] args) {
        Student linda = new Student("Linda", new Math());
        Student denise = new Student("Denise", new CMSC());
        Student kurt = new Student("Kurt", new Math());
        Student maddy = new Student("Maddy", new CMSC());

        Course cmsc150 = new Course("CMSC", 150, 4);
        Course cmsc155 = new Course("CMSC", 155, 4);
        Course cmsc250 = new Course("CMSC", 250, 4);
        Course cmsc390 = new Course("CMSC", 390, 4);
        Course calc1 = new Course("Math", 151, 4);
        Course calc2 = new Course("Math", 152, 4);
        Course calc3 = new Course("Math", 251, 4);
        Course stats1 = new Course("Math", 301, 4);
        Course stats2 = new Course("Math", 302, 4);

        linda.addCourse(cmsc150);
        linda.addCourse(calc1);
        linda.addCourse(calc2);
        linda.addCourse(calc3);
        linda.addCourse(cmsc250);

        denise.addCourse(cmsc250);
        denise.addCourse(cmsc390);
        denise.addCourse(cmsc155);
        denise.addCourse(stats1);

        kurt.addCourse(cmsc150);
        kurt.addCourse(cmsc250);
        kurt.addCourse(cmsc390);
        kurt.addCourse(cmsc155);
        kurt.addCourse(calc1);
        kurt.addCourse(calc2);
        kurt.addCourse(calc3);
        kurt.addCourse(stats1);
        kurt.addCourse(stats2);

        maddy.addCourse(cmsc150);
        maddy.addCourse(cmsc250);
        maddy.addCourse(cmsc155);
        maddy.addCourse(calc2);

        String mathString = "Math";
        String computerScienceString = "CMSC";
        Math math = new Math();
        CMSC cmsc = new CMSC();

        Course fundamentalsI = new Course(computerScienceString, 150, 4);
        Course algorithms = new Course(computerScienceString, 250, 3);
        Course math200 = new Course(mathString, 200, 4);
        Course religion101 = new Course("Religion", 101, 4);

        Student roseBush = new Student("Rose Bush", math);
        Student helenHeaven = new Student("Helen Heaven", cmsc);
        Student jerryAttrick = new Student("Jerry Attrick", cmsc);
        Student tommyGunn = new Student("Tommy Gunn", cmsc);


        Map<Student, Map<Course, Double>> gradebook = new HashMap<>();
        Map<Course, Double> jerryScores = new HashMap<>();
        jerryScores.put(fundamentalsI, 92.3);
        jerryScores.put(algorithms, 87.6);
        jerryScores.put(math200, 88.8);
        gradebook.put(jerryAttrick, jerryScores);

        System.out.println(Student.avgGrade(gradebook, jerryAttrick));

        Map<Course, Double> roseScores = new HashMap<>();
        roseScores.put(religion101, 77.7);

        System.out.println(jerryScores.get(math200));
        System.out.println(jerryScores.get(religion101));
        System.out.println(jerryScores.get(fundamentalsI) < jerryScores.get(algorithms));
        ;

//        gradebook.put(roseBush, roseScores);
//        System.out.println(gradebook);
//        gradebook.put(jerryAttrick, jerryScores);
//        jerryScores.put(fundamentalsI, 66.6);
//        gradebook.put(helenHeaven, jerryScores);
//
//        System.out.println(gradebook.get(jerryAttrick).get(fundamentalsI));
//        System.out.println(gradebook.get(helenHeaven).get(fundamentalsI));
//        System.out.println(gradebook.get(tommyGunn).get(fundamentalsI));



    }
}
