import java.util.Scanner;

public class LargestNumber {

    public static int largestNum(int number[]) {
        int result = number[0]; 
        for (int i = 1; i < number.length; i++) {
            if (number[i] > result) { 
                result = number[i];
            }
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number[] = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }

        int largest = largestNum(number);
        System.out.println("Largest number is: " + largest);

        sc.close();
    }
}
