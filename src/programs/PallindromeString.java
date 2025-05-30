package programs;

import java.util.Scanner;

public class PallindromeString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter String:");
        String str = scanner.next();
        if (str.equals(reverse(str))) {
            System.out.println(str + ": is Pallindrome number!!!!!");
        } else {
            System.out.println(str + ": is not Pallindrome number!!!!!");
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
