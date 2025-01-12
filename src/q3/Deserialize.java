package day3_4.q3;

import java.io.*;

public class Deserialize {
    public static void main(String[] args) throws ClassNotFoundException, IOException{
        ObjectInputStream os=
                new ObjectInputStream(new FileInputStream(new File("C:\\Users\\rashid.tahasildar\\Desktop\\day3&4\\src\\q3\\Demo.ser")));
        DemoSerialize account=(DemoSerialize) os.readObject();
        account.display();
    }
}
