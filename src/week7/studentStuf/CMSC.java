package week7.studentStuf;

import java.util.ArrayList;

public class CMSC implements Major{
    public boolean qualifyForMajor(ArrayList<Course> courses) {
        int count = 0;
        int count2 = 0;
        boolean major = false;
        for (Course course : courses) {
            if (course.getDepartment ().equals("CMSC") && course.getCourseNumber() >= 300){
                count++;
            }
            if (course.getDepartment().equals("CMSC")) {
                count2++;
            }

        }if (count >= 1 && count2 >= 3) {
            major = true;
        } return major;
    }

    public String toString() {
        return "CMSC";
    }
}
