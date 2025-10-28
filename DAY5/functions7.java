// //  Write a program to test isEven 

// // import java.util.Scanner;

// // public class functions7 {
// //     public static boolean isEven(int n){
// //         boolean isEven = false;
// //         if (n%2==0) {
// //             isEven = true;
// //         }
// //         return isEven;

// //     }
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter a number");
// //         int n = sc.nextInt();
// //         System.out.println(isEven(n));

// //     }
// // }
// // Program to check whether a number is palindrome or not

// // import java.util.Scanner;

// // public class functions7 {
// //     public static boolean palindrome(int n){
// //         int original = n;
// //         int reverse = 0;
// //         while (n>0) {
            
        
// //         int last_digit = n % 10;
// //         reverse = (reverse * 10) + last_digit;
// //         n = n/10;
// //         }
// //         if (reverse == original) {
// //             return true;
// //         }
// //         else{
// //             return false;
// //         }

// //     }

// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter a number : ");
// //         int n = sc.nextInt();
// //         System.out.println(palindrome(n));


// //     }
// // }
// // Sum of digits in an integer
// import java.util.Scanner;

// public class functions7 {
//     public static int sum(int n){
//         // int original = n;
//         int sum = 0;
//         while (n>0) {
            
        
//         int last_digit = n % 10;
//         sum = sum + last_digit;
//         n = n/10;
//         }
//         return sum;

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int n = sc.nextInt();
//         System.out.println(sum(n));
//     }
// }