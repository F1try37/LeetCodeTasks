package tasks.greedy;

public class Task122 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] - prices[i] > 0) {
                maxProfit += prices[i + 1] - prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Task122 solution = new Task122();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(solution.maxProfit(prices));
    }
}
