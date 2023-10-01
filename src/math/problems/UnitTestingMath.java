package math.problems;

import org.junit.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        {
            // Test cases to check if isPrime method works as expected
            Assert.assertTrue(PrimeNumber.isPrime(2)); // 2 is prime
            Assert.assertTrue(PrimeNumber.isPrime(7)); // 7 is prime
            Assert.assertFalse(PrimeNumber.isPrime(4)); // 4 is not prime
            Assert.assertFalse(PrimeNumber.isPrime(1)); // 1 is not prime
        }
    }
}
