package interview;

public class LongestCommonPrefix {

    public static String findLongestCommonPrefix(String[] input) {
        if (input == null || input.length == 0) return null;

        String prefix = input[0];
        System.out.println(prefix);
        for (int i = 1; i < input.length; i++) {
            while (!input[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return null;
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println("Longest Common Prefix: " + findLongestCommonPrefix(input));
    }
}

