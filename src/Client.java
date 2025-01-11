package day3_4;

public class Client {
    public static void main(String[] args) {
        Book book = new Book(1, "ten", "DSA with Java", "Gosling", 5678, 5);
        System.out.println(book.toString());

        BookApp b = new BookApp();

        b.display();

        b.searchBook("java");
        b.purchaseBook("jko", 3);
        b.sellBook("A234", 123);


    }
}
