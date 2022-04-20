package week7.studentStuf;

public class CGcourse extends Course {
    private String location;

    public CGcourse(String location, String department, int courseNumber, int creditHours) {
        super(department, courseNumber, creditHours);
        this.location = location;
    }

    public String toString () {
        return super.toString() + ", EWG course in " + location;
    }
}
