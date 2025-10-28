// Finding pivot element in an array
public class array10{
    public static void main(String[] args) {
        int arr[] = {1,4,7,5,8,4};
        int total_sum = 0;
        for(int i=0;i<arr.length;i++){
            total_sum += arr[i];
        
        }
        int left_sum = 0;
        for(int i=0;i<arr.length;i++){
            int right_sum = total_sum - left_sum - arr[i];
            if (left_sum == right_sum) {
                System.out.println(arr[i]);
                return;
            }
            left_sum += arr[i];
        }
    }
}