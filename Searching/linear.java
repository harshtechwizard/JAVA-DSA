import java.util.*;
public class linear {
    public static void linear(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Element found at index " + i);
                return;
            }
            else{
                System.out.println("Element not found");
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            System.out.println("Enter element " + (i+1) + " : ");
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter key : ");
        int key = sc.nextInt();
        linear(arr,key);
        sc.close();



        
    }
}
