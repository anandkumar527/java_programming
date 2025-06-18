package Anand_Function;

public class decimaltobinary {

    public static void DectoBin(int n) {
        int mynum = n;
        int pow = 0;
        int binarynumber = 0;

        while (n > 0) {
            int remender = n % 2;
            binarynumber = binarynumber + (remender * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("binary form of "+mynum+": "+binarynumber);
    }

    public static void main(String[] args) {
        DectoBin(545);
    }
}
