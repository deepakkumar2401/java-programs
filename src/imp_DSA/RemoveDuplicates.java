package imp_DSA;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int[] removeDuplicatesAndFill(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int index = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[index - 1]) {
                arr[index++] = arr[i];
            }
        }

        while (index < n) {
            arr[index++] = -1;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 1, 3, 3, 4, 5, 7, 5, 6};
        int[] result = removeDuplicatesAndFill(arr);
        System.out.println("Output: " + Arrays.toString(result));
    }
}

