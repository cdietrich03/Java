package week9.studentStuf;

import java.util.ArrayList;

public class Math implements Major {
    public boolean qualifyForMajor(ArrayList<Course> courses){
        int count = 0;
        boolean major = false;
        for (Course course : courses) {
            if (course.getDepartment ().equals("Math") && course.getCourseNumber() >= 200){
                count++;
            }

        }if (count >= 3) {
            major = true;
        } return major;
    }
    public String toString () {
        return "Math";
    }
}
