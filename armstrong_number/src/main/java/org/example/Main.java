package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber, remainder, result = 0;
        int n = 0;

        originalNumber = number;

        // Sayıdaki basamak sayısını yaz
        while (originalNumber != 0) {
            originalNumber /= 10;
            n++;
        }

        originalNumber = number;

        // Rakamların n'inci kuvvetlerinin toplamını hesapla
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // Sonucun orijinal sayıya eşit olup olmadığını kontrol et
        return result == number;
    }
}
