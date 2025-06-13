//package Anand_pattern;
import java.util.*;
public class halfpyramid {
    public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    System.out.print("Enter the no. of row:");
    int row=Sc.nextInt();
        //outer loop
        for(int i=1; i<=row; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print(" *");     
            }
            System.out.println();
        }
    }  
}
