package interview_related;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElement {

    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4};
        Integer[] arr2 = {2, 5, 4};

        Set<Integer> commonElements = Arrays.stream(arr1)
                .filter(Arrays.asList(arr2)::contains)
                .collect(Collectors.toSet());

        System.out.println("Common elements: " + commonElements);
    }
}
