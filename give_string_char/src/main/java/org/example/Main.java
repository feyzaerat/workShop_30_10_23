package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Please enter the word for which you want the number of letter repetitions to be calculated : ");
        System.out.println("--------------------------------------------------------------------------------------------");

        String message = input.next();
        String result = "";
        int counter = 0;
        System.out.println("Total number of letters of " + message + " : " + message.length());

        for (int i = 0; i < message.length(); i++) {
            counter = 0;

            for (int j = 0; j < message.length(); j++) {

                if (message.charAt(i) == message.charAt(j)) {
                    counter++;
                }
            }

            if (!result.contains(message.substring(i, i + 1))) {
                result += message.substring(i, i + 1) + "=> " + counter + " ,";
            }
        }

        System.out.println("RESULT : " + result);

    }
}