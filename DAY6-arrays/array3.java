// Linear Search 
public class array3 {
    public static boolean linear(int arr[],int key){
        for(int i=0;i<=arr.length-1;i++){
            if (key == arr[i]) {
                
                System.out.println("Element is found at " + i +"th index");
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args){
        int number[] = {23,45,56,76,12,10};
        int key = 10;
        System.out.println(linear(number, key));
    }


}
