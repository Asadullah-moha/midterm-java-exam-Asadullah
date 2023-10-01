package math.problems;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MySql] to store data and retrieve data.
		 *
		 */
		int n = 1000000; // Define the upper limit
		boolean[] isPrime = new boolean[n + 1];

		for (int i = 2; i <= n; i++) {
			isPrime[i] = true;
		}

		for (int p = 2; p * p <= n; p++) {
			if (isPrime[p]) {
				for (int i = p * p; i <= n; i += p) {
					isPrime[i] = false;
				}
			}
		}

		int count = 0;
		for (int i = 2; i <= n; i++) {
			if (isPrime[i]) {
				System.out.print(i + " ");
				count++;
			}
		}

		System.out.println("\nTotal prime numbers between 2 and 1 million: " + count);
	}

	public static boolean isPrime(int i) {
        return false;
	}
}
