package algorithm;

import org.junit.Assert;

@SuppressWarnings("CatchMayIgnoreException")
public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    @SuppressWarnings({"CatchMayIgnoreException", "ResultOfMethodCallIgnored"})
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        Sort sort = new Sort();
        sort.selectionSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray, unSortedArray);
        }catch(Exception ex){
            ex.getMessage();
        }

        //Now implement Unit test for rest of the soring algorithm...................below
        System.out.println();

    }
}
