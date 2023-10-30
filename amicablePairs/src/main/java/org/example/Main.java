package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Numbers whose sum of all divisors other than themselves are equal to each other are called amicable pairs.

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first number :  ");
        int firstNumber = input.nextInt();

        System.out.println("Please enter second number :  ");
        int secondNumber = input.nextInt();


        int sum1 = 0;
        int sum2 =0;

        for(int i = 1; i < firstNumber; i++){
            if(firstNumber % i == 0){
                sum1 = sum1 + i;
            }
        }
        for(int i = 1; i < secondNumber; i++){
            if(secondNumber % i == 0){
                sum2 = sum2 + i;
            }
        }
        if (firstNumber == sum2 && secondNumber == sum1) {
           System.out.println("These two numbers are amicable pairs..");
        }else {
            System.out.println("These two numbers are not amicable pairs..");
        }

    }
}