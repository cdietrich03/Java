package week1;

public class Pet {

    //attributes
    private static int numPetObjects = 0;
    private String type;
    private String name;
    private int numberOfPets;

    //constructor
    public Pet(String type, String name, int number) {
        this.type = type;
        this.name = name;
        numberOfPets = number;
        numPetObjects++;
    }
    //other methods
    public void petThePet(int times) {
        numberOfPets += times;
    }

    public static int getNumPetObjects() {
        return numPetObjects;
    }

    public void sameName(int x) {
        System.out.println("The integer is " + x);
    }

    public void sameName(int x, int y) {
        System.out.println("The string is " + x);
    }

    //print method
    public String toString() {
        String out = name + " is a " + type;
        out += " who has been petted " + numberOfPets + " times.";
        return out;
    }

}
