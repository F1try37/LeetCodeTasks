package Tasks;

import java.util.Arrays;

public class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {
        char[] sortedStringS = s.toCharArray();
        Arrays.sort(sortedStringS);
        char[] sortedStringT = t.toCharArray();
        Arrays.sort(sortedStringT);
        if (sortedStringS.length != sortedStringT.length) {
            return false;
        }
        for (int i = 0; i < sortedStringS.length; i++) {
            if (sortedStringS[i] != (sortedStringT[i])) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagramInt26(String s, String t) {
        int[] chars = new int[26];
        if (s.length() != t.length()) {
            return false;
        }
        for (char c: s.toCharArray()) {
            chars[c - 'a']++;
        }
        for (char c: t.toCharArray()) {
            chars[c - 'a']--;
        }
        for (int i: chars) {
            if (i != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidAnagram242 solution = new ValidAnagram242();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(solution.isAnagramInt26(s,t));
    }
}
