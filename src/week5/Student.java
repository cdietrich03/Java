package week5;

import java.util.ArrayList;

public class Student {

    private String name;
    public int ID;
    private static int nextID = 100;
    public ArrayList<Course> courseList;

//    public Student(String name, String ID) {
//        this.name = name;
//        this.ID = ID;
//    }

    public Student(String name, int ID) {
        this.name = name;
        this.ID = nextID;
        nextID ++;
        courseList = new ArrayList<>();
    }

    public void addCourse(Course newCourse) {
        if ((!courseList.contains(newCourse)) && courseList.size() < 4 ) {
            courseList.add(newCourse);
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
    String out = name + "'s ID is " + ID + " and they are taking these courses: " + courseList;
    if (courseList.size() == 0) {
        out += name + " needs to register for classes.";
    }
    else if (courseList.size() < 3) {
        out += name + " is not full time.";
    }
        return out;

    }
}
