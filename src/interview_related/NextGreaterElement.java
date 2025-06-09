package interview_related;

import java.util.ArrayList;
import java.util.List;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    list.add(arr[j]);
                    break;
                }
            }
        }
        System.out.println(list);
    }
}
