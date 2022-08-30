package org.example;

import java.util.Arrays;

/**
 * @author Titus Murithi Bundi
 */
public class QuickSort {
    // method to find the position at which to partition.
    static int partition(int[] array, int low, int high) {
        //Choosing the right most element as the pivot of partitioning.
        int pivot = array[high];

        //pointer for the greater element
        int i = (low - 1);

        //Traversing through all elements to compare each with the pivot.
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                //If an element smaller than the pivot is found. Swap it with the greater element pointed by i.
                i++;
                //Swapping the element pointed at i with an element at j.

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

            }
        }

        // swap the pivot element with the greater element specified at i.
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        //return the position from where partition is done.

        return (i + 1);
    }

    static void quickSort(int[] array, int low, int high) {
        if (low < high) {

            // find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pi = partition(array, low, high);

            // recursive call on the left of pivot
            quickSort(array, low, pi - 1);

            // recursive call on the right of pivot
            quickSort(array, pi + 1, high);
        }
    }

    // Main class

        public static void main(String[] args) {

            int[] data = {90,-9,-8,-7,-900,35,5666,-89,-9000000};
            System.out.println("Unsorted Array");
            System.out.println(Arrays.toString(data));

            int size = data.length;

            // call quicksort() on array data
            QuickSort.quickSort(data, 0, size - 1);

            System.out.println("The sorted Array in Ascending Order: ");
            System.out.println(Arrays.toString(data));
        }
    }
