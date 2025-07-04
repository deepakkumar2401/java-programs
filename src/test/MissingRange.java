package test;

import java.util.*;

public class MissingRange {

    public static List<Integer> findMissing(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 9};
        System.out.println(findMissing(arr));
    }
}
