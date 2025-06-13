package Anand_Function;

public class fun_overloading {
    
    // method 1 --> two parameter
    public static int sum(int a,int b){
        return a+b;
    }

     // method 2 --> three parameter
    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
       System.out.println( sum(5, 10));
       System.out.println(sum(5, 10, 15));
    }
}
