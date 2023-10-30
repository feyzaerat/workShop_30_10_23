package org.example;
public class PerfectNumbers {
    public static void main(String[] args) {
        int count = 0;
        long number = 1;

        System.out.println("The first 10 perfect numbers are:");

        while (count < 10) {
            if (isPerfect(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    public static boolean isPerfect(long num) {
        long sum = 1;

        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }
}