package week4;

public class StudentSchedule {
    public static void main(String[] args) {
        Course cmsc = new Course("CMSC", "155", 4);
        Student Bob = new Student("Bob", "1111111");

        System.out.println(cmsc);
        System.out.println(Bob);

        Bob.changeName("Mary");
        System.out.println(Bob);

        Student Fred = new Student("Fred");
        System.out.println(Fred);
    }
}
