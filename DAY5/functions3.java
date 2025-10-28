//Call by value

import java.util.Scanner;

public class functions3 {
    public static void swap(int a , int b){
    int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
        
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        swap(a, b);
        System.out.println(a);
        System.out.println(b);
    }
}
