package org.example;

import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        // Slot Machine

        // Declare Variables
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        // Display Welcome Message
        System.out.println("*************************");
        System.out.println("Welcome to Java Slots");
        System.out.println("Symbols: 🍋 🍉 🍒 🔔 ⭐");
        System.out.println("*************************");

        // Play if Balance > 0
        while(balance > 0)
        {
            // enter bet amount
            System.out.println("Current Balance: $" + balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            //Verify if bet > balance
            if(bet > balance)
            {
                System.out.println("\tINSUFFICIENT FUNDS");
                continue;
            }
            else if(bet <= 0) //Verify if bet > 0
            {
                System.out.println("\tBet must be greater than 0");
                //continue;
            }
            else
            {
                balance -= bet; //Subtract bet from balance
            }

            // Spin row
            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if(payout > 0)
            {
                System.out.println("You won $" + payout);
                balance += payout;
            }
            else
            {
                System.out.println("You have lost this round");
            }

            // Ask to play again
            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();

            if(!playAgain.equals("Y"))
            {
                break;
            }
        }

        // display exit Message
        System.out.println("GAME OVER! Your final balance is $" + balance);
        scanner.close();
    }

    static String[] spinRow()
    {
        String[] symbols = {"🍋", "🍉", "🍒", "🔔", "⭐"};
        //String[] symbols = {"🍋 ", "🍉 ", "🍒 ", "🔔 ", "⭐" }; // error because I had spaces after some symbols
        String[] row = new String[3];
        Random random = new Random();

        for(int i = 0; i < 3; i++)
        {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }
    // Print row
    static void printRow(String[] row)
    {
        System.out.println("**********");
        System.out.println(" " + String.join("|", row) );
        System.out.println("**********");
    }

    // Get Payout
    static int getPayout(String[] row, int bet)
    {
        // check if symbols match
        if( row[0].equals(row[1]) && row[1].equals(row[2]) )
        {
            return switch(row[0])
            {
                case "🍋" -> bet * 3;
                case "🍒" -> bet * 4;
                case "🍉" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;

            };
        }
        else if( row[0].equals(row[1]) )
        {
            return switch(row[0])
            {
                case "🍋" -> bet * 2;
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        else if( row[1].equals(row[2]) )
        {
            return switch(row[1])
            {
                case "🍋" -> bet * 2;
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }
}