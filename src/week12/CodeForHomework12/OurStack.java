package week12.CodeForHomework12;

import java.util.Arrays;

public class OurStack<E> {

    private E[] elements;
    private int size;

    public OurStack(E[] emptyStack) {
        elements = emptyStack;
        size = 0;
    }

    public void push(E item) {
        if (size >= elements.length) {
            increaseCapacity();
        }
        elements[size] = item;
        size++;
    }

    public E pop() {
        E top = null;
        if (size > 0) {
            top = elements[size-1];
        }
        size--;
        return top;
    }

    public E peek() {
        E top = null;
        if (size > 0) {
            top = elements[size-1];
        }
        return top;
    }

    private void increaseCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public String toString() {
        String out = "";
        for (int count = 0; count < size; count++) {
            out = out +  elements[count] + " ";
        }
        return out;
    }

}
