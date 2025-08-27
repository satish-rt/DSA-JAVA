public class SortedRotated {
    // Function to find the index of the target element in a sorted and rotated array
    public static int FindElement(int nums[], int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        // Continue searching while the search interval is valid
        while (start <= end) {
            // Calculate the middle index to partition the array
            int mid = (start + end) / 2;

            // Check if the middle element is the target
            if (nums[mid] == target) {
                return mid; // Target found, return its index
            }

            // Determine which side of the array is properly sorted
            if (nums[start] <= nums[mid]) {
                // Left part is sorted
                if (nums[start] <= target && target < nums[mid]) {
                    // If target is in the sorted left part, shrink the interval from the end
                    end = mid - 1;
                } else {
                    // Otherwise, search in the right part
                    start = mid + 1;
                }
            } else {
                // Right part is sorted
                if (nums[mid] < target && target <= nums[end]) {
                    // If target is in the sorted right part, move start to mid + 1
                    start = mid + 1;
                } else {
                    // Otherwise, search in the left part
                    end = mid - 1;
                }
            }
        }
        // If loop exits, target was not found in the array
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2, 3}; // Example rotated sorted array
        int target = 0; // Example target
        int result = FindElement(nums, target);
        System.out.println(result); // Prints the index of target or -1 if not found
    }
}
