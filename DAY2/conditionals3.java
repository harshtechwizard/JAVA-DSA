import java.util.Scanner;
public class conditionals3 {
    public static void main(String args[]){
        // // int number = 23;
        // // String t= (number%2==0) ? "Even" : "odd";
        // // System.out.println(t);
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your income: ");
        // int income = sc.nextInt();
        // float tax = (income<500000) ? 0 : (income<1000000) ? 0.20f * income : 0.30f *income;
        // System.out.println(tax);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number A : ");
        int a = sc.nextInt();
        System.out.print("Enter a number B: ");
        int b = sc.nextInt();
        System.out.println("Enter an operator");
        char operator = sc.next().charAt(0);
        int c=0;

        switch (operator) {
            case '+':
                c = a + b;
                break;
            case '-':
                c = a - b;
                break;
            case '*':
                c = a * b;
                break;
            case '/':
                c = a / b;
                break;
            default:
                break;
        }

        System.out.println(c);



        
    }
}
