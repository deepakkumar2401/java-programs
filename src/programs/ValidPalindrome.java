package programs;

public class ValidPalindrome {

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                str += s.charAt(i);
            }
        }

        str = str.toLowerCase();
        int left = 0, right = str.length() - 1;
        boolean flag = true;
        while (left < right) {
            if (!(str.charAt(left) == str.charAt(right))) {
                flag = false;
                break;
            }
            left++;
            right--;
        }
        if (flag)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}
