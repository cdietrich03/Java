package week7.ipadExample;

public class Product {
    private iPadTesting type;

    public Product(iPadTesting type) {
        this.type = type;
    }

    public double computePrice() {
        return type.computePrice();
    }

    public String toString() {
        return type + " and costs $ " + computePrice();

    }

}
