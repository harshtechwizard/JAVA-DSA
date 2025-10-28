import java.util.Scanner;

public class loops3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be reversed");
        int n = sc.nextInt();
        int reversed = 0;
        int last_digit = 0;
        while (n>0) {
            last_digit = n % 10;
            reversed = (reversed * 10) + last_digit;

            n = n/10;
            
        }
        System.out.println(reversed);

        
    }
}
