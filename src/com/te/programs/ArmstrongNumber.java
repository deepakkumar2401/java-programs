package com.te.programs;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number:");

        int n = scanner.nextInt();
        int copy = n;

        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += power(rem, count(copy));
            n = n / 10;
        }
        if (copy == sum)
            System.out.println(copy + ": is Armstrong Number");
        else
            System.out.println(copy + ": is Not Armstrong Number");
    }

    public static int power(int base, int power) {
        int mul = 1;
        while (power != 0) {
            mul = mul * base;
            power--;
        }
        return mul;
    }

    public static int count(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}
