package math.problems;

public class Fibonacci {
    public Fibonacci() {
    }

    public static void main(String[] args) {
        int n = 40; // Change this to the number of Fibonacci numbers you want
        long[] fibonacciNumbers = new long[n];

        // First two Fibonacci numbers
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;

        // Generate the rest of the Fibonacci numbers
        for (int i = 2; i < n; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        // Print the Fibonacci numbers
        System.out.print("First " + n + " Fibonacci numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciNumbers[i] + " ");
        }

         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */


    }
}
