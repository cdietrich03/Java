package week10;

import java.util.Arrays;

public class OurStack {

    private static final int DEFAULT_CAPACITY = 10;
    private String[] elements;
    private int size;

    public OurStack() {
        elements = new String[DEFAULT_CAPACITY]; // a string array if size 10
        size = 0;
    }

    public void push(String item) {
        if (size >= 10) {
            this.increaseCapacity();
        }
        else {
            elements[size] = item;
            size++;
        }
    }

    public String pop() {
        String top = "";
        if (size > 0) {
            top = elements[size - 1];
            size--;
        }
        return top;
    }

    public String peek() {
        String top = "";
        if (size > 0) {
            top = elements[size - 1];
        }
        return top;
    }

    private void increaseCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public String toString() {
        String out = "";
        for (int count = size - 1; count >= 0; count--) {
            out = out +  elements[count] + " ";
        }
        return out;
    }

}
