package week4;

public class PetTester {
    public static void main(String[] args) {
        Pet cat = new Pet("cat", "Bill", 5);
        System.out.println(cat);
//        cat.petThePet(5);
//        System.out.println(cat);
//        cat.sameName("4");
        System.out.println(Pet.getNumberOfPetExist());
    }
}
