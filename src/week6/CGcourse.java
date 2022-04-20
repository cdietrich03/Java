package week6;


public class CGcourse extends Course {
    private String location;

    public CGcourse (String location, String department, String courseNumber, int creditHours) {
        super(department, courseNumber, creditHours);
        this.location = location;
    }

    public String toString () {
        return super.toString() + ", EWG course in " + location;
    }
}
