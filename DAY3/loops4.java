import java.util.Scanner;

public class loops4 {
    public static void main(String[] args) {
        // for(int i = 1; i <= 5; i++){
        //     if (i==3) {
        //         break;
        //         System.out.println("I broke up");


                
        //     }
        //     // System.out.println("I broke up");
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n;

        do{

             n = sc.nextInt();
            if (n%10==0) {
                continue;
            }
            System.out.println("You entered "+ n);

        }while(n%10!=0);
System.out.println(n);
    }
}
