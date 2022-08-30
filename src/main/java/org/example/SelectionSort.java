package org.example;

import java.util.Arrays;

/**
 * @author Titus Murithi Bundi
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] data = {20, 12, 10, 15, 2};
        SelectionSort ss = new SelectionSort();
        ss.selectionSort(data);
        System.out.println(" Sorted in ascending order!");
        System.out.println(Arrays.toString(data));
    }

    void selectionSort(int[] array) {

        int size = array.length;
        for (int step = 0; step < size; step++) {
            int min_idx = step;

            for (int i = step + 1; i < size; i++) {
                if (array[i] < array[min_idx]) {

                }

            }
            int temp = array[step];
            array[step] = array[min_idx];
            array[min_idx] = temp;
        }
    }

}
