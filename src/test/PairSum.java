package test;

import java.util.HashSet;
import java.util.Set;

public class PairSum {

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 5, 3, 12, 4, 6, 13, 7, 8};
        int target = 20;


        pairSum(arr, target);
    }

    private static void pairSum(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(target - arr[i])) {
                System.out.println("Pair Found:-->> " + (target - arr[i]) + "," + arr[i]);
                check = true;
                break;
            }
            set.add(arr[i]);
        }
        if (!check) {
            System.out.println("Pair Not Found ");
        }
    }
}
