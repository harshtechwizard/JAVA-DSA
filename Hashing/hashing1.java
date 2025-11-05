// public class hashing1 {
//     public static void main(String[] args) {
//         String s ="harsh";
//         int arr[]=new int[256];
//         for(int i=0;i<s.length();i++){
//             char c =s.charAt(i);
//             arr[c-'a']++;
//         }
//         for(int i=0;i<256;i++){
//             if (arr[i]>0) {
//                 System.out.println((char)(i+'a')+" "+arr[i]);
//             }
//         }

//     }
// }

import java.util.Scanner;

public class hashing1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of strings : ");
        int n = sc.nextInt();
        String arr[] = new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter string " + (i+1) + " : ");
            arr[i]=sc.next();
        
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        

    }
}