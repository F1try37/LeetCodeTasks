package tasks.hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 1; i < nums.length; i++) {
            numToIndex.put(nums[i - 1], i - 1);
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[]{numToIndex.get(target - nums[i]), i};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum1 solution = new TwoSum1();
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = solution.twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }
}
