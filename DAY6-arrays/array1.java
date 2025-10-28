// Basic Operations in an array

import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        int marks[] = new int[50];
        int num[] = {2,3,4};
        String array[]= {"apple","orange","banana"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        marks[0]= sc.nextInt(); 
        System.out.print("Enter 2nd number : ");
        marks[1]= sc.nextInt();
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        int percentage = (marks[0]+marks[1])/2;
        System.out.println(percentage);
        marks[1]=7;


    }
}
