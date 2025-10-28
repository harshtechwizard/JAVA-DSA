import java.util.Scanner;
public class string2palindrome {
    public static boolean isPalindrome(String str){
        String temp="";
        for(int i=str.length();i>0;i--){
            temp += str.charAt(i-1);
        }
        return str.equals(temp);
        // System.out.println(temp);

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
        System.out.println("================================");

        
    }
}
