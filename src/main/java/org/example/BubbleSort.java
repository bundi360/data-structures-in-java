package org.example;

import java.util.Arrays;

/**
 * @author Titus Murithi Bundi
 */
//Bubble sort in java.
public class BubbleSort {
    //Method to perform bubble sort.
    static void bubbleSort(int[] array) {
        int size = array.length;
        //This is the loop to access array elements.
        for (int i = 0; i < size - 1; i++)
            //This is the loop to compare array elements.
            for (int j = 0; j < size - i - 1; j++)

                //compare two adjacent elements.
                //sort in descending order.

                if (array[j] > array[j + 1]) {
                    //A swap is done if elements are not in the required order.
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    public static void main(String[] args) {
        int[] data = {-9, -90, -50, 7, 90, 87, 2, 12};
        BubbleSort.bubbleSort(data);

        System.out.println(" Sorted array is in ascending order!");
        System.out.println(Arrays.toString(data));
    }
}
