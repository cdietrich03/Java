package week4;

public class StudentSchedule {
    public static void main(String[] args) {
        Course cmsc = new Course("CMSC", "155", 4);
        Student Bob = new Student("Bob", 1111111);

        Student bob1 = new Student("Bob Smith", 971);
        Student bob2 = new Student("Bob Jones", 4321);

        System.out.println(cmsc);
        System.out.println(Bob);

        Bob.changeName("Mary");
        System.out.println(Bob);
//
//        Student Fred = new Student("Fred");
//        System.out.println(Fred);
//        System.out.println(bob1.precedesById(bob2));
    }
}
