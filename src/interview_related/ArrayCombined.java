package interview_related;

import java.util.Arrays;

public class ArrayCombined {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length / 2;
        solve(arr, n);
    }

    private static void solve(int[] arr, int n) {
        System.out.println("Input: " + Arrays.toString(arr));
        int[] ans = new int[arr.length];
        int x = 0;
        for (int i = 0; i < n; i++) {
            ans[x] = arr[i];
            x += 2;
        }
        int y = 1;
        for (int i = n; i < arr.length; i++) {
            ans[y] = arr[i];
            y += 2;
        }
        System.out.println("Output: " + Arrays.toString(ans));
    }
}
