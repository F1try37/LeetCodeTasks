package tasks.twopointers;

import java.util.Arrays;

public class MergeSortArray88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; //последний кроме нулей в nums1
        int j = n - 1; //последний в nums2
        int k = m + n - 1; //последний в nums1
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }

    public static void main(String[] args) {
        MergeSortArray88 solution = new MergeSortArray88();
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        solution.merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
}
