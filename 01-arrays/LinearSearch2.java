import java.util.Scanner;

public class LinearSearch2 {
    public static String linearSearch(String fruits[], String fruit) {
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(fruit)) {
                return fruit;
            }
        }
        return null; 
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String fruits[] = new String[10];
        System.out.println("Enter 10 fruits:");
        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = sc.nextLine();
        }

        System.out.println("Enter the fruit to search:");
        String fruit = sc.nextLine();

        String result = linearSearch(fruits, fruit);

        if (result != null){
            System.out.println("Fruit is present in the array: " + result);
        } else {
            System.out.println("Fruit is not present in the array");
        }

        sc.close();
    }
}
