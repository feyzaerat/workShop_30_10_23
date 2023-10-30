package org.example;

public class Main {
    public static void main(String[] args) {
        int n = 100;
        int[] fibonacciSeries = new int[n];

        // İlk iki Fibonacci sayısı
        fibonacciSeries[0] = 0;
        fibonacciSeries[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }

        System.out.println("Fibonacci Serisinin ilk 100 Sayısı");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSeries[i] + " ");
        }
    }
}