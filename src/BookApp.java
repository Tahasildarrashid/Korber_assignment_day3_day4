package day3_4;

import java.util.*;
import java.io.*;

public class BookApp {
    private List<Book> books;
    Book b1;
    String tokens[];
    public BookApp() {
        books = new ArrayList<Book>();
        init();
    }

    // reading the data from the file and populating the arraylist
    private void init() {
        String line = null;

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\rashid.tahasildar\\Desktop\\day3&4\\src\\data"));
            while ((line = br.readLine()) != null) {
                tokens = line.split(":");
                Book book = new Book(Integer.parseInt(tokens[0]), tokens[1], tokens[2], tokens[3],
                        Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5]));
                books.add(book);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Input Output Error was faced");
        }
    }

    public void display()
    {
        for(Book b: books)
        {
            System.out.println(b);
        }
    }

    public void searchBook(String Bookname)
    {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(Bookname)) {
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("Book found");
        else throw new BookNotFoundException("Book " + Bookname + " was not found");
    }

    public Book findbookbyisbn(String isbn)
    {
        for(Book b1: books)
        {
            if(b1.getSbn().equals(isbn))
            {
                return b1;
            }
        }
        return null;
    }

    public void sellBook(String isbn, int noOfCopies) {
        Book book = findbookbyisbn(isbn);

        if (noOfCopies <= book.getNo_of_copies()) {
            int temp = book.getNo_of_copies() - noOfCopies;
            book.setNo_of_copies(temp);
            System.out.println("Sold " + noOfCopies + " copies of book: " + book.getTitle());
        } else {
            throw new NotSufficientBooksException("Not enough copies available");
        }
    }

    public void purchaseBook(String isbn, int noOfCopies) {
        Book book = findbookbyisbn(isbn);
        if(book == null)
            throw new BookNotFoundException("Book not found");
        else if (noOfCopies <= book.getNo_of_copies()) {
            int temp = book.getNo_of_copies() - noOfCopies;
            book.setNo_of_copies(temp);
            System.out.println("Purchased " + noOfCopies + " copies of book: " + book.getTitle());
        } else {
            throw new BookNotFoundException("Book not found");
        }
    }
}