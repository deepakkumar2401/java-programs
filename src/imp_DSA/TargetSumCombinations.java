package imp_DSA;

import java.util.*;

public class TargetSumCombinations {

    public static void findCombinations(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        backtrack(arr, 0, target, new ArrayList<>(), result);

        // Print result
        for (List<Integer> comb : result) {
            System.out.println(comb);
        }
    }

    private static void backtrack(int[] arr, int start, int target, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            if (arr[i] > target) continue; // Prune
            if (i > start && arr[i] == arr[i - 1]) continue;

            current.add(arr[i]);
            backtrack(arr, i + 1, target - arr[i], current, result);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 4};
        int target = 9;
        findCombinations(arr, target);
    }
}

