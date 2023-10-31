package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------");
        System.out.println("Please enter the number you wonder if it is a perfect number : ");
        System.out.println("--------------------------------------------------------------");


        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;

        for(int i = 1; i < number; i++ ){
            if(number % i == 0){
                sum = sum + i;
            }
        }
        if(sum == number){
            System.out.println("--------------------------------------------------------------");
            System.out.println("RESULT : " + number + " is a perfect number... ");
            System.out.println("--------------------------------------------------------------");
        }else{
            System.out.println("--------------------------------------------------------------");
            System.out.println("RESULT : " + number + " is not a perfect number!!! ");
            System.out.println("--------------------------------------------------------------");
        }

    }
}