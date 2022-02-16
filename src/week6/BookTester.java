package week6;

public class BookTester {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "JK Rawlings", 20.20);
        System.out.println(book1);
        book1.changePrice(10.10);
        System.out.println(book1.priceBook());

        Textbook txtbook1 = new Textbook("Big Java", 150, "Cayman", "Computer Science");
        System.out.println(txtbook1);
        txtbook1.addResource("www.book.com");
        System.out.println(txtbook1);

        Book test = book1;
        test.doSomething();
    }
}
