//package imp_DSA;
//
//import java.util.Arrays;
//
//public class MaxSubarraySum {
//
//    public static int[] findMaxSubarray(int[] arr) {
//        int maxSum = Integer.MIN_VALUE;
//        int currentSum = 0;
//        int start = 0, end = 0, tempStart = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            currentSum += arr[i];
//
//            if (currentSum > maxSum) {
//                maxSum = currentSum;
//                start = tempStart;
//                end = i;
//            }
//
//            if (currentSum < 0) {
//                currentSum = 0;
//                tempStart = i + 1;
//            }
//        }
//
//        return Arrays.copyOfRange(arr, start, end + 1);
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {5, 2, -7, 4, 2};
//        int[] result = findMaxSubarray(arr);
//        System.out.println("Max subarray: " + Arrays.toString(result));
//    }
//}
