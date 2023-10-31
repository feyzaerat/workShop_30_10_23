package org.example;

public class Main {

    public static void main(String[] args) {
        int pairCount = 0;
        int number = 1;

        while (pairCount < 2) {
            int sumDivisors1 = sumOfDivisors(number);
            int sumDivisors2 = sumOfDivisors(sumDivisors1);

            if (number != sumDivisors1 && number == sumDivisors2) {
                System.out.println("Pair " + (pairCount + 1) + ": " + number + " - " + sumDivisors1);
                pairCount++;
            }

            number++;
        }
    }

    public static int sumOfDivisors(int n) {
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }
        return sum;
    }
}
