package day3_4;

public class Client {
    public static void main(String[] args) {
        Book book = new Book(1, "ten", "DSA with Java", "Gosling", 5678);
        System.out.println(book.toString());
        BookApp b = new BookApp();
        b.display();
    }
}
