package imp_DSA;

import java.util.HashSet;
import java.util.Set;

public class LocksCount {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 3, 2, 1, 4, 1, 2, 3, 5, 4};
        int[] lock = {3, 4};
        Set<Integer> lockSet = new HashSet<>();
        for (int nums : lock) {
            lockSet.add(nums);
        }
        int count = 0;
        for (int nums : arr) {
            if (lockSet.contains(nums))
                count++;

        }
        System.out.println(count);
    }
}
