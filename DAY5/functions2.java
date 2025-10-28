import java.util.Scanner;
  class numb{
    public static int sum(int A, int B){ //function definition
        
        int sum = A + B;
        System.out.println("The sum is " + sum);
       
        return sum;
    }
    public static int subtract(int A, int B){ //function definition
        
        int sub = A - B;
        System.out.println("The diifference is " + sub);
       
        return sub;
    }

}

public class functions2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A : ");
        int A = sc.nextInt();
        System.out.print("Enter B: ");
        int B = sc.nextInt();
        
        
        sc.close();
        
        numb.sum(A,B); //function calling
        numb.subtract(A, B);
    }
}
