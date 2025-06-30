package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 5) + 1;
        Scanner scanner = new Scanner(System.in);
//        System.out.println(secretNumber);
        System.out.println("I'm thinking of a number between 1 and 5.");
        for (int i = 0; i < 3; ){
            System.out.print("Guess " + ++i + ": ");
            int guessNumber = scanner.nextInt();
            if (guessNumber == secretNumber){
                System.out.println("You guessed it!\nYou win!");
                return;
            } else if (i < 3){
                System.out.println("Wrong Guess.");
            } else {
                System.out.println("You lose. The correct number was " + secretNumber + ".");
            }
        }

    }
}