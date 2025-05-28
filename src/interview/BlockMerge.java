package interview;

import java.util.Scanner;

public class BlockMerge {

    public static int countMerges(int n) {
        int merges = 0;

        while (n > 1) {
            merges += n / 2;
            n = (n / 2) + (n % 2);
        }

        return merges;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of blocks: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Number of merges required: " + countMerges(n));
    }
}
