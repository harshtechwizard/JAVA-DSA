// Substring in java
public class string4 {

    public static void Substring(String str,int start,int end){
        String subs = "";
        for(int i=start;i<end;i++){
             subs += str.charAt(i);
            
        }
        System.out.print(subs);
    }
    public static void main(String[] args) {
        String str = "Hello This is a string";
        Substring(str,0,5);

    }
}
