package day3_4.q1CharStream;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try {
            FileReader fr = new FileReader("C:\\Users\\rashid.tahasildar\\Desktop\\day3&4\\src\\q1CharStream\\vkholi.jpg");
            FileWriter fw = new FileWriter("C:\\Users\\rashid.tahasildar\\Desktop\\day3&4\\src\\q1CharStream\\output.jpg");
            int i = 0;
            while ((i = fr.read()) != -1) {
                fw.write(i);
            }
            fw.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("File is written");
        System.out.println("Time taken: " + (end - start) + "ms");
    }
}
