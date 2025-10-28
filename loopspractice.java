import java.util.Scanner;

public class loopspractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        // int even_sum=0;
        // int odd_sum=0;
        // int choice;
        // do{
            
        // System.out.print("Enter a number");
        // int n = sc.nextInt();            if (n%2==0) {
        //         even_sum = even_sum + n;
                
        //     }
        //     else{
        //         odd_sum = odd_sum + n;
        //     }
            
        // System.out.println("Enter choice (0 to stop and 1 to continue)");
        // choice = sc.nextInt();


        // }while(choice==1);
        // System.out.println("The  even_sum is " + even_sum);
        // System.out.println("The  odd_sum is " + odd_sum);
        int number = sc.nextInt();
        for(int i = 1; i<=10;i++){
            System.out.println(number + "*" + i + "=" + (number*i));
        }


        
    }
}
