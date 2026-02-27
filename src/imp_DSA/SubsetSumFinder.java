package imp_DSA;

public class SubsetSumFinder {

    public static void findSubsets(int[] arr, int target) {
        findSubsetsUtil(arr, target, 0, new int[arr.length], 0);
    }

    private static void findSubsetsUtil(int[] arr, int target, int index, int[] subset, int subsetSize) {
        if (target == 0) {
            // Print subset
            for (int i = 0; i < subsetSize; i++) {
                System.out.print(subset[i] + (i < subsetSize - 1 ? " + " : ""));
            }
            System.out.println();
            return;
        }

        if (target < 0 || index >= arr.length) {
            return; //
        }

        // Include current element
        subset[subsetSize] = arr[index];
        findSubsetsUtil(arr, target - arr[index], index + 1, subset, subsetSize + 1);

        // Exclude current element
        findSubsetsUtil(arr, target, index + 1, subset, subsetSize);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 10};
        int target = 16;

        System.out.println("Subsets that sum to " + target + ":");
        findSubsets(arr, target);
    }
}


