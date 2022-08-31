package org.example;

/**
 * @author Titus Murithi Bundi
 */
public class HeapSort {
    static void printArray(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + "");
        System.out.println();
    }

    //main method.
    public static void main(String[] args) {
        int[] arr = {12, -456, -89, 9000, 789, 678, 243, 1, -28};
        HeapSort hs = new HeapSort();
        hs.sort(arr);
        System.out.println(" The sorted array is:");
        printArray(arr);
    }

    public void sort(int[] arr) {
        int n = arr.length;
        //Building the maximum heap.

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Heap sort method.
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            //Heapify the root element.
            heapify(arr, i, 0);
        }
    }

    void heapify(int[] arr, int n, int i) {
        //finding the largest among the root, left child and the right child.
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest]) largest = l;

        if (r < n && arr[r] > arr[largest]) largest = r;

        // swap them and continue heapifying if the root is not the largest.
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}
