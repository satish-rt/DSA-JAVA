import java.util.*;

public class SumOfDigit{
    public static int Sum(int n){
        int lastDigit = 0;
        int sum = 0 ;
        while(n>0){
            lastDigit = n % 10;
            sum += lastDigit ;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = Sum(n);
        System.out.println("Sum Of Digits :" + result);
        sc.close();
    }
}
