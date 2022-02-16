package week6;

import java.util.ArrayList;

public class Textbook extends Book{
    private String subject;
    private ArrayList<String> resources;

    public Textbook(String title, double price, String author, String subject) {
        super(title, author, price);
        this.subject = subject;
        resources = new ArrayList<>();
    }
    public void addResource(String newResource) {
        if(!resources.contains(newResource)) {
            resources.add(newResource);
        }
    }
    @Override
    public void doSomething() {
        System.out.println("In Textbook");
    }


    public String toString() {
            return super.toString() + " subject " + subject + " with resources " + resources;
        }
    }

