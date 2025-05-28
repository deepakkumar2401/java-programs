package interview;

public class BalancedParenthesis {

    public static void main(String[] args) {
        String str = ")(((())))";

        if (str.startsWith("(")) {
            int open = 0, closed = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') {
                    open++;
                } else {
                    closed++;
                }
            }
            if (open == closed) {
                System.out.println("Balanced");
            } else {
                System.out.println("Unbalanced");
            }
        }else {
            System.out.println("Unbalanced");
        }
    }

}
