package interview;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class ConsecutiveCharacters {

    public static void main(String[] args) {
        String str = "abbcccddddeeeeedcba";
        Set<String> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String subString = str.substring(i, j + 1);
                if (checkAllChar(subString)) {
                    set.add(subString);
                }
            }
        }
        String string = set.stream().max(Comparator.comparing(String::length)).get();
        System.out.println(string.length());
    }

    private static boolean checkAllChar(String str) {
        boolean flag = true;
        char first = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (first != str.charAt(i)) {
                flag = false;
            }
        }
        if (flag)
            return true;
        else
            return false;
    }
}
