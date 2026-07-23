package tasks.slidingwindow;

public class Task643 {
    public double findMaxAverage(int[] nums, int k) {
        long currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        long maxSum = currentSum;
        for (int j = k; j < nums.length; j++) {
            currentSum = currentSum - nums[j - k] + nums[j];
            maxSum = Math.max(maxSum, currentSum);
        }
        return (double) maxSum/k;
    }

    public static void main(String[] args) {
        Task643 solution = new Task643();
        int[] nums = {0,4,0,3,2};
        int k = 1;
        System.out.println(solution.findMaxAverage(nums,k));
    }
}
