package imp_DSA;

public class FindUnsortedSubarray {

    public static int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int start = -1, end = -1;
        int max = nums[0], min = nums[n - 1];

        for (int i = 1; i < n; i++) {
            max = Math.max(max, nums[i]);
            if (nums[i] < max) end = i;
        }

        for (int i = n - 2; i >= 0; i--) {
            min = Math.min(min, nums[i]);
            if (nums[i] > min) start = i;
        }

        return (start == -1) ? 0 : end - start + 1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        System.out.println("Shortest Unsorted Subarray Length: " + findUnsortedSubarray(nums));
    }
}
