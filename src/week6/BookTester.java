package week6;

public class BookTester {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "JK Rawlings", 20.20);
        System.out.println(book1);
        book1.changePrice(10.10);
        System.out.println(book1.priceBook());
    }
}
