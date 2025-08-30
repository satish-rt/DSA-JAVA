public class Counting_Sort {

    // Function to perform Counting Sort
    public static void counting_Sort(int nums[]) {
        // 1️⃣ Find the largest element in the array
        int largest = Integer.MIN_VALUE;
        for (int num : nums) {
            largest = Math.max(largest, num);
        }

        // 2️⃣ Create count array (size = largest + 1)
        int count[] = new int[largest + 1];

        // 3️⃣ Store frequency of each element
        for (int num : nums) {
            count[num]++;
        }

        // 4️⃣ Build the sorted array in-place
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    // Function to print array
    public static void printArray(int nums[]) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main function to test the sorting
    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 2, 1};

        System.out.println("Original Array:");
        printArray(nums);

        counting_Sort(nums);

        System.out.println("Sorted Array:");
        printArray(nums);
    }
}
