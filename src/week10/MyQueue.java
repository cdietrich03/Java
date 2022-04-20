package week10;

import week9.Node;

import java.util.LinkedList;

public class MyQueue {

    private int currentSize;
    private LinkedList<String> theQueue;

    public MyQueue() {
        theQueue = new LinkedList<>();
        currentSize = 0;
    }

    public void enqueue(String addqueue) {
        theQueue.add(addqueue);
    }

    public String dequeue() {
        return theQueue.remove(0);
    }

    public String peek () {
        return theQueue.get(0);
    }

    public int size() {
        return theQueue.size();
    }


    public String toString() {
        String out = "";
        out = out + theQueue;
        return out;
    }
}

