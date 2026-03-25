package imp_DSA;

import java.util.Arrays;

public class LargestNumber {

    public static void main(String[] args) {
        int[] arr = {3, 30, 34, 5, 9};

        StringBuilder str = new StringBuilder();
        for (int j : arr) {
            str.append(j);
        }
        int[] ans = new int[str.length()];
        int x = 0;
        for (int i = 0; i < str.length(); i++) {
            ans[x] = str.charAt(i) - 48;
            x++;
        }
        Arrays.sort(ans);
        StringBuilder big = new StringBuilder();
        for (int i = ans.length - 1; i >= 0; i--) {
            big.append(ans[i]);
        }
        System.out.println(big);
    }
}
