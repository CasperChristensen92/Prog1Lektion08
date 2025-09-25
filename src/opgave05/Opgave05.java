package opgave05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Opgave05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] strings = {"hello", "world", "arsenal", "chicken", "potato", "competetion", "calculate", "programming"};
        int r = random.nextInt(strings.length - 1);
        String correctWord = strings[r];
        char[] correctWordInChars = correctWord.toCharArray();
        for (int i = 0; i < correctWordInChars.length; i++) {
            correctWordInChars[i] = Character.toLowerCase(correctWordInChars[i]);
        }
        char[] guessedChars = new char[correctWordInChars.length];
        Arrays.fill(guessedChars, '_');
        ArrayList<Character> guesses = new ArrayList<>();
        int life = 6;
        System.out.println("The word you are trying to guess has " + correctWordInChars.length + " letters");
        while (life > 0) {
            char guess = '0';
            System.out.println("You have " + life + " life remaining");
            System.out.println("And your current progress is:");
            System.out.println(guessedChars);
            System.out.println("Do you want to guess the word now? Press enter with no input to skip");
            String guessedWord = scanner.nextLine();
            if (!guessedWord.isEmpty()) {
                if (guessedWord.equalsIgnoreCase(correctWord)) {
                    System.out.println("Congratulations. You won the game!");
                    break;
                } else {
                    System.out.println("Sorry, but wrong guess! You lose a life");
                    life -= 1;
                }
            }
            System.out.println("Guess a letter");
            try {
                guess = scanner.next("[a-åA-Å]").charAt(0);

            } catch (Exception e) {
                System.out.println("You did not enter a letter. The guess does not count");
                String newWord = scanner.nextLine();
                continue;
            }
            String newWord = scanner.nextLine(); // begins a new line in scanner. Otherwise the guess would be skipped (counts for both newWord)
            boolean goodChoice = false;
            guess = Character.toLowerCase(guess);
            if (guesses.contains(guess)) {
                System.out.println("You have allready tried this letter. Try an other letter next time");
                continue;
            }
            for (int i = 0; i < correctWordInChars.length; i++) {
                if (guess == correctWordInChars[i]) {
                    goodChoice = true;
                    guessedChars[i] = guess;
                }
            }
            if (!goodChoice) {
                System.out.println("Wrong guess. You lose a life");
                life -= 1;
            }
            guesses.add(guess);
            System.out.println("Your tried letters are:");
            System.out.println(guesses);

        }
    }

}
