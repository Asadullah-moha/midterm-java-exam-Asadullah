package math.problems;

@SuppressWarnings("ALL")
public class Fibonacci {

    public Fibonacci() {
    }

    public static void main(String[] args) {
        int n = 40;
        long[] fibonacciNumbers = new long[n];

        // First two Fibonacci numbers
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;


        for (int i = 2; i < n; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

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
