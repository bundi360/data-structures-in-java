package org.example;

import java.util.Arrays;

/**
 * @author Titus Murithi Bundi
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] data = {0, 34, -29, 90, -90000, -908, 789};
        InsertionSort is = new InsertionSort();
        is.insertionSort(data);
        System.out.println(" The sorted array in ascending order is as below!");
        System.out.println(Arrays.toString(data));
    }

    void insertionSort(int[] array) {
        int size = array.length;


        for (int step = 1; step < size; step++) {
            int key = array[step];
            int j = step - 1;

            //compares key with each element on the left until an element smaller is found.

            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            //This places the key at the element smaller that it (i.e) just after it.
            array[j + 1] = key;
        }
    }
}
