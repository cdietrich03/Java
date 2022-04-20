package week6;


public class StudentSchedule {
    public static void main(String[] args) {
        WorkStudyStudent bill = new WorkStudyStudent("Bill",  8);
        WorkStudyStudent frank = new WorkStudyStudent("Frank", 10);
        WorkStudyStudent jim = new WorkStudyStudent("Jim", 5);

        Student linda = new Student("Linda");
        Student denise = new Student("Denise");
        Student kurt = new Student("Kurt");

        Course chem101 = new Course("Chemistry", "101", 4);
        Course cmsc150 = new Course("Computer Science", "150", 4);
        Course bio110 = new Course("Biology", "111", 4);
        Course calc1 = new Course("Math", "151", 4);

        CGcourse mis145 = new CGcourse("West Des Moines", "MIS", "145", 4);
        CGcourse musictheory = new CGcourse("Indianola", "Music", "101", 4);

        linda.addCourse(chem101);
        linda.addCourse(cmsc150);
        linda.addCourse(bio110);
        linda.addCourse(musictheory);
        linda.removeCourse(musictheory);

        kurt.addCourse(calc1);
        kurt.addCourse(bio110);
        kurt.addCourse(mis145);

        bill.addCourse(cmsc150);
        bill.addCourse(calc1);
        bill.addCourse(chem101);
        bill.addCourse(bio110);
        bill.removeCourse(bio110);

        frank.addCourse(chem101);
        frank.addCourse(calc1);
        frank.addCourse(bio110);

        jim.addCourse(chem101);
        jim.removeCourse(chem101);
        jim.addCourse(musictheory);

        denise.addCourse(chem101);
        denise.addCourse(calc1);
        denise.addCourse(bio110);
        denise.addCourse(cmsc150);
        denise.removeCourse(bio110);
        denise.removeCourse(calc1);

        System.out.println(denise);
        System.out.println(linda);
        System.out.println(jim);
        System.out.println(frank);
        System.out.println(kurt);
        System.out.println(bill);


    }
}
