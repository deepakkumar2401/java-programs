package imp_DSA;

public class SumOfSquares {
    public static int sumOfSquares(int n) {
        return (n * (n + 1) * (2 * n + 1)) / 6;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of squares from 1 to " + n + " is: " + sumOfSquares(n));
    }
}

