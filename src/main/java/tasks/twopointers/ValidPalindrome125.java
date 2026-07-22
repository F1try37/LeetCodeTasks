package tasks.twopointers;

import java.util.ArrayList;

public class ValidPalindrome125 {
    public boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        ArrayList<Character> result = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] - 'a' >= 0 && chars[i] - 'a' <= 25 || chars[i] >= '0' && chars[i] <= '9') {
                result.add(chars[i]);
            }
        }
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) != result.get(result.size() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeTwoPointers(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome125 solution = new ValidPalindrome125();
        String s = " ";
        System.out.println(solution.isPalindromeTwoPointers(s));
    }
}
