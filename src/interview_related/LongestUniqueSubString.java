package interview_related;

import java.util.*;

public class LongestUniqueSubString {

    public static void main(String[] args) {
        String str = "ahgeahte";
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String s = str.substring(i, j);
                if (check(s)) {
                    list.add(s);
                }
            }
        }
        String string = list.stream().max(Comparator.comparing(String::length)).get();
        System.out.println("Longest Substring:" + string);
    }

    private static boolean check(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        return s.length() == set.size();
    }
}
