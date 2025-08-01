package imp_DSA;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String[] tests = {
                "()",
                "()[]{}",
                "(]",
                "([)]",
                "{[]}",
                ")[]{}",
                "(((((",
                "[({})]"
        };

        for (String s : tests) {
            System.out.println("Input: " + s + " → Valid: " + isValid(s));
        }
    }
}

