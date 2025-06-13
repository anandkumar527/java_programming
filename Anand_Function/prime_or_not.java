package Anand_Function;
import java.util.*;
public class prime_or_not {
    
   /*  public static boolean isPrime(int n){
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++){
            if (n%i==0) {
                isPrime=false;
            }
        }
        return isPrime;
    }*/

    public static boolean isPrime(int n){
        if (n==2) {
            return true;
        }

        for(int i=2; i<=Math.sqrt(n); i++){     
            if(n%2==0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        // System.out.println(isPrime(3));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = scanner.nextInt();

        if (isPrime(n))
            System.out.println(n + " is a Prime Number.");
        else
            System.out.println(n + " is Not a Prime Number.");
    }
}
