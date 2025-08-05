package imp_DSA;

public class MaxSubarraySumOfSizeK {

    public static int findMaxSum(int[] arr, int k) {
        int maxSum = 0, sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        maxSum = sum;

        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Maximum sum of subarray of size " + k + " is: " + findMaxSum(arr, k));
    }
}

