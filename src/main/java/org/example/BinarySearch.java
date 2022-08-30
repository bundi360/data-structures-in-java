package org.example;

/**
 * @author Titus Murithi Bundi
 */
public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch ox = new BinarySearch();
        int[] array = {3, 4, 5, 6, 7, 8, 9};
        int p = array.length;
        int y = 4;

        int result = ox.binarySearch(array, y, 0, p - 1);

        if (result == -1) System.out.println("Not found!");
        else System.out.println("Element not found at the index" + result);
    }

    int binarySearch(int[] array, int x, int low, int high) {
        // Repeats until the pointers low and high meet each other.
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == x) return mid;

            else high = mid - 1;

        }
        return -1;
    }
}
