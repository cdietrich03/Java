package week9;

import java.util.ArrayList;

public class Libraryog {

    //instance variables
    private String libraryName;
    private ArrayList<Book> bookList;

    //constructor
    public Libraryog(String name) {
        libraryName = name;
        bookList = new ArrayList<>();
    }

    //other methods
    public void addBook(Book newBook) {
        if (!bookList.contains(newBook)) {
            bookList.add(newBook);
        }
    }

    public void removeBook(Book bookToRemove) {
        if (bookList.contains(bookToRemove)) {
            bookList.remove(bookToRemove);
        }
    }

    //Print method
    public String toString() {
        String out = libraryName + " has the following books: ";
        for (Book book : bookList) {
            out = out + book + ", ";
        }
        return out;
    }
}
