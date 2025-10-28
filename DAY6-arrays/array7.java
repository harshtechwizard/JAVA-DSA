// Printing SubArrays
public class array7 {
    public static void subarray(int arr[]){
        int count =0;
        for(int i = 0; i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum =0;

                for(int k = i;k<=j;k++){


                    System.out.print(arr[k]+ " ");
                    // sum += arr[k];
                    // // count++;
                    // System.out.println(sum);

                }
                System.out.println();

            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        subarray(num);
    }
}
