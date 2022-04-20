package week9.studentStuf;

import java.util.ArrayList;

public class WorkStudyStudent extends Student {
    private int hoursWorked;
    private static int nextID = 100;
    public ArrayList<Course> courseList;

    public WorkStudyStudent(String name, Major studentMajor, int hoursWorked) {
        super(name, studentMajor);
        this.ID = nextID;
        nextID ++;
        this.hoursWorked = hoursWorked;
        courseList = new ArrayList<>();
    }

    public void addHours (int hours) {
        this.hoursWorked += hours;
    }

    public String toString(){
        return super.toString() + "They are a work-study student and they earned " + (hoursWorked * 7.25) + " dollars.";
    }
}