package test;

import java.util.Arrays;
import java.util.List;

public class SecondLast {

    public static void main(String[] args) {
        List<String> list= Arrays.asList("hello","java","how","are","you");
        List<Character> list1 = list.stream().map(s -> s.charAt(s.length() - 2)).toList();
        System.out.println(list1);
    }
}
