
import java.util.*;

public class QuadraticSorts {

    /**
     * @pre  0 <= i, j < array.length
     * @post array is modified to swap the elements at i and j
     */
    public static void swap(int[] array, int i, int j) {
        // TODO swap the elements at indicies i and j in array

    }

    /**
     * @pre none
     * @post elements in array appear in ascending order
     */
    // TODO write a short description of how bogo sort works
    //
    // TODO state the big O of bogo sort in the BEST, WORST, and AVERAGE case
    // explain why
    //
    public static void bogoSort(int[] array) {
        // TODO implement bogo sort (+1 point extra credit)

    }

    /**
     * @pre none
     * @post elements in array appear in ascending order
     */
    // TODO write a short description of how Boone sort works
    //
    // TODO state the big O of Boone sort in the BEST, WORST, and AVERAGE case
    // explain why
    //
    public static void booneSort(int[] array) {
        // TODO implement Boone sort (+1 point extra credit)

    }

    /**
     * @pre  none
     * @post elements in array appear in ascending order
     */
    // TODO write a short description of how bubble sort works
    //
    // TODO state the big O of bubble sort in the BEST, WORST, and AVERAGE case
    // explain why
    // 
    public static void bubbleSort(int[] array) {
        // TODO implement bubble sort

    }

    /**
     * @pre  none
     * @post elements in array appear in ascending order
     */
    // TODO write a short description of how insertion sort works
    //
    // TODO state the big O of insertion sort in the BEST, WORST, and AVERAGE case
    // explain why
    //
    public static void insertionSort(int[] array) {
        // TODO implement insertion sort

    }

    /**
     * @pre  none
     * @post elements in array appear in ascending order
     */
    // TODO write a short description of how insertion sort works
    //
    // TODO state the big O of selection sort in the BEST, WORST, and AVERAGE case
    // explain why
    //
    public static void selectionSort(int[] array) {
        // TODO implement selection sort

    }

    // EXAMPLE :)
    /**
     * @pre  none
     * @post no element in array is modified by this method
     */
    // isSorted checks every sequencial pair of elements in array
    //    if   it is ever the case that the latter element is less than the former element
    //         then the array cannot be considered sorted, so we return false
    //    otherwise return true
    //
    // BEST CASE:    O(1) because array could have its first two elements be unsorted, e.g., {1, 0, 1, 2, 3}
    // AVERAGE CASE: O(n) because in general the out of order will be roughly in the center of the array
    //                    so the amount of the array we have to check will be a proportion of n
    // WORST CASE:   O(n) because array could be fully sorted, e.g., {0, 1, 2, 3}
    //                    in this case we have to check the whole array
    public static boolean isSorted(int[] array) {
        for(int i = 0; i < array.length - 2; i++) {
            if(array[i + 1] < array[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main() {
        /**
         * TODO sort the data we generated in class
         * 
         * 1. create an array to store the data from class
         * 2. print out the unsorted array
         * 3. sort the array using your sorting functions
         * 4. print out the sorted array
         * 5. display the min, max, and middle value (median) of the class data
         */
        
    }


}