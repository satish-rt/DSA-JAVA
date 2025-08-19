import java.util.*;

public class PrintPrime {
    public static boolean isPrime(int n) {
        if (n <= 1) { // Handle 0, 1, and negatives
            return false;
        }
        if (n == 2) { // 2 is prime
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { 
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printPrime(n);
        sc.close();
    }
}
