package Function;

public class primeInRange {

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primes_is_range(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primes_is_range(50);
    }
}
