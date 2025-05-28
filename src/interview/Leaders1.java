package interview;

import java.util.ArrayList;
import java.util.List;

public class Leaders1 {

    public static void main(String[] args) {
        int[] arr = {2, 6, 17, 9, 14, 8, 10, 5, 9, 1};
        List<Integer> leaders = leaders(arr);
        System.out.println(leaders);
    }

    public static List<Integer> leaders(int[] arr) {
        List<Integer> list = new ArrayList<>();

        int maxLeader = arr[arr.length - 1];
        list.add(maxLeader);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxLeader) {
                maxLeader = arr[i];
                list.add(maxLeader);
            }
        }
        return list;
    }
}
