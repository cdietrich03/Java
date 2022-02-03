package week4;

public class Student {

    private String name;
    private String ID;

    public Student(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public void changeName(String newName) {
        this.name = newName;
    }

    public String toString() {
    String out = name + "'s ID is " + ID;
    return out;
    }

}
