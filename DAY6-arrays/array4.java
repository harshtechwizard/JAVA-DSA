// Finding Max and Min element in an Array
// public class array4 {
//     public static int getSmallest(int arr[]){
//         int smallest = Integer.MAX_VALUE;
//         for(int i =0;i<arr.length;i++){
//             if (smallest>arr[i]) {
//                 smallest = arr[i];
//             }
//         }
//         return smallest;
//     }
//     public static void getLargest(int arr[]){
//         int largest = Integer.MIN_VALUE;
//         for(int i = 0;i<arr.length;i++){
//             if (largest<arr[i]) {
//                 largest = arr[i];
//             }
//         }
//         System.out.println(largest);
//     }
//     public static void main(String[] args) {
//         int number[] = {23,34,46,67,10,56};
//         System.out.println(getSmallest(number));
//         getLargest(number);
//     }
// Program to find whether an element is smallest or not and same for largest
public class array4 {
    public static boolean isSmallest(int arr[],int key){
        for(int i = 0; i< arr.length;i++){
            if (key>arr[i]) {
                return false;
            }

        }
        return true;

    }

    public static boolean isLargest(int arr[],int key){
        for(int i = 0; i< arr.length;i++){
            if (key<arr[i]) {
                return false;
            }

        }
        return true;

    }
    public static void main(String[] args) {
        int key = 45;
        int num[] = {23,45,6,2};
        System.out.println(isSmallest(num, key));
        System.out.println(isLargest(num, key));




    }
}