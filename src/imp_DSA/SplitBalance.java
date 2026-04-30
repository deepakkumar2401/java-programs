package imp_DSA;

public class SplitBalance {

    public static void main(String[] args) {
//        int[] arr = {1, 1, 1, 2, 1};
        int[] arr = {1, 2, 3, 1, 0, 2, 3};
        System.out.println(splitBalance(arr));
    }

    public static boolean splitBalance(int[] arr) {
        int total = 0;
        for (Integer n : arr) {
            total += n;
        }
        int sum = 0;
        for (Integer n : arr) {
            sum += n;

            if (sum == total - sum) {
                return true;
            }
        }
        return false;
    }

}
