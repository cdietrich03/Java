package week4;

public class Student {

    private String name;
    public int ID;
    private static int nextID = 100;

//    public Student(String name, String ID) {
//        this.name = name;
//        this.ID = ID;
//    }

    public Student(String name, int ID) {
        this.name = name;
        this.ID = nextID;
        nextID ++;
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
    String out = name + "'s ID is " + ID;
    return out;
    }

}
