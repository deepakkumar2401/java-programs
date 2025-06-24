package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterSection {

    public static void main(String[] args) {
        int[][] a = {{1, 3}, {4, 6}, {8, 10}};
        int[][] b = {{2, 4}, {5, 8}, {9, 11}};
        List<int[]> intersection = findIntersection(a, b);
        System.out.print("output:");
        for (int[] ints : intersection) {
            System.out.print(Arrays.toString(ints));
        }
    }

    private static List<int[]> findIntersection(int[][] A, int[][] B) {
        List<int[]> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < A.length && j < B.length) {
            int start = Math.max(A[i][0], B[j][0]);
            int end = Math.min(A[i][1], B[j][1]);

            if (start <= end) {
                result.add(new int[]{start, end});
            }

            if (A[i][1] < B[j][1]) {
                i++;
            } else {
                j++;
            }
        }

        return result;
    }
}
