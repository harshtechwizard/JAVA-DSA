import java.util.Scanner;
public class loops1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = sc.nextInt();
        // while (counter<=4) 
        // {
        //     System.out.println("hello");
        //     counter++;
        // }
        // while (counter<=10) {
        //     System.out.println(counter);
        //     counter++;
        // }
        int counter = 1;
        int sum = 0;
        while (counter<=number) {
                sum = sum + counter;
                counter++;
        }
        System.out.println("The final sum is " + sum);
    }
}
