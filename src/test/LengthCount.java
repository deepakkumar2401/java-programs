package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


//input----list ["Hi", "Hello", "Java", "how","world"]
//output---{hi=2 how=3 java=4 world=5 hello=5}


public class LengthCount {

    public static void main(String[] args) {
        List<String> input = Arrays.asList("Hi", "Hello", "Java", "World", "how");
        System.out.print("{ ");
        input.stream()
                .map(String::toLowerCase)
                .sorted(Comparator.comparing(String::length))
                .forEach(s -> System.out.print(s + "=" + s.length() + " "));
        System.out.print("}");
    }
}
