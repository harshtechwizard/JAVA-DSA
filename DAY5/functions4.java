public class functions4 {
    public static int product(int a , int b){
             int product = a * b;
              return product;
    }
    public static int fact(int n) {
        int f = 1;
        for(int i=1;i<=n;i++){
            f = f * i;
        }
        return f;
       
    }
    public static void main(String[] args) {

        int a = 4;
        int b = 10;
        int product = product(a, b);
        int mult = product(12, 10);
        int fact = fact(5);


        System.err.println(product);
        System.err.println(mult);
        System.err.println(fact);


    }
}
