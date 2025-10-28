import java.util.Scanner;
public class fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        if(n%3==0){
            if (n%5==0) {
                System.out.println("FizzBuzz");
            }
            else{
                System.out.println("Fizz");
            }
        }
        else if ((n%5==0)&&(n%3!=0)) {
            System.out.println("Buzz");
        }
        else if ((n%5!=0)&&(n%3!=0)) {
            System.out.println(n);
        }
    }
}
