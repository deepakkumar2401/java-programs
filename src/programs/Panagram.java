package programs;

import java.util.HashSet;
import java.util.Set;

public class Panagram {

    public static boolean isPangram(String str) {
        Set<Character> set = new HashSet<>();

        for (char c : str.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                set.add(c);
            }
        }
        return set.size() == 26;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(input));
    }
}
