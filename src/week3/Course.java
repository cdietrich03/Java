package week3;

public class Course {

    private String department;
    private String courseNumber;
    private int creditHours;

    public Course(String department, String courseNumber, int creditHours){
        this.department = department;
        this.courseNumber = courseNumber;
        this.creditHours = creditHours;
    }

    public String toString() {
        String out = "This course is number " + courseNumber + " within ";
        out += department + " department and is worth " + creditHours + " credit hours.";
        return out;
    }
}
