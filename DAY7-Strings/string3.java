// Shortest path to reach ESENNWESN
import java.util.Scanner;
public class string3 {
    public static int distance(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)=='N') {
                y++;
            } else if (str.charAt(i)=='S') {
                y--;
            } else if (str.charAt(i)=='E') {
                x++;
            } else if (str.charAt(i)=='W') {
                x--;
            }
        }
        int x2,y2;
        x2=x*x;
        y2=y*y;
        return (int)Math.sqrt(x2+y2);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        System.out.println(distance(s));
        System.out.println("================================");

    }
}
