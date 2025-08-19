import java.util.Scanner;
public class Binomial{
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
    public static int Bino(int n , int r){
        int a = Fact(n);
        int b = Fact(r);
        int c = Fact(n-r);
        int result = a/(r*c);
        return result;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int result = Bino(n,r);
    
        System.out.println("Binomial " + result);
    }
}