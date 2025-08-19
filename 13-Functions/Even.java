import java.util.*;

public class Even{
    public static boolean isEven(int n) {
       if(n%2==0){
        return true;
       }
       return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (isEven(n)) {
            System.out.println("The Number is Even");
        } else {
            System.out.println("The Number is Not Even");
        }
        sc.close();
    }
}
