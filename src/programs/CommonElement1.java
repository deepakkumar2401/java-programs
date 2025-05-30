package programs;

import java.util.HashSet;
import java.util.Set;

public class CommonElement1 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {2, 5, 4};

        Set<Integer> set = new HashSet<>();

        int i = 0;
        while (i < arr1.length && i < arr2.length) {
            if (arr1[i] == arr2[i]) {
                set.add(arr1[i]);
                i++;
            } else {
                i++;
            }
        }
        while (i < arr1.length) {
            if (!set.contains(arr1[i])) {
                set.add(arr1[i]);
                i++;
            } else {
                i++;
            }
        }
        while (i < arr2.length) {
            if (!set.contains(arr2[i])) {
                set.add(arr2[i]);
                i++;
            } else {
                i++;
            }
        }
        System.out.println(set);
    }
}
