package week4;

public class Student {

    private String name;
    public String ID;
    private static int nextID = 0;

    public Student(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }


    public Student(String name) {
        this.name = name;
        ID = "0111111";
        nextID ++;

    }

    public void changeName(String newName) {
        this.name = newName;
    }

    public String toString() {
    String out = name + "'s ID is " + ID;
    return out;
    }

}
