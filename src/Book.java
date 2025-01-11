package day3_4;

public class Book {
    private int id;
    private String sbn;
    private String title;
    private String author;
    private int price;
    private int no_of_copies;

    public Book(int id, String sbn, String title, String author, int price, int no_of_copies) {
        this.id = id;
        this.sbn = sbn;
        this.title = title;
        this.author = author;
        this.price = price;
        this.no_of_copies = no_of_copies;
    }

    public int getId() {
        return id;
    }

    public String getSbn() {
        return sbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getNo_of_copies()
    {
        return no_of_copies;
    }

    public void setNo_of_copies(int num)
    {
        this.no_of_copies = num;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", sbn='" + sbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", no_of_copies=" + no_of_copies +
                '}';
    }
}
