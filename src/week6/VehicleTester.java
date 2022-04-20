package week6;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle subaru = new Vehicle(4, "car", "green", "Bob");
        System.out.println(subaru);

        Vehicle bicycle = new Vehicle(2, "bike", "pink", "Matilda");
        System.out.println(bicycle);

        subaru.sellVehicle("Peg");
        System.out.println(subaru);
    }
}
