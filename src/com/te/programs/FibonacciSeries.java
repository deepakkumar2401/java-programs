package com.te.programs;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number=");
        int f1 = sc.nextInt();
        System.out.print("Enter Second number=");
        int f2 = sc.nextInt();
        System.out.print("How many series we want=");
        int no = sc.nextInt();
        sc.close();

        System.out.print(f1 + " " + f2);
        int f3 = 0;
        for (int i = 3; i <= no; i++) {
            f3 = f1 + f2;
            System.out.print(" " + f3);
            f1 = f2;
            f2 = f3;
        }
    }
}
