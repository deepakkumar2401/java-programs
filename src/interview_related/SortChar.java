package interview_related;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortChar {

    public static void main(String[] args) {
        String str = "ZAABBADCBGKJG!@#123KJ";

        List<Character> list = new ArrayList<>();

        char[] input = str.toCharArray();

        for (Character c : input) {
            if (Character.isLetter(c)) {
                list.add(c);
            }
        }

        Collections.sort(list);

        StringBuilder result = new StringBuilder();
        int index = 0;

        for (Character c : input) {
            if (Character.isLetter(c)) {
                result.append(list.get(index++));
            } else {
                result.append(c);
            }
        }
        System.out.println("Input : " + str);
        System.out.println("Output: " + result);
    }
}
