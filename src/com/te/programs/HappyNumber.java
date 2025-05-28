package com.te.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HappyNumber {

    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        System.out.print("enter Number:");
        int n = Integer.parseInt(reader.readLine());
        while (n > 9) {
            n = happy(n);
        }
        if (n == 1 || n == 7) {
            System.out.println(n + ": is happy number!!!!");
        } else {
            System.out.println(n + ": is not happy number!!!!");
        }
    }

    private static int happy(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum + (rem * rem);
            n = n / 10;
        }
        return sum;
    }
}
