package week9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Library {

    //instance variables
    private String libraryName;
    private LinkedList<Book> bookList;

    //constructor
    public Library(String name) {
        libraryName = name;
        bookList = new LinkedList<>();
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
        String out = libraryName + " has the following books: \n";

        ListIterator<Book> iter = bookList.listIterator();
        while (iter.hasNext()) {
            out = out + iter.next() + "\n";
        }
        return out;
    }
}
