package imp_DSA;

public class MaxSubarraySum {

    public static int maxSubarraySum(int[] arr) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int maxSum = maxSubarraySum(arr);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
