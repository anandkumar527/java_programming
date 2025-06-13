import java.util.*;
 
public class promotion {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
    //type 2 promotion
           /*int i = 10;
           long l = 20L;
           float f = 30.5f;
           double d = 40.5;
           double result = i + l + f + d; // All are promoted to double
           System.out.println(result);   // Outputs 101.0*/
    //type 1 promotion
         char a='a';
         char b='b';
         char c='c';
         long var=(long) (a+b+c);
         System.out.println(var);
        // System.out.println((int)(b));
        //System.out.println((int)(a));
        //System.out.println(a+b); 
    


    }
}
 