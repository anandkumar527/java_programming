package Anand_Function;

public class BinomialCoefficient {
    
    public static int calculateFactorial(int n){
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial=factorial*i;
        }
         return factorial;
    }

    public static int BinomialCoeff(int n,int r){
        int factorial_n=calculateFactorial(n);
        int factorial_r=calculateFactorial(r);
        int factorial_nmr=calculateFactorial(n-r);
        int BinomialCoefficient=factorial_n/(factorial_r * factorial_nmr);
        
        return BinomialCoefficient;// return BinomialCoefficient int type;     
    }
   

    public static void main(String[] args) {
        System.out.println(BinomialCoeff(5, 2));
    }
}
