package programs;

import java.util.Scanner;

public class StrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter Number:");
        int n = scanner.nextInt();
        int copy = n;
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            int mul = 1;
            for (int i = rem; i >= 1; i--) {
                mul = mul * i;
            }
            sum = sum + mul;
            n = n / 10;
        }
        if (copy == sum) {
            System.out.println(copy + ": is Strong number!!!!!!");
        } else {
            System.out.println(copy + ": is not Strong number!!!!!!");
        }
    }
}
