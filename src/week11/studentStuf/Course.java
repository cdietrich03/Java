package week11.studentStuf;

public class Course implements Comparable <Course> {

    private String department;
    private int courseNumber;
    private int creditHours;

    public Course(String department, int courseNumber, int creditHours) {
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

    public int compareTo(Course course) {
            if (department.compareTo(course.department) == 0){
                if (courseNumber < course.courseNumber) {
                    return -1;
                } else if (courseNumber > course.courseNumber) {
                    return 1;
                } else {
                    return 0;   }
            } else {
                return department.compareTo(course.department);
            }


    }
        public String getDepartment() {
        return department;
    }

    public int getCourseNumber () {
        return courseNumber;
    }

        public String toString () {
            String out = "Course number " + courseNumber + " within ";
            out += department + " worth " + creditHours + " credit hours";
            return out;
        }
    }
