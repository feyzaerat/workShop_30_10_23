package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word : ");
        String firstWord = input.next();

        System.out.println("Enter second word : ");
        String secondWord = input.next();

        Boolean result = true;


        if (firstWord.length() == secondWord.length()) {
            for (int i = 0; i < firstWord.length(); i++) {
                if (firstWord.toLowerCase().contains((secondWord.toLowerCase().substring(i, i + 1)))) {
                    continue;
                } else {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        if (result) {
            System.out.println("RESULT : " + firstWord + " & " + secondWord + " => ANAGRAM");
        } else {
            System.out.println("RESULT : These are not Anagram !! ");
        }
    }
}