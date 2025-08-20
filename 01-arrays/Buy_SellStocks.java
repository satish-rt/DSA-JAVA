public class Buy_SellStocks {

    // Only one buy and one sell allowed
    public static int CalculateProfit(int price[]) {
        int BuyPrice = Integer.MAX_VALUE;  // track min price so far
        int maxProfit = 0;                 // best profit

        for (int i = 0; i < price.length; i++) {
            if (BuyPrice < price[i]) {
                int Profit = price[i] - BuyPrice;
                maxProfit = Math.max(maxProfit, Profit);
            } else {
                BuyPrice = price[i];  // update min price
            }
        }
        return maxProfit;
    } 

    public static void main(String[] args) {
        int price[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit (Single Transaction): " + CalculateProfit(price));
    }
}
