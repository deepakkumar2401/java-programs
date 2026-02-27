package test;

public class ReverseOnlyLetter {

    public static void main(String[] args) {

        String input1 = "asfd$i!mn@u&";
        String result1 = reverseOnlyAlphabets(input1);
        System.out.println("Input  : " + input1);
        System.out.println("Output : " + result1);
        String input2 = "a1b2c3d4e5f";
        String result2 = reverseOnlyAlphabets(input2);
        System.out.println("Input  : " + input2);
        System.out.println("Output : " + result2);
    }

    private static String reverseOnlyAlphabets(String input) {
        char[] charArray = input.toCharArray();
        int left = 0, right = charArray.length - 1;

        while (left < right) {
            if (!Character.isLetter(charArray[left])) {
                left++;
            } else if (!Character.isLetter(charArray[right])) {
                right--;
            } else {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
        }
        return new String(charArray);
    }
}
