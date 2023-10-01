package string.problems;

public class Permutation {

    public static void main(String[] args) {
        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        String input = "ABC";
        computePermutations(input, "");
    }

    public static void computePermutations(String input, String current) {
        int n = input.length();
        if (current.length() == n) {
            System.out.println(current);
            return;
        }

        for (int i = 0; i < n; i++) {
            char ch = input.charAt(i);

            if (current.indexOf(ch) != -1) {
                continue;
            }

            computePermutations(input, current + ch);
        }
    }
}
