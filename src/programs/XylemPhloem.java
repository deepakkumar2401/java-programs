package programs;

import java.util.Scanner;

public class XylemPhloem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = scanner.nextInt();
        int copy = n;
        int inner = 0, outer = 0;

        while (n != 0) {
            if (n == copy || n < 10) {
                int rem = n % 10;
                outer += rem;
                n = n / 10;
            } else {
                int rem = n % 10;
                inner += rem;
                n = n / 10;
            }
        }
        if (outer == inner)
            System.out.println(copy + ": is Xylem Number");
        else
            System.out.println(copy + ": is phloem Number");

    }
}
