package interview;

import java.util.ArrayList;
import java.util.List;

public class Leaders {

    public static void main(String[] args) {
        int arr[] = {17, 6, 8, 5, 7};
        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (!(arr[i] > arr[j])) {
                    flag = false;
                }
            }
            if (flag) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
