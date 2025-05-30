package programs;

import java.util.Arrays;
import java.util.Comparator;

public class LongestString {

    public static void main(String[] args) {
        String str = "i am learning java stream today";
        String[] arr = str.split(" ");
        String string = Arrays.stream(arr).max(Comparator.comparing(String::length)).get();
        System.out.println(string);
    }
}
