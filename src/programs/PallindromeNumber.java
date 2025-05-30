package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PallindromeNumber {

    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        System.out.print("enter number=");
        int number = Integer.parseInt(reader.readLine());
        int copy = number;
        int sum = 0;
        while (number != 0) {
            int rem = number % 10;
            sum = (sum * 10) + rem;
            number = number / 10;
        }
        if (copy == sum) {
            System.out.println(copy + ": is Pallindrome number!");
        } else {
            System.out.println(copy + ": is not Pallindrome number!");
        }
    }
}
