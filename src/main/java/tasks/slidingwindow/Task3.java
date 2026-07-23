package tasks.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class Task3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charsSet = new HashSet<>();
        char[] chars = s.toCharArray();
        int maxLen = 0;
        int right = 0;
        int left = 0;
        while (right < chars.length) {
            if (!charsSet.contains(chars[right])) {
                charsSet.add(chars[right]);
                right++;
                maxLen = Math.max(charsSet.size(), maxLen);
            } else {
                charsSet.remove(chars[left]);
                left++;
            }
        }
        return maxLen;
    }

    public int lengthOfLongestSubstringCanon(String s) {
        int left = 0;
        int maxLen = 0;
        char[] chars = s.toCharArray();
        Set<Character> charsSet = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (charsSet.contains(chars[right])) {
                charsSet.remove(chars[left]);
                left++;
            }
            charsSet.add(chars[right]);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Task3 solution = new Task3();
        String s = "abcabcbb";
        System.out.println(solution.lengthOfLongestSubstring(s));
    }
}
