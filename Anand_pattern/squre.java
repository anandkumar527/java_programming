//package Anand_pattern;
import java.util.*;
public class squre {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);

        System.out.print("Enter number of rows: ");
        int rows=sc.nextInt();

        System.out.print("Enter number of columns: ");
        int columns=sc.nextInt();
        //outer loop
        for(int i=1; i<=rows; i++){
            //inner loop
            for(int j=1; j<=columns; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
