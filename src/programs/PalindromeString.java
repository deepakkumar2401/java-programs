package programs;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter String:");
        String str = scanner.next();
        if (str.equals(reverse(str))) {
            System.out.println(str + ": is Palindrome string!!!!!");
        } else {
            System.out.println(str + ": is not Palindrome string!!!!!");
        }
    }

    private static String reverse(String str) {
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            rev.append(ch);
        }
        return rev.toString();
    }
}
