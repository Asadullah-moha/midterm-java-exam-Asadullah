package math.problems;

public class Factorial {

    public static void main(String[] args) {
        int number = 5;
        long factorial = calculateFactorialRecursive(number);
        System.out.println("Factorial of " + number + " using recursion: " + factorial);
    }

    public static long calculateFactorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * calculateFactorialRecursive(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        long factorial = calculateFactorialIterative(number);
        System.out.println("Factorial of " + number + " using iteration: " + factorial);
    }

    public static long calculateFactorialIterative(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;

        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

    }
}
