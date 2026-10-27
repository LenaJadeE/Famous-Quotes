package com.pluralsight;

import java.util.Random;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        String[] quotes ={
                "The only thing we have to fear is fear itself. - Franklin D. Roosevelt",
                "That's one small step for man, one giant leap for mankind. - Neil Armstrong",
                "Do or do not. There is no try. - Yoda",
                "Talk is cheap. Show me the code. - Linus Torvalds",
                "Premature optimization is the root of all evil. - Donald Knuth",
                "Stay hungry, stay foolish. - Steve Jobs",
                "I think, therefore I am. - Rene Descartes",
                "It always seems impossible until it's done. - Nelson Mandela",
                "First, solve the problem. Then, write the code. - John Johnson",
                "Any fool can write code that a computer can understand. - Martin Fowler",
                "My dreams were all my own I accounted for them to nobody they were my refuge when annoyed—my dearest pleasure when free. - Mary Shelley"
        };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String again;

        do {
            System.out.printf("Pick a quote (1 - %d), or R for a random quote: ", quotes.length);
            String input = scanner.nextLine().trim();

            try {
                if (input.equalsIgnoreCase("r")) {
                    System.out.println(quotes[random.nextInt(quotes.length)]);
                } else {
                    int number = Integer.parseInt(input);
                    int index = number - 1;

                    System.out.println(quotes[index]);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.printf("Your number was out of range. Please pick 1 - %d.%n", quotes.length);
            } catch (NumberFormatException e) {
                System.out.println("That wasn't a number. Enter 1 - " + quotes.length + " or R.");
            }

            System.out.print("Would you like to see another saying? (yes/no): ");
            again = scanner.nextLine().trim();
        } while (again.equalsIgnoreCase("yes") || again.equalsIgnoreCase("y"));

        System.out.println("Goodbye!");
        scanner.close();
    }
}
// EXERCISE 1
//  Create a new Java application named famous-quotes.
//      Remember: Always share your IntelliJ project to GitHub!
//  Create an array of strings to store 10 quotes. Add 10 of your favorite quotes to the array.
//  Prompt the user to select a number between 1 and 10 and display that quote.
//  DO NOT use try/catch (yet) to handle the error.
//  Test the application.
//  Select a number that exists. Does it work?
//  Enter a number that doesn't exist (any number other than 1 to 10).
//  What happens?
//  Now add exception handling to the application and retest.
//      BONUS: Add a loop to the program that asks the user if they want to see another saying.
//             If they say yes, repeat the process.
//             DO NOT shut the application down when an exception occurs.
//             Just pick up with the next iteration.
//      BONUS: Allow the user to select an option that will display a random quote.