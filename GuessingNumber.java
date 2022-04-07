package com.company.proects.guessingnumber;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumber
{
    public static void main(String[] args) {
        Random rand = new Random();

        Scanner sc = new Scanner(System.in);

        int randomnumber = rand.nextInt(100) +1;
//        System.out.println("Random number is"+randomnumber);
        while (true) {

            System.out.println("enter your guess from 1 to 100: ");

            int playerGuess = sc.nextInt();

            if (playerGuess == randomnumber)
            {
                System.out.println("CORRECT!!! You got it :=)");
                break;
            }
            else if (playerGuess>randomnumber)
            {
                System.out.println("Nope! The number is small!  Try again bro :=(");
            }
            else
            {
                System.out.println("Nope! The number is big!  Try again bro :=(");
            }
        }

    }
}
