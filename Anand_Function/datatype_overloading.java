package Anand_Function;

public class datatype_overloading {
    
    //method 1->int type
    public static int sum(int a,int b){
        return a+b;
    }
    // method 2->float type
    public static float sum(float a,float b){
        return a+b;
    }

    public static void main(String[] args) {
         System.out.println(sum(2, 3));
         System.out.println(sum(2.5f, 2.5f));
    }
}
 