package interview;

import java.util.stream.IntStream;

public class Duplicate {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 2, 3, 4};

        IntStream.range(0, arr.length - 1).filter(d -> arr[d] == arr[d + 1]).forEach(System.out::println);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[i] == arr[j + 1]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
