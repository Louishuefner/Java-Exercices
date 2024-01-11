import java.util.Scanner;

public class GuessNumberGame {

    
    public static void run(Scanner scChoice) {
        
        boolean restart = true ;
        while (restart) {
            startGuessingGame(scChoice);
            restart = HelperMethods.getRestart(scChoice, "Guess Number Game");
        }
    }
    

    public static void startGuessingGame (Scanner input){
 
        int expected = 1 + (int)(10* Math.random());
        int i = 0;
        System.out.println("\n\n\nA number is chosen between 1 to 10, Guess the number within 5 tries.\n\n");
        
        startTries (input, i, expected);
    }
    

    private static void startTries (Scanner input, int currentTryCount, int expected) {
        
        int maxTryCount = 5;

        for (int i = currentTryCount; i < maxTryCount; i++) {
            System.out.print("Guess the number: ");
            int guess = HelperMethods.getNumber(input);
            boolean guessedCorrectly = tryCheckGuess(input, expected, i, guess, maxTryCount);
            if (guessedCorrectly) {
                break;
            }
        }
    }

    
    private static boolean tryCheckGuess (Scanner input, int expected, int currentTryCount, int guess, int maxTryCount){

        if (guess <= 10 && guess >= 1) {
            boolean guessResult = printAndGetGuessResult(expected, guess);
            if (guessResult) {
                return true;
            }
            else if (maxTryCount == currentTryCount && !guessResult) {
                System.out.println("\nYou have exhausted all of your " + maxTryCount + " tries.\n");
                System.out.println("The number was " + guess);
            }
            else if (currentTryCount < 1) {
                System.out.println("\nYou have exhausted " + (currentTryCount + 1) + " try.\n\n");
            }
            else if (currentTryCount == 4) {
                System.out.println("\nSorry, you have exhausted all tries :( Better luck next time.\n\n");
            }
            else {
                System.out.println("\nYou have exhausted " + (currentTryCount + 1) + " tries.\n\n");
            }
        }
        else {
            System.out.print("\nYour number was either too high or too low, so please only input a number between 1 and 10 : ");
            int newValid = HelperMethods.getNumber(input);
            tryCheckGuess(input, expected, currentTryCount, newValid, maxTryCount);
            System.out.println();
        }
        return false;
    }


    private static boolean printAndGetGuessResult(int expected, int guess){
        if (expected == guess){
            System.out.println("\nCongratulations! You guessed the number.");
            return true;
        }
        else if (guess > expected){
            System.out.println("\nThe number is less than " + guess);
        }
        else {
            System.out.println("\nThe number is higher than " + guess);
        }
        return false;
    }
}