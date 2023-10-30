package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(number + " bir Armstrong sayısı değildir.");
        }
    }

    // Bir sayının Armstrong sayısı olup olmadığını kontrol eden fonksiyon
    static boolean isArmstrongNumber(int Number) {
        int toplam = 0;
        int tempNum = Number;
        int numOfDigits = String.valueOf(Number).length();

        while (tempNum != 0) {
            int digit = tempNum % 10;
            toplam += Math.pow(digit, numOfDigits);
            tempNum /= 10;
        }

        return toplam == Number;
    }

}