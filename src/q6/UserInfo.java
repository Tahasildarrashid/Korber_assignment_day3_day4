package day3_4.q6;

import java.util.*;

public class UserInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter the age");
            int n1 = sc.nextInt();
            if(n1 < 18 || n1 > 60)
                throw new InvalidAgeException("Enter a valid age");
        }
        finally {
            System.out.println("Gracefully Exiting the code ");
        }
    }
}
