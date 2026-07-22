package Tasks;

public class MaximumSubarray53 {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int num : nums) {
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaximumSubarray53 solution = new MaximumSubarray53();
        int[] nums = {5,4,-1,7,8};
        System.out.println(solution.maxSubArray(nums));
    }
}
