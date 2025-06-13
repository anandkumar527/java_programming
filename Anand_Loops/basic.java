//using while loop print (Hello Anand)
package Anand_Loops;
import java.util.*;

public class basic {
    public static void main(String[] args) {
      Scanner Sc = new Scanner(System.in);
      System.out.print("enter the number:");
      int number=Sc.nextInt();

      int count=1;
      while (count<=number) {
        System.out.println("Hello Anand");
        count++;
      }
    }
}
