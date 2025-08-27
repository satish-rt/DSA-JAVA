public class BinarySearchRecursive {
    public static int binarySearch(int[] numbers, int key) {
        return binarySearch(numbers, key, 0, numbers.length - 1);
    }

    private static int binarySearch(int[] numbers, int key, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (numbers[mid] == key) {
            return mid;
        }

        if (numbers[mid] < key) {
            return binarySearch(numbers, key, mid + 1, end);
        } else {
            return binarySearch(numbers, key, start, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        int index = binarySearch(numbers, key);

        if (index != -1) {
            System.out.println("Key found at index: " + index);
        } else {
            System.out.println("Key not found in the array");
        }
    }
}



