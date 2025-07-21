package test;

public class MaxAndMin {

    public static void findUnsortedSubarray(int[] arr) {
        int n = arr.length;
        int left = -1, right = -1;

        // Step 1: Find the first violation from the left
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                left = i;
                break;
            }
        }

        // Array is already sorted
        if (left == -1) {
            System.out.println("The array is already sorted.");
            return;
        }

        // Step 2: Find the first violation from the right
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                right = i;
                break;
            }
        }

        // Step 3: Find min and max in subarray [left, right]
        int min = arr[left], max = arr[left];
        for (int i = left; i <= right; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        // Step 4: Expand left to include all elements > min
        while (left > 0 && arr[left - 1] > min) {
            left--;
        }

        // Step 5: Expand right to include all elements < max
        while (right < n - 1 && arr[right + 1] < max) {
            right++;
        }

        System.out.println("Unsorted subarray range: [" + left + ", " + right + "]");
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2, 6, 7};
        findUnsortedSubarray(arr);
    }
}


