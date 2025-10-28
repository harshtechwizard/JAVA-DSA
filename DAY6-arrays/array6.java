// All pairs in an array
public class array6 {
    public static void pairs(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length;i++){
            int current = arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("(" + current + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
    

        }
        System.out.println(tp);
    }

    public static void main(String[] args) {
        int num[] = {2,4,5,6,7};
        pairs(num);


    }
}
