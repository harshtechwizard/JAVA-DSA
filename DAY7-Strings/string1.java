import java.util.Scanner;
public class string1 {
    public static void reverseString(String str) {
        for(int i=str.length();i>0;i--){
            System.out.print(str.charAt(i-1));
        }
        System.out.println("================================");
    }
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        System.out.println("Length of the string: " + s.length());
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("First character: " + s.charAt(0));
        // String s1 ="Hello World";
        // String str = new String("Hello World");
        // System.out.println(s1);
        // System.out.println(str);
        reverseString(s);

    }
    
    
    
}
