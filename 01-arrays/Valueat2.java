public class Valueat2 {
    public static boolean hasDuplicate(int nums[]) {

        // Loop through each pair only once
        for (int i = 0; i < nums.length- 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println("Duplicate value found: " + nums[i]);
                    return true; // Stop at the first duplicate
                }
            }
        }

        System.out.println("No duplicates found.");
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 1};
        System.out.println("Contains duplicate? " + hasDuplicate(nums));
    }
}
