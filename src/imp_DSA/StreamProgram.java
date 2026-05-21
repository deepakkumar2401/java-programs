package imp_DSA;


import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamProgram {

    public static void main(String[] args) {

        //second max in array using stream
        int[] arr = {2, 1, 5, 7, 8};
        System.out.println("input:" + Arrays.toString(arr));

        Integer integer = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("second max is-->" + integer);

        System.out.println("----------------------------------------");
        //reverse string using stream
        String str = "Hello";
        System.out.println("input:" + str);

        String collect = IntStream.range(0, str.length()).mapToObj(i -> str.charAt(str.length() - i - 1)).map(String::valueOf).collect(Collectors.joining());
        System.out.println("Reverse string is-->" + collect);

        System.out.println("----------------------------------------");
        //reverse each word in string using stream
        String s = "sky is blue";
        String[] srr = s.split(" ");
        System.out.println("input:" + s);

        String collect1 = IntStream.range(0, srr.length).mapToObj(i -> srr[srr.length - i - 1]).collect(Collectors.joining(" "));
        System.out.println("Reverse each word is-->" + collect1);

    }
}
