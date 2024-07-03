//Tim Linkous
import java.util.Scanner;
import java.util.Random;

public class WordGuess {
    //    String words [] = ["cat", "dog", "bog", "cut"];
    String [] words = {"cat", "dog", "bog", "cut"};
    String correctWord;
    char [] playerGuess;
    int attempts = maxAttempts;
    int maxAttempts = 5;
    Scanner scanner = new Scanner(System.in);



    public void announceGame(){
        System.out.println("Let's Play Wordguess version 1.0");
    }

    public void initialize_game_state(){
        Random random = new Random();
        correctWord = words[random.nextInt(words)
        playerGuess = new char[words.length];
        for (int i = 0; i < playerGuess.length; i++) {
            playerGuess[i] = "_";
        }
    }

    public class attempts (int attemps){
        int tries = 5;
    }


}

