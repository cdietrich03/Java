package week9.studentStuf;

import java.util.ArrayList;
import java.util.Collections;

public class Student {

    public Major studentMajor;
    private String name;
    public int ID;
    private static int nextID = 100;
    public ArrayList<Course> courseList;
    private boolean sorted;

    public Student(String name, Major studentMajor) {
        this.studentMajor = studentMajor;
        this.name = name;
        this.ID = nextID;
        nextID ++;
        courseList = new ArrayList<>();
        this.sorted = true;
    }

    public void addCourse(Course newCourse) {
        if ((!courseList.contains(newCourse))) {
            courseList.add(newCourse);
            sorted = false;
        }
    }

    public void removeCourse(Course course) {
        if (courseList.contains(course)) {
            courseList.remove(course);
        }
    }

    public boolean precedesById(Student student) {

        boolean precede = false;
        if (this.ID < student.ID) {
            precede = true;
        }

     return precede;}

    public void changeName(String newName) {
        this.name = newName;
    }

    public String toString() {


        String out = name + "'s ID is " + ID + " and they are taking these courses: \n";
        if (studentMajor.qualifyForMajor(courseList) == true) {
            out += name + " qualifies for this major!";
        }
        else if (studentMajor.qualifyForMajor(courseList) == false) {
            out += name + " does not qualify for this major!";
        }
        if (courseList.size() == 0) {
            out += name + " needs to register for classes.";
        }
        else if (courseList.size() < 3) {
            out += name + " is not full time.";
        }
        if (sorted = false) {
            Collections.sort(courseList);
            out += courseList;
            sorted = true;
        }
        else {
            out += courseList;
        }
            return out;

        }
}
