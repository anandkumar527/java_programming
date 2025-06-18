package Anand_Function;

public class BinarytoDecimal {
    public static void bintodec(int binarynumber){
        int pow=0;
        int decimalnumber=0;

        while (binarynumber>0) {
            int lastdigit=binarynumber%10;
            decimalnumber=decimalnumber+(lastdigit *(int)Math.pow(2, pow));
            pow++;
            binarynumber=binarynumber/10;
        }
        System.out.println("decimal num is : "+decimalnumber);
    }

    public static void main(String[] args) {
        bintodec(10101);
    }
}
 