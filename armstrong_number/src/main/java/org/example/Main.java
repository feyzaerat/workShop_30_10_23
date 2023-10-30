package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String numberStr = scanner.nextLine();

        int numberLength = numberStr.length();
        int numberNormal = Integer.parseInt(numberStr);

        int number = numberNormal;
        int total = 0;
        int remainder = 0;

        while(number != 0){
            remainder = number % 10;
            total += (int)Math.pow(remainder, numberLength);
            number = number / 10;
        }

        if(total == numberNormal){
            System.out.println(numberStr + " is an Armstrong number ");
        } else{
            System.out.println(numberStr + " is not an Armstrong number ");
        }


    }
}