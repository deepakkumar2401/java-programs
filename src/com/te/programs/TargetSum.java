package com.te.programs;

import java.util.HashSet;
import java.util.Set;

public class TargetSum {

    public static void main(String[] args) {
        int[] arr = {5, 7, 4, 8, 9, 6};
        int targetSum = 90;

        System.out.println(pairSum(arr, targetSum));
    }

    private static String pairSum(int[] arr, int targetSum) {
        Set<Integer> set = new HashSet<>();

        for (Integer integer : arr) {
            if (set.contains(targetSum - integer)) {
                return "YES";
            }
            set.add(integer);
        }
        return "NO";
    }
}
