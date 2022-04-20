package week6;

public class Course {

    private String department;
    private String courseNumber;
    private int creditHours;

    public Course(String department, String courseNumber, int creditHours){
        this.department = department;
        this.courseNumber = courseNumber;
        this.creditHours = creditHours;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Course) {
            Course otherCourse = (Course) obj;
            return department.equals(otherCourse.department) &&
                    courseNumber == otherCourse.courseNumber &&
                    creditHours == otherCourse.creditHours;
        } else return false;
    }


    public String toString() {
        String out = "Course number " + courseNumber + " within ";
        out += department + " worth " + creditHours + " credit hours";
        return out;
    }
}
