package org.example;

import java.util.Arrays;

/**
 * @author Titus Murithi Bundi
 */
public class ShellSort {

    // main runner class.
    public static void main(String[] args) {
        int[] data = {20, 19, 18, 17, 23, 56, 78, 9000, 9000000};
        int size = data.length;
        ShellSort ss = new ShellSort();
        ss.shellSort(data, size);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }

    //Rearranges the elements at each n/2 , n/4, and n/4...intervals.
    void shellSort(int[] array, int n) {
        for (int interval = n / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < n; i += 1) {
                int temp = array[i];
                int j;
                for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
                    array[j] = array[j - interval];
                }
                array[j] = temp;
            }
        }


    }
}


