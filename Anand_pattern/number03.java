//package Anand_pattern;
import java.util.*;
public class number03 {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=Scanner.nextInt();
    // int n=5;
        int num=1;
        for(int i=1; i<=number;i++){
            for(int j=1; j<=i; j++){
                System.out.print(" "+num);
                num++;
            }
            System.out.println();
        }
    }
}
