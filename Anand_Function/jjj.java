package Anand_Function;

public class jjj {
    public class BinomialCoefficient {

    static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }

    static int binomial(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        System.out.println(binomial(5, 2));
    }
}

}
