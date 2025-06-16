package imp_DSA;

import java.util.Arrays;

public class BalloonSorter {
    public static void sortColors(int[] balloons) {
        int low = 0, mid = 0, high = balloons.length - 1;

        while (mid <= high) {
            switch (balloons[mid]) {
                case 0:
                    // swap low and mid
                    int temp0 = balloons[low];
                    balloons[low++] = balloons[mid];
                    balloons[mid++] = temp0;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    // swap mid and high
                    int temp2 = balloons[high];
                    balloons[high--] = balloons[mid];
                    balloons[mid] = temp2;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[] balloons = {2, 0, 1, 2, 1, 0, 0, 2, 1};
        sortColors(balloons);
        System.out.println("Sorted Balloons: " + Arrays.toString(balloons));
    }
}

