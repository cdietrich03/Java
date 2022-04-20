package week5;



public class StudentSchedule {
    public static void main(String[] args) {
        Course cmsc2 = new Course("CMSC", "155", 4);
        Course cmsc1 = new Course("CMSC", "150", 4);
        Course bio = new Course("Bio", "111", 4);
        Course chem = new Course("Chem", "102", 4);
        Course foundations = new Course("Foundations", "111", 4);

        System.out.println(cmsc1.equals(cmsc2));

        Student bob1 = new Student("Bob Smith", 971);

        Student Bob = new Student("Bob", 1111111);

        System.out.println(Bob);
        System.out.println(" ");


        bob1.addCourse(cmsc1);
        System.out.println(bob1);
        System.out.println(" ");

        bob1.addCourse(cmsc2);
        System.out.println(bob1);
        System.out.println(" ");

        bob1.addCourse(cmsc1);
        System.out.println(bob1);
        System.out.println(" ");

        bob1.removeCourse(bio);
        System.out.println(bob1);
        System.out.println(" ");

        bob1.removeCourse(cmsc1);
        System.out.println(bob1);
        System.out.println(" ");

        bob1.addCourse(cmsc1);
        System.out.println(bob1);
        System.out.println(" ");

        bob1.addCourse(chem);
        System.out.println(bob1);
        System.out.println(" ");

        bob1.addCourse(foundations);
        System.out.println(bob1);
        System.out.println(" ");

        bob1.addCourse(bio);
        System.out.println(bob1);
        System.out.println(" ");

        WorkStudyStudent bill = new WorkStudyStudent("Bill", 1237, 8);
        System.out.println(bill);
    }
}
