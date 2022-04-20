package week7.studentStuf;

import java.util.ArrayList;

public class Course {

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
