package interview_related;

import java.util.*;

public class LongestUnsortedSubarray {

    public static int longestSubarrayWithSum(int[] nums, int k) {
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            if (prefixSumMap.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - prefixSumMap.get(sum - k));
            }

            prefixSumMap.putIfAbsent(sum, i);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 7, 5};
        int k = 12;
        int len = longestSubarrayWithSum(nums, k);
        System.out.println("Longest subarray length with sum " + k + " is: " + len);
    }
}

