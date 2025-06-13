// package Anand_pattern;
import java.util.Scanner; 

public class HollRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns=sc.nextInt();

        for(int i=1; i<=rows; i++){   //outer loop
            for(int j=1; j<=columns; j++){    //inner loop
                if (i==1||j==1||i==rows||j==columns) {    //first or last row/column
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }
}
