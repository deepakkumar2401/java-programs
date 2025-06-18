package programs;

import java.util.Scanner;

public class PrimeNumberInRange {
    static boolean flag;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Starting Range:");
        int start = scanner.nextInt();
        System.out.print("Enter Ending Range:");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            int num = i;
            flag = true;
            for (int j = 2; j <= num / 2; j++) {
                if (num % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println(num + " is prime number!!");
        }
    }
}
