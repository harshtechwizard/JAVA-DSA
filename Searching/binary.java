import java.util.*;

public class binary {
    public static void binary(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index " + mid);
                return;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements (unsorted allowed):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // ✅ Sort array before performing binary search
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        System.out.println("Enter key to search: ");
        int key = sc.nextInt();

        // ✅ Perform binary search
        binary(arr, key);
    }
}
