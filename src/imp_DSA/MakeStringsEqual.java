package imp_DSA;

public class MakeStringsEqual {

    public static int[][] lcsDP(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp;
    }

    public static String getLCS(String s1, String s2, int[][] dp) {
        StringBuilder lcs = new StringBuilder();
        int i = s1.length();
        int j = s2.length();

        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                lcs.append(s1.charAt(i - 1));
                i--;
                j--;
            } else {
                if (dp[i - 1][j] > dp[i][j - 1])
                    i--;
                else
                    j--;
            }
        }
        return lcs.reverse().toString();
    }

    public static void main(String[] args) {
        String s1 = "mississippi";
        String s2 = "nkzzkzzkwwk";

        int[][] dp = lcsDP(s1, s2);
        String lcs = getLCS(s1, s2, dp);

        int deletions = s1.length() - lcs.length();
        int insertions = s2.length() - lcs.length();

        System.out.println("LCS: " + lcs);
        System.out.println("Minimum operations to make strings equal:");
        System.out.println("Deletions from s1: " + deletions);
        System.out.println("Insertions to s1: " + insertions);
        System.out.println("Total operations: " + (deletions + insertions));
    }
}

