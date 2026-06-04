package programs;

import java.util.Comparator;
import java.util.List;

public class ThirdMaxElement {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 4, 7, 2, 8, 3);
        Integer integer = list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst().orElseThrow();
        System.out.println(integer);
    }
}
