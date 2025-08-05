package Function;

import java.util.*;

public class primes_is_range {

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // System.out.println(isPrime(3));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a rangr(n): ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

}
