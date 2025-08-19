import java.util.Scanner;
public class AvgOf3{
    public static int Avg(int a,int b,int c){
        return (a+b+c)/3;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Three Number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = Avg(a,b,c);
        System.out.println("Average :" + result);
    }
}