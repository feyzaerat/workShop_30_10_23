package org.example;

import java.util.Scanner;

public class Main {
    boolean uniqueCharacters(String message) {


        for (int i = 0; i < message.length(); i++) {
            for (int j = i + 1; j < message.length(); j++) {
                if (message.charAt(i) == message.charAt(j)) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the String : ");
        String message = input.next();
        if (obj.uniqueCharacters(message)) System.out.println("The String [ " + message + " ] has all unique characters...");
        else System.out.println("The String [ " + message + " ] has duplicate characters....");


    }
}