package day3_4.q1ByteStream;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

		try {
			FileInputStream fr = new
					 FileInputStream("C:\\Users\\rashid.tahasildar\\Desktop\\day3&4\\src\\q1ByteStream\\vkholi.jpg");
			FileOutputStream fw =
					new FileOutputStream("C:\\Users\\rashid.tahasildar\\Desktop\\day3&4\\src\\q1ByteStream\\output.jpg");

//			BufferedInputStream fr = new
//					BufferedInputStream(new FileInputStream("C:\\Users\\rashid.tahasildar\\Desktop\\day3&4\\src\\q1ByteStream\\vkholi.jpg"));
//			BufferedOutputStream fw = new BufferedOutputStream(
//					new FileOutputStream("C:\\Users\\rashid.tahasildar\\Desktop\\day3&4\\src\\q1ByteStream\\output.jpg"));

			int i = 0;
			while ((i = fr.read()) != -1) {
				fw.write(i);
			}
			fw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

        long end = System.currentTimeMillis();
        System.out.println("Total time taken is " + (end - start) + " ms");
    }
}
