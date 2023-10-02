package math.problems;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};
        int lowestDifference = findLowestDifference(array1, array2);
        System.out.println("The lowest difference between cells is: " + lowestDifference);
    }

    public static int findLowestDifference(int[] array1, int[] array2) {
        int lowestDifference = Integer.MAX_VALUE;

        for (int k : array1) {
            for (int i : array2) {
                int currentDifference = Math.abs(k - i);
                if (currentDifference < lowestDifference) {
                    lowestDifference = currentDifference;
                }
            }
        }
        return lowestDifference;

    }
}
