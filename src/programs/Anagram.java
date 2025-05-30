package programs;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String s="care";

        String t="race";

        char[] c1 =s.toCharArray();
        char[] c2 =t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1,c2))
            System.out.println("anagram");
        else
            System.out.println("not anagram");
    }
}
