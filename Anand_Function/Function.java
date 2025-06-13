package Anand_Function;

import java.util.*;

public class Function {
   /*  public static int Calculate(int a,int b){
          int sum=a+b;
          return sum;
    }
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        int a=Scanner.nextInt();
        int b=Scanner.nextInt(); 
        int sum= Calculate(a, b);//function call
        System.out.println("sum is :"+sum);
    } */
    
    public static int multiply(int a,int b){
        int product=a*b;
        return product;
    }

    public static void main(String[] args) {
        int a=4;
        int b=6;
        int product=multiply(a,b);  
        System.out.println(product);  
        product=multiply(10,6);  
        System.out.println(product);  
        product=multiply(12, 10);
        System.out.println(product);
        
    }

}

   