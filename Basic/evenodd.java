//print if a number is odd ao even
import java.util.*;

public class evenodd {
    public static void main(String[] args) { 
        Scanner Sc = new Scanner(System.in);
        System.out.print("enter a number= ");
        int number=Sc.nextInt();
            if (number%2==0) {
               System.out.println("Even");
            } else{
               System.out.println("Odd");
            }
    }
}
