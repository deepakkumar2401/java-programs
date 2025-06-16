package imp_DSA;

import java.util.Arrays;

public class SumOfSquare {

    public static void main(String[] args) {
        int[] arr={1,2,3};

        int sum = Arrays.stream(arr).map(n -> n * n).sum();
        System.out.println(sum);
    }
}
