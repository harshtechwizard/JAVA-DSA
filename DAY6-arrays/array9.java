// Reversing an aray in Java
import java.util.Scanner;
public class array9 {
    public static void reverseArray(int arr[]){
        int temp[] = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            


        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter " + (i+1) + " Element: ");
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);
        System.out.println(arr[0]);
        sc.close();

    }
}
