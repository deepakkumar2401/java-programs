package interview;

import java.util.ArrayList;

public class Print1to100 {

    public static void main(String[] args) {
//        for (int i = 'b' - 'a'; i <= 'd'; i++) {
//            System.out.println(i);
//        }

        String str = "a";
        String str1 = "interviews";

        for (int i = str.length(); i <= str1.length() * str1.length(); i++) {
            System.out.println(i);
        }
    }
}
