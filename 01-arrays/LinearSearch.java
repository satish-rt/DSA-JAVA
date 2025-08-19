import java.util.Scanner;

public class LinearSearch {
    public static boolean linearSearch(int arr[], int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) { 
                return true;
            }
        }
        return false; 
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to search:");
        int num = sc.nextInt();

        boolean result = linearSearch(arr, num);

        if (result) {
            System.out.println("Number is present in the array");
        } else {
            System.out.println("Number is not present in the array");
        }

        sc.close();
    }
}
