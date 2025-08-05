//package Anand_pattern;
import java.util.*;
public class Character {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int number=Sc.nextInt();
    //int n=5;
    char ch='A';

    for(int i=1; i<=number; i++){
        for(int j=1; j<=i; j++){
            System.out.print(" "+ch);
            ch++;
        }
        System.out.println();
    }
  }
}
