package org.example;

import java.util.Scanner;

/**
 * @author Titus Murithi Bundi
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter the number you need factorial about:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), result;

        result = Factorial.factorial(x);

        System.out.println(x + "factorial = " + result);

    }

    class Factorial {
        static int factorial(int p) {
            if (p != 0)

                return p * factorial(p - 1);
            else return 1;
        }
    }
}
