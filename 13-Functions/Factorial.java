import java.util.Scanner;
public class Factorial{
    public static int Fact(int n){
        int fact = 1;
        if(fact == 0){
            fact=1;
        }else{
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        }
        return fact;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int fact = Fact(n);
        System.out.println("Factorial of " + n + " is " + fact);

        sc.close();
    }
}