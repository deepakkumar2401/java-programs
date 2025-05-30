package interview_related;

public class LargestPalindrome {

    public static String findLargestPalindrome(String s) {
        int maxLength = 1;
        String longestPalindrome = s.substring(0, 1); // Default to first character

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                if (isPalindrome(sub) && sub.length() > maxLength) {
                    maxLength = sub.length();
                    longestPalindrome = sub;
                }
            }
        }
        return longestPalindrome;
    }

    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input1 = "abmadambc";
        System.out.println("Largest Palindrome: " + findLargestPalindrome(input1));

//        String input2 = "klabmalayalambazr";
//        System.out.println("Largest Palindrome: " + findLargestPalindrome(input2));
    }
}

