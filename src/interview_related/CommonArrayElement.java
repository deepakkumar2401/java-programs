package interview_related;

import java.util.HashSet;
import java.util.Set;

public class CommonArrayElement {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int brr[] = {2, 4, 5, 3};

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < brr.length; j++) {
                if (arr[i] == brr[j]) {
                    set.add(arr[i]);
                }
            }
        }
        System.out.println(set);
    }
}
