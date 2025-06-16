package imp_DSA;

public class LongestUniqueSubstring {

    public static String longestUniqueSubstr(String s) {
        int[] lastSeen = new int[256];
        for (int i = 0; i < 256; i++) lastSeen[i] = -1;

        int start = 0, maxLen = 0, startIndex = 0;
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            if (lastSeen[ch] >= start) {
                start = lastSeen[ch] + 1;
            }

            lastSeen[ch] = end;

            if (end - start + 1 > maxLen) {
                maxLen = end - start + 1;
                startIndex = start;
            }
        }

        return s.substring(startIndex, startIndex + maxLen);
    }

    public static void main(String[] args) {
        String input = "abccb";
        System.out.println("Longest unique substring: " + longestUniqueSubstr(input));
    }
}

