package Anand_Function;
import java.util.*;
public class calculateFactorial {
    public static int calculateFactorial(int n){
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        return factorial;
    }


    public static void main(String[] args) {
        System.out.println(calculateFactorial(4));
    }
    
}
 