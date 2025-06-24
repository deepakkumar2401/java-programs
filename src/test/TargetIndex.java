package test;

public class TargetIndex {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 7, 9, 12, 15, 17, 21, 24};
        int target = 17;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                System.out.println("Output:" + i);
        }
    }
}
