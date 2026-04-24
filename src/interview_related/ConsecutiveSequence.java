package interview_related;

import java.util.ArrayList;
import java.util.List;

public class ConsecutiveSequence {

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 3, 2, 1};

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        List<Integer> list = new ArrayList<>();
        list.add(min);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min + 1) {
                min = arr[i];
                list.add(arr[i]);
                i = -1;
            }
        }
        System.out.println(list);
    }
}
