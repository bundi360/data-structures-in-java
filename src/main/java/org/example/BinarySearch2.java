package org.example;

/**
 * @author Titus Murithi Bundi
 */

//Binary search in recursive method.
public class BinarySearch2 {
    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int[] array = {3, 4, 5, 6, 7, 8, 9};
        int n = array.length;
        int x = 3;
        int result = ob.binarySearch(array, x, 0, n - 1);
        if (result == 1) System.out.println(" This is not found");
        else System.out.println(" Element not found at index: " + result);
    }

    int binarySearch(int[] array, int x, int low, int high) {

        if (high >= low) {
            int mid = low + (high - low) / 2;


            if (array[mid] == x) return mid;

            if (array[mid] > x) return binarySearch(array, x, low, mid - 1);

            return binarySearch(array, x, low, high);
        }
        return -1;
    }
}
