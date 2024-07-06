//Tim Linkous
import java.util.Scanner;
import java.util.Random;

public class WordGuess {
    private final String [] myWords = {"base", "walk", "ball", "home", "team"};
//    String correctWord;
//    char [] playerGuess;
//    int attempts = maxAttempts;
//    int maxAttempts = 5;
//    boolean inWordGuessed = false;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();


    public void initialize_game_state(){
        correctWord = myWords[random.nextInt(myWords.length):
        playerGuess = new char[];
        for (int i = 0; i < playerGuess.length; i++) {
            playerGuess[i] = "_";
        }
    }
    public void announceGame(){
        System.out.println("Let's Play Wordguess version 1.0");
    }
    public void gameOver(){
        System.out.println("GAME OVER.\n");
    }
    public void playerWonMessage(){
        System.out.println("Congratulations, you won!\n");
    }
    public void playerLostMessage(){
        System.out.println("You Lost! You ran out of guesses.\n");
    }
    public void askToPlayAgain(){
        System.out.println("Would you like to play again? (y/n)");
        Scanner playAgain = new Scanner(System.in);
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
