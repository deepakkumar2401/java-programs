package programs;

import java.util.Scanner;

public class DesariumNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number=");
        int num = sc.nextInt();
        int copy = num;
        int sum = 0;
        while (num != 0) {
            int base = num % 10;
            sum = sum + power(base, count(num));
            num = num / 10;
        }
        if (copy == sum)
            System.out.println(copy + " is Desarium number");
        else
            System.out.println(copy + " is not Desarium number");
    }

    static int power(int base, int exp) {
        int ans = 1;
        while (exp != 0) {
            ans = ans * base;
            exp--;
        }
        return ans;
    }

    static int count(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

}
