package Anand_Loops;
import java.util.*;

public class ReverceNumber {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        System.out.print("Enter a number:"+" ");
        int number=Scanner.nextInt();
    
        while (number!=0) {
             int lastdigit=number%10;
            System.out.print(lastdigit);
            
            number=number/10;
            
        }

    }
}
