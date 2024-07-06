package com.github.zipcodewilmington;//Tim Linkous
import org.w3c.dom.ls.LSOutput;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


public class WordGuess {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();private final String[] myWords = {"base", "walk", "ball", "home", "team"};
    int randomNumber = random.nextInt(myWords.length);
    char randomWord[] = myWords[randomNumber].toCharArray();
    int numberOfGuesses = randomWord.length;
    char playerGuess[] = new char[numberOfGuesses];


    public void initialize_game_state(){
        for (int i = 0; i < playerGuess.length; i++) {
            playerGuess[i] = '_';
        }
    }
    public void announceGame() {
        System.out.println("Let's Play Wordguess version 1.0");
    }
    public void gameOver() {
        System.out.println("GAME OVER.\n");
    }
    public void playerWonMessage() {
        System.out.println("Congratulations, you won!\n");
    }
    public void playerLostMessage() {
        System.out.println("You Lost! You ran out of guesses.\n");
    }
    public void askToPlayAgain() {
        System.out.println("Would you like to play again? (y/n)");
        Scanner playAgain = new Scanner(System.in);
    }

    public static boolean isTheWordGuessed (char[] array){
        boolean result = true;
        for (int i = 0; i < array.length; i++){
            if (array[i] == '_'){
                result = false;
            }
        }
        return result;
    }
    public void runGameLoop() {
        boolean runGame = true;
        while (runGame) {
            announceGame();
            initialize_game_state();

            boolean wordIsGuessed = false;
            int attempts = 5;

            while (!wordIsGuessed && attempts != numberOfGuesses) {
                System.out.println("Current Guesses: " + Integer.toString(attempts));
                System.out.println(Arrays.toString(playerGuess));
                System.out.println("Please guess a single letter.");
                char guess = scanner.nextLine().charAt(0);
                attempts--;

                boolean correctGuess = false;
                for (int i = 0; i < randomWord.length; i++) {
                    if (randomWord[i] == guess) {
                        playerGuess[i] = guess;
                    }
                }
                if (!correctGuess) {
                    System.out.println("Incorrect. Please guess again");
                }
                if (isTheWordGuessed(playerGuess)) {
                    wordIsGuessed = true;
                    playerWonMessage();
                }
            }
            if (!wordIsGuessed) {
                playerLostMessage();
            }
        }
        askToPlayAgain();
        String answer = scanner.nextLine().toLowerCase();
        if (answer == "no") {
            runGame = false;
        } else if (answer != "yes" || answer != "no") {
            System.out.println("Not a valid input. Please enter yes or no to continue.");
        }
        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
//announce_game() prints a welcome
//game_over() prints "game over"
//initialize_game_state() sets up char[] for secret word and guesses
//get_next_guess() returns a char from player input
//is_word_guessed() returns boolean
//ask_to_play_again() returns boolean
//print_current_state() uses printArray to show player where they are at
//process() loops thru the word array, looking for the inputed guess, and replaces the "_" with the guesses char if found
//player_won() prints happy message
//player_lost() print sad message
