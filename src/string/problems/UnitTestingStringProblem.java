package string.problems;

import org.junit.Assert;

import java.util.Arrays;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        for (String s : Arrays.asList("racecar", "madam")) {
            org.junit.Assert.assertTrue(Palindrome.isPalindrome(s));
        }
        org.junit.Assert.assertFalse(Palindrome.isPalindrome("hello"));
    }

    public void testFindDuplicates() {
        // Test cases for findDuplicates method
        String input = "Java is a programming Language. Java is also an Island of Indonesia.";
        int count = DuplicateWord.findDuplicates(input);
        Assert.assertEquals(3, count);
    }

    public void testFindPermutations() {
        // Test cases for findPermutations method
        String input = "ABC";
        String[] expected = {"ABC", "ACB", "BAC", "BCA", "CAB", "CBA"};
        String[] result = new String[]{(input)};
        Assert.assertArrayEquals(expected, result);
    }

    // Add more test cases for other methods as needed

}

