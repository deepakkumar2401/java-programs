package imp_DSA;

public class TargetSum {

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2, 8, 1};
        int target = 7;
        twoPointerPairSum(arr, target);
    }

    public static boolean twoPointerPairSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("Pair found: " + arr[left] + ", " + arr[right]);
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("No pair found");
        return false;
    }
}
