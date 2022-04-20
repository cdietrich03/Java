package week6.shapes;

public interface Shape {
    final int DIME = 100;

    double computeArea();
    void doSomething(int x);

    static int multiply(int one, int two) {
        return one * two;

    }
}
