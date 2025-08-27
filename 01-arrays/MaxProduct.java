public class MaxProduct {
    public static int ProductOfArray(int nums[]) {
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Swap max and min if the current number is negative
            if (nums[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            // Update max and min products ending at current index
            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);

            // Update the answer with the maximum product found so far
            ans = Math.max(ans, max);
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {2, 3, -2, -4};
        System.out.println("Maximum Product Subarray: " + ProductOfArray(nums));
    }
}
