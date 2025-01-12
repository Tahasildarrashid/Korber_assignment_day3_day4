package day3_4.q3;

import java.io.*;

class DemoSerialize implements Serializable {
    private int id;
    private String name;
    private String address;
    private double salary;

    public DemoSerialize(int id, String name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public void display()
    {
        System.out.println("id is " + id);
        System.out.println("Name is " + name);
        System.out.println("Address is " + address);
        System.out.println("salary is " + salary);
    }
}

public class Serialize
{
    public static void main(String[] args) throws IOException {
        ObjectOutputStream os=
                new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\rashid.tahasildar\\Desktop\\day3&4\\src\\q3\\Demo.ser")));

        DemoSerialize account = new DemoSerialize(1,"rashid", "yeshwanthpura", 12345.98);
        os.writeObject(account);

        System.out.println("done");
    }
}

