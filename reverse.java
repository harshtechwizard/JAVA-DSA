import java.util.Scanner;
public class reverse {
    public static void timezone(int day,int hour, int min){
        hour = hour + 5;
        min = min + 30;
        if (min>=60) {
            hour = hour + 1;
            min = min - 60;
        }
        if (hour>=24) {
            day = day + 1;
            hour = hour - 24;
            
        }
        System.out.println("day" + day + "hour" + hour + "min"+ min);
        

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day");
        int day = sc.nextInt();
        System.out.println("Enter hour");
        int hour = sc.nextInt();
        System.out.println("Enter minute");
        int minute = sc.nextInt();
        timezone(day, hour, minute);


    }
    
}
