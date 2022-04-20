package week5;

import java.util.ArrayList;

public class WorkStudyStudent extends Student {
    private int hoursWorked;

    public WorkStudyStudent(String name, int ID, int hoursWorked) {
        super(name, ID);
        this.hoursWorked = hoursWorked;
        courseList = new ArrayList<>();
    }

    public void addHours (int hours) {
        this.hoursWorked += hours;
    }

    public String toString(){
        return super.toString() + " They are a work-study student and they earned " + (hoursWorked * 7.25) + " dollars.";
    }
}

