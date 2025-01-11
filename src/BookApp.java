package day3_4;

import java.util.*;
import java.io.*;

public class BookApp {
    private List<Book> books;

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
                String tokens[] = line.split(":");
                Book book = new Book(Integer.parseInt(tokens[0]), tokens[1], tokens[2], tokens[3],
                        Integer.parseInt(tokens[4]));
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

    public void sellBook()
    {

    }
}