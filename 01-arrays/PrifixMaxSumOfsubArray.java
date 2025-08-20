public class PrifixMaxSumOfsubArray {
    public static void sumofsubarray(int number[]) {
        int max = Integer.MIN_VALUE;
        int Prifix[] = new int[number.length];
        Prifix[0] = number[0];
        for (int i = 1; i < Prifix.length; i++) {
            Prifix[i]= Prifix[i-1]+number[i];
        }

        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                int sum = 0;
                sum = start ==0 ? Prifix[end] : Prifix[end] - Prifix[start-1];
                if (max < sum) {
                    max = sum;
                }
            }
        }

        System.out.println("Maximum subarray sum: " + max);
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        sumofsubarray(number);
    }
}
