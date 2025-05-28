package interview;

import java.util.List;

public class Plot {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5};

        int desiredPlot = 8;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                sum = sum + arr[j];
                if (sum == desiredPlot) {
                    flag = true;
                }
            }
        }
        if (flag) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
