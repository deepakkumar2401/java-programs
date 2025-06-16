package imp_DSA;

public class SubarrayToSort {

    public static void findUnsortedIndices(int[] arr) {
        int n = arr.length;
        int start = 0, end = n - 1;

        while (start < n - 1 && arr[start] <= arr[start + 1]) {
            start++;
        }
        if (start == n - 1) {
            System.out.println("Array is already sorted");
            return;
        }

        while (end > 0 && arr[end] >= arr[end - 1]) {
            end--;
        }

        int min = arr[start], max = arr[start];
        for (int i = start; i <= end; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        while (start > 0 && arr[start - 1] > min) {
            start--;
        }

        while (end < n - 1 && arr[end + 1] < max) {
            end++;
        }

        System.out.println("Unsorted subarray is from index " + start + " to " + end);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2, 6, 7};
        findUnsortedIndices(arr);
    }
}

