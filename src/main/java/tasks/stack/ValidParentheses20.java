package tasks.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class ValidParentheses20 {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] chars = s.toCharArray();
        for (char ch: chars) {
            if (ch == '[') {
                stack.push(ch);
            } else if (!stack.isEmpty() && ch == ']') {
                if (stack.peek() != '[') return false;
                else stack.pop();
            } else if (ch == '{') {
                stack.push(ch);
            } else if (!stack.isEmpty() && ch == '}') {
                if (stack.peek() != '{') return false;
                else stack.pop();
            } else if (ch == '(') {
                stack.push(ch);
            } else if (!stack.isEmpty() && ch == ')') {
                if (stack.peek() != '(') return false;
                else stack.pop();
            } else return false;
        }
        return stack.isEmpty();
    }

    public boolean isValidMap(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] chars = s.toCharArray();
        Map<Character,Character> pairs = Map.of(')','(','}','{',']','[');
        for (char ch: chars) {
            if (pairs.containsValue(ch)) {
                stack.push(ch);
            } else if (!stack.isEmpty() && pairs.containsKey(ch)) {
                if (stack.peek() == pairs.get(ch)) stack.pop();
                else return false;
            } else return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses20 solution = new ValidParentheses20();
        String s = "([])";
        System.out.println(solution.isValidMap(s));
    }
}
