package Anand_Loops;
import java.util.*;
public class removemultipleof10 {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
         

        do{
            System.out.println("enter: ");
            int n=Scanner.nextInt();
            if (n%10==0) {
                continue;
               // break;
            } 
            System.out.println("num :"+n);
 
        }while(true);
    }   
}
