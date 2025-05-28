package interview;

import java.util.Scanner;

public class BlockMergeByBit {


    public static int countMerges(int n) {
        int merges = Integer.bitCount(n);
        return merges - 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of blocks: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Number of merges required: " + countMerges(n));
    }
}
