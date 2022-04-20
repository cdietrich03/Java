package week9.studentStuf;

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

        System.out.println(linda);
        System.out.println(kurt);
        System.out.println(maddy);
        System.out.println(denise);
    }
}
