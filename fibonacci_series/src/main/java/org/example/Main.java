package org.example;

public class Main {
    public static void main(String[] args) {
        int n = 15;
        int firstNumber = 0;
        int secondNumber = 1;

        System.out.println("There is Fibonacci series till " + n + ":" );

        for(int i=1; i <= n; ++i){
            System.out.print(firstNumber + ", ");
            int nextNumber = firstNumber + secondNumber ;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}