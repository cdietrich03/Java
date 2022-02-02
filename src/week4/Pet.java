package week4;

public class Pet {

    //attributes
    private static int numberOfPetExist = 0;
    private String type;
    private String name;
    private int numberOfPets;

    //constructor
    public Pet(String type, String name, int numberOfPets) {
        this.type = type;
        this.name = name;
        this.numberOfPets = numberOfPets;
        numberOfPetExist++;
    }

    //other methods
    public static int getNumberOfPetExist() {
        return numberOfPetExist;
    }

    public void petThePet(int times) {
        numberOfPets += times;
    }

//    public void sameName (int x) {
//        System.out.println("The integer is x");
//    }
// above and below is overloaded, only works with dif variable types
//    public void sameName(String x) {
//        System.out.println("The string is " + x);
//    }

    //print method
    public String toString() {
        String out = name + " is a " + type;
        out += " who has been pet " + numberOfPets + " times. ";
        return out;
    }

}