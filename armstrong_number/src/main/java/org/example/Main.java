package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int number = input.nextInt();
        input.close();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number....");
        } else {
            System.out.println(number + " is not an Armstrong number !!!");
        }
    }


    static boolean isArmstrongNumber(int Number) {
        int sum = 0;
        int temporary = Number;

        int numberOfDigits = String.valueOf(Number).length();

        while (temporary != 0) {
            int figure = temporary % 10;
            sum += Math.pow(figure, numberOfDigits);
            temporary /= 10;
        }

        return sum == Number;
    }

}