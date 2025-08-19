import java.util.*;

public class Palindrome{
    public static int Reverse(int n){
        int lastDigit = 0;
        int rev = 0 ;
        while(n>0){
            lastDigit = n % 10;
            rev = (rev*10) + lastDigit;
            n = n / 10;
        }
        return rev;
    }
    public static boolean isPalindrome(int n) {
       int rev = Reverse(n);
       if(n == rev){
        return true;
       }
       return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (isPalindrome(n)) {
            System.out.println("The Number is Palindrome");
        } else {
            System.out.println("The Number is Not Palindrome");
        }
        sc.close();
    }
}
