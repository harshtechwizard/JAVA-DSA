import java.util.Scanner;
public class loops2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number ");
        int n = sc.nextInt();
        while(n>0){
            int last_digit = n % 10;
            System.out.print(last_digit);
            n = n/10;
        }
        sc.close();

        // for(int i=1;i<=5;i++)
        // System.out.println("HI");
        // for(int i=1;i<5;i++){
        //     System.out.println("****");
        // }
        // int counter = 1;
        // while(counter<5){
        //     System.out.println("****");
        //     counter++;
        // }       
            }
}

