package programs;

import java.util.Arrays;

public class ReverseEachString {

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "how", "are", "you"};
        String[] res = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            res[i] = reverseString(arr[i]);
        }
        System.out.println("Input--->" + Arrays.toString(arr));
        System.out.println("Output-->" + Arrays.toString(res));
    }

    private static String reverseString(String s) {
        String res = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            res += s.charAt(i);
        }
        return res;
    }
}
