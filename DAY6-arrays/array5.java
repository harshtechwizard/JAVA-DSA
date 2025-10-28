// Binary Search for sorted arrays
public class array5 {
    public static void BinarySearch(int arr[],int key){
        int start = 0;
        int end = arr.length-1;
        
        while (start<=end) {
            int mid = (start+end)/2;
            if (key == arr[mid]) {
                System.out.println("Element found ");
                return;
            }
            else if (key <= arr[mid]) {
                end = mid-1;
            }
            else{
                start=mid+1;

            }
        }
        System.out.println("Element not found");
    }
    public static void main(String[] args) {
        int num[] = {2,34,56,78,99};
        int key = 78;
        BinarySearch(num, key);
    }
}