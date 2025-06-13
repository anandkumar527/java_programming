package Anand_Loops;
import java.util.*;

//print sum of n netural number
public class naturalnumber {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter num:");
        int n=Sc.nextInt();
        int sum=0;
        int i=1;
        while (i<=n) {
            sum=sum+i;
            i++;
        }
        System.out.println("sum is:"+ sum);
        
         
        for(int j=1; i<=n; j++){
            sum+=i;
        }
        System.out.println("sum is:"+ sum); 
    } 
}
