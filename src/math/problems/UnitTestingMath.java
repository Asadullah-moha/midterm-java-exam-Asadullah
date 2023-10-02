package math.problems;

import org.junit.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        // Apply Unit testing into each classes and methods in this package.
        Assert.assertTrue(PrimeNumber.isPrime(2));
        Assert.assertTrue(PrimeNumber.isPrime(7));
        Assert.assertFalse(PrimeNumber.isPrime(4));
        Assert.assertFalse(PrimeNumber.isPrime(1));
    }
}
