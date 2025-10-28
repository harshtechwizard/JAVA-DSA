import java.util.Scanner;
import java.math.*;

public class javabasics5 {
    public static void main(String[] args) {
        // Taking input in Java
        // Scanner sc = new Scanner(System.in); // Object creation

        // // Taking string input (reads only one word, stops at space)
        // System.out.print("Enter a number : ");
        // int input = sc.nextInt();

        // sc.nextLine();

        // // Taking integer input
        // String number = sc.nextLine(); // Changed variable name from `num` to `number`
        // System.out.println("The input is " + input);

        // System.out.println("The input number is " + number);

        // sc.close(); // Closing the scanner to prevent memory leaks
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number ");
        // int a = sc.nextInt();
        // System.out.print("Enter another number ");
        // int b = sc.nextInt();
        // int c = a + b ;
        // System.out.println("sum of a and b is "+ c);
        // sc.close();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        float r = sc.nextFloat();
        float area = (float) (Math.PI * Math.pow(r, 2));
        System.out.println("The area of circle is " + area);
    }
}
