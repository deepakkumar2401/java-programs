package interview_related;

public class UnsortedSubarrayLength {

    public static int findUnsortedSubarrayLength(int[] nums) {
        int n = nums.length;
        int start = -1, end = -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Traverse from left to right to find the right boundary of unsorted subarray
        for (int i = 0; i < n; i++) {
            if (nums[i] < max) {
                end = i;
            } else {
                max = nums[i];
            }
        }

        // Traverse from right to left to find the left boundary of unsorted subarray
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > min) {
                start = i;
            } else {
                min = nums[i];
            }
        }

        return (start == -1) ? 0 : (end - start + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 9, 5, 15};
        int result = findUnsortedSubarrayLength(arr);
        System.out.println("Length of unsorted subarray: " + result);
    }
}


