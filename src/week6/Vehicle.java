package week6;

public class Vehicle {
    private int numberOfWheels;
    private String typeOfVehicle;
    private String color;
    private String owner;

    public Vehicle (int numberOfWheels, String typeOfVehicle, String color, String owner) {
        this.color = color;
        this.numberOfWheels = numberOfWheels;
        this.owner = owner;
        this.typeOfVehicle = typeOfVehicle;
    }

    public void sellVehicle(String newOwner) {
        this.owner = newOwner;
    }

    public String toString() {
        String out = owner + " owns a " + typeOfVehicle + " with " + numberOfWheels + " wheels and it's " + color + ".";
        return out;
    }
}
