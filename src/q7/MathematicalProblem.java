package day3_4.q7;

import java.util.*;

public class MathematicalProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first number ");
            int n1 = scanner.nextInt();
            System.out.print("Enter the second number ");
            int n2 = scanner.nextInt();
            int quotient = n1 / n2;
            System.out.println(quotient);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by zero Error Caught");
        }
        finally {
            System.out.println("Inside finally block");
        }



    }
}
