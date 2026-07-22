package tasks.twopointers;

import java.util.Arrays;

public class MoveZeroes283 {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }

    public static void main(String[] args) {
        MoveZeroes283 solution = new MoveZeroes283();
        int[] nums = {0,1,0};
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
