package org.example;

public class Main {

    public static void main(String[] args) {
        printFibonacciSeries(100);
    }

    public static void printFibonacciSeries(int n) {
        long[] fibonacciNumbers = new long[n];
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        System.out.println("The first " + n + " numbers in the Fibonacci series are:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciNumbers[i] + " ");
        }
    }
}
