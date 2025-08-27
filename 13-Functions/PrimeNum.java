import java.util.*;

class Prime {
    public static boolean isPrime(int n) {
        if (n == 2) { 
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) { // check divisibility
                return false;
            }
        }
        return true; // if no divisor found, it's prime
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println("The Number is Prime");
        } else {
            System.out.println("The Number is Not Prime");
        }
        sc.close();
    }
}
