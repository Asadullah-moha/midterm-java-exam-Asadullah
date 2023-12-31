package algorithm;

@SuppressWarnings("unused")
public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public void selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
    }

    public void insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        //implement here
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }



        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
    }

    public int[] bubbleSort(int [] array){
        //implement here
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {

                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        return array;
    }
    

    public int [] mergeSort(int [] array){
        //implement here
        if (array.length <= 1) {
            return array;
        }
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        System.arraycopy(array, 0, left, 0, left.length);
        System.arraycopy(array, left.length, right, 0, right.length);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftIndex = 0, rightIndex = 0, resultIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] <= right[rightIndex]) {
                result[resultIndex++] = left[leftIndex++];
            } else {
                result[resultIndex++] = right[rightIndex++];
            }
        }
        System.arraycopy(left, leftIndex, result, resultIndex, left.length - leftIndex);
        System.arraycopy(right, rightIndex, result, resultIndex, right.length - rightIndex);

        return result;
    }
    

    public int [] quickSort(int [] array){
        //implement here
        return quickSort(array, 0, array.length - 1);
    }

    private int[] quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);

            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
        return array;
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return temp;
    }
    
    public void heapSort(int [] array){
        //implement here
        int n = 0;

    }

    private void heapSort(int[] array, int n, int i) {
    }


    public int [] bucketSort(int [] array){
        //implement here
        if (array == null || array.length == 0) {
            return array;
        }

        int min = array[0];
        int max = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }

        int bucketCount = max - min + 1;
        int[] buckets = new int[bucketCount];
        for (int num : array) {
            buckets[num - min]++;
        }

        int index = 0;
        for (int i = 0; i < bucketCount; i++) {
            while (buckets[i] > 0) {
                array[index++] = i + min;
                buckets[i]--;
            }
        }
        

        return array;
    }
    
    public int [] shellSort(int [] array){
        //implement here
        int n = array.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;

                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }

                array[j] = temp;
            }
        }

        return array;
    }

    public static void printSortedArray(int [] array){
        for (int j : array) {
            System.out.println(j);
        }
    }
}
