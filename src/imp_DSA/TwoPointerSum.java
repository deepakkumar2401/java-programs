package imp_DSA;

public class TwoPointerSum {
    public static void findPair(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("Pair: " + arr[left] + ", " + arr[right]);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("No pair found");
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 8};
        findPair(arr, 11);
    }
}

