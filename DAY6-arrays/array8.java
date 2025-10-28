import java.util.Scanner;

public class array8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        for(int i =0;i<marks.length;i++){
            System.out.print("Enter the marks of " + i + "student :");
            marks[i] = sc.nextInt();
        }
    //     for(int i =0;i<marks.length;i++){
    //     System.out.println("the marks of " + i + "student is :" + marks[i]);
    // }
    int count =0;
    for(int i =0;i<marks.length;i++){
        if (marks[i]>60) {
            // System.out.println(marks[i]);
            count++;
            
        }
        // System.out.println("Enter the marks of " + i + "student :");
}
System.out.println(count);
        sc.close();
}
}

