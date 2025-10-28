import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        if (age>=18) {
            System.out.println("You are an adult !");
            
                
            }
            
        
        else if ((age>=13) && (age<18)) {
                System.out.println("Teenager");
            System.out.println("You cannot vote");
        }
        else {
            System.out.println("stay back home keed");
        }
    }
}
    

