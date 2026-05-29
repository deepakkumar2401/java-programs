package interview_related;

public class ReverseOnlyLetter {

    public static void main(String[] args) {
        String ans = reverseOnlyLetters("a-bC-dEf-ghIj");
        System.out.println("Output---> " + ans);
    }

    public static String reverseOnlyLetters(String s) {
        System.out.println("Input----> " + s);
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (Character.isLetter(arr[left]) && Character.isLetter(arr[right])) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if (!Character.isLetter(arr[left]))
                left++;

            if (!Character.isLetter(arr[right]))
                right--;
        }
        StringBuilder ans = new StringBuilder();
        for (char ch : arr) {
            ans.append(ch);
        }
        return ans.toString();
    }
}
