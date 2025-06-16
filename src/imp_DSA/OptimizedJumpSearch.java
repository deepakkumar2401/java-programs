package imp_DSA;

public class OptimizedJumpSearch {

    public static int minJumps(int[] arr) {
        int n = arr.length;
        if (n <= 1) return 0;

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + arr[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                if (currentEnd >= n - 1) break;
            }
        }

        return jumps;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 8, 12, 15};
        int result = minJumps(arr);
        System.out.println("Minimum number of jumps: " + result);
    }
}

