package tasks.binarysearch;

public class BinarySearch704 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch704 solution = new BinarySearch704();
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(solution.search(nums, target));
    }
}
