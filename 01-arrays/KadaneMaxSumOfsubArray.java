public class KadaneMaxSumOfsubArray {
    public static void Kadane(int number[]){
        int maxSum = Integer.MIN_VALUE;
        int CurrSum = 0;
        for (int i = 0; i < number.length; i++) {
            
            CurrSum = CurrSum + number[i];
            if(CurrSum<0){
                CurrSum = 0;
            }
            maxSum = Math.max(maxSum, CurrSum);
        }
        System.out.println("Max Sum of SubArray :" + maxSum);
    }
public static void main(String[] args) {
    int number[] = {2,4,6,8,10};
    Kadane(number);
}
    
}