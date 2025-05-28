package com.te.programs;

public class LongestPallindrome {

    public static void main(String[] args) {
        String str = "klabmalayalambazr";
        System.out.println("Longest Palindrome is:" + longestPalindrome(str));
    }

    private static String longestPalindrome(String str) {
        int maxLength = 1;
        String longestPalindrome = str.substring(0, 1);

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String sub = str.substring(i, j + 1);
                if (isPalindrome(sub) && sub.length() > maxLength) {
                    maxLength = sub.length();
                    longestPalindrome = sub;
                }
            }
        }
        return longestPalindrome;
    }

    private static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
