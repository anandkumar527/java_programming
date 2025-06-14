
//package Anand_pattern;

public class ZerooneTriangle {
    public static void main(String[] args) {
        int n=10;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int sum=i+j;
                if (sum%2==0){
                    System.out.print(" 1 ");
                }else{
                    System.out.print(" 0 ");
                }
            }System.out.println();
        }
    }
}
