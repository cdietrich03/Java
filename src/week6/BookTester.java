package week6;

public class BookTester {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "JK Rawlings", 20.20);
        System.out.println(book1);
        book1.changePrice(10.10);
        System.out.println(book1);
        book1.changePrice(10.10);
        System.out.println(book1);

        Book book2 = new Book("The Bob Book", "Bob", 30.00);
        System.out.println(book2);
        book2.changePrice(15.00);
        System.out.println(book2);
        book2.changePrice(30.00);
        System.out.println(book2);

        Textbook txtbook2 = new Textbook("Chem 101", 100, "Bill", "Chem");
        System.out.println(txtbook2);


        Textbook txtbook1 = new Textbook("Big Java", 150, "Cayman", "Computer Science");
        System.out.println(txtbook1);
        txtbook1.addResource("www.book.com");
        System.out.println(txtbook1);


    }
}
