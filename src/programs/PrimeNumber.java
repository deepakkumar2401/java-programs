package programs;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number:");

        int n = scanner.nextInt();
        boolean flag = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println(n + ": is prime number");
        else
            System.out.println(n + ": is not prime number");
    }
}
