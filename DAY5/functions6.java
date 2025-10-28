// public class functions6 {
//     public static boolean isPrime(int n){
//        boolean isPrime = true;
//        if (n=1) {
//         System.out.println("Not applicable");
//        }
//        for(int i=2;i<=Math.sqrt(n);i++){
//         if (n%i==0) {
//             isPrime = false;
//         }

//        }
//        return isPrime;
//     }
//     public static void range(int n){
//         for(int i = 2; i<=n ;i++){
//             if (isPrime(i)) {
//                 System.out.println(i);
//             }
        
        
//     }

// }
//     public static void main(String[] args) {
//        range(15);
//     }
// }
// next program for counting the number of primes in range
import java.util.Scanner;

public class functions6 {

    public static boolean isPrime(int n){
        boolean isPrime = true;
        if (n<2) {
            isPrime = false;
        }
        for(int i =2;i<=Math.sqrt(n);i++){
            if (n%i==0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
    // public static void range(int n){
    //     for(int i = 2; i<= n;i++){
    //         if (isPrime(i)) {
    //             System.out.println(i);
    //         }
    //     }
    // }
    public static int countrange(int n){
        int count = 0;
        for(int i = 2; i<= n;i++){
            if (isPrime(i)) {
                count++;
            }

        }
        System.out.println(count);

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to be checked : ");
        int n = sc.nextInt();
        countrange(n);
        
    }
}