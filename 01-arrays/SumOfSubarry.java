public class SumOfSubarry {
    public static void sumofsubarray(int number[]) {
        int ts = 0; 
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;  

        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += number[k];
                }
                System.out.println("Subarray sum = " + sum);

                if (max < sum) {
                    max = sum;
                }
                if (min > sum) {
                    min = sum;
                }
                ts++;
            }
        }

        System.out.println("Total subarrays: " + ts);
        System.out.println("Maximum subarray sum: " + max);
        System.out.println("Minimum subarray sum: " + min);
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        sumofsubarray(number);
    }
}
