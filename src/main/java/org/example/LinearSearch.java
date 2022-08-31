package org.example;

import java.util.Scanner;

/**
 * @author Titus Murithi Bundi
 */
public class LinearSearch {
    public static int LinearSearch(int[] array, int x) {
        int n = array.length;

        //Looping through the arrays sequentially.
        for (int i = 0; i < n; i++) {
            if (array[i] == x) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {90, 23, 12, 456, 789, 234, -900, 123456};
        Scanner sc = new Scanner(System.in);
        System.out.println(" Kindly enter the number you want to search:");
        int x = sc.nextInt();

        int result = LinearSearch(array, x);
        if (result == -1) System.out.print(" element is not found!");
        else System.out.println("Element is found at index:" + result);
    }
}
