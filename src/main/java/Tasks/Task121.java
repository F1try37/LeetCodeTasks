package Tasks;

public class Task121 {
    public int maxProfit(int[] prices) {
        int minvalue = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price: prices) {
            if (price < minvalue) minvalue = price;
            if (maxProfit < price - minvalue) maxProfit = price - minvalue;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Task121 solution = new Task121();
        int[] prices = {7,6,4,3,1};
        System.out.println(solution.maxProfit(prices));
    }
}
