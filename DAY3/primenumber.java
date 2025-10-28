import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();
        // int counter = 0;
        // for(int i = 1 ; i <= n; i++){
        //     if (n%i==0) {
        //         counter = counter + 1;
                
        //     }
            
        // }
        // if (counter==2) {
        //     System.out.println("Prime number");
            
        // }else{
        //     System.out.println("Not Prime");
        // }
        boolean isPrime = true;
        if (n<=1) {
            System.out.println("Not prime");
            
        }
        else{

        
        for(int i =2 ; i<=n-1; i++){
            if (n%i==0) {
                isPrime = false;
                break;
            }
            
        }
        if (isPrime == true) {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }

    }
    sc.close();
    }
}
