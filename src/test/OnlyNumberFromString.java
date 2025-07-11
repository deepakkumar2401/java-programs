package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OnlyNumberFromString {

    public static void main(String[] args) {
        String str = "abc123xyz456";
        String collect = str.chars()
                .filter(Character::isDigit)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println(collect);
    }
}
