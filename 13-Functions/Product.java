import java.util.Scanner;
public class Product{
public static int multiply(int a , int b){
    return a*b;

}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int mul = multiply(a ,b);
    System.out.println(mul);

     sc.close();
}
}