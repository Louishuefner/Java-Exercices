import java.util.Scanner;

public class GuessNumberGame {

    
    public static void run(Scanner seChoice){
        
        boolean restart = true ;
        System.out.println("\n\n\nA number is chosen between 1 to 10, Guess the number within 5 trials.\n\n");
        while(restart){
            startGuessingGame(seChoice);
            restart = HelperMethods.getRestart(seChoice, "Guess Number Game");
        }
    }


    public static void startGuessingGame(Scanner louis, int number){ 
        int guess = 1 + (int)(10* Math.random());
        System.out.println();
 

        int i = 0;
        
        boolean guessedCorrectly = tryCheckGuess(louis, guess, i, number);
        if(guessedCorrectly){
            return;
        }
        i++;

        startTries(louis, i, guess);

    }
    
    public static void startGuessingGame(Scanner louis){

        int guess = 1 + (int)(10* Math.random());
        System.out.println();

        int i = 0;
        
        startTries(louis, i, guess);

    }
    
    private static void startTries(Scanner louis, int currentTryCount, int expected){
        
        int K = 5;
        int maxTryCount = K;

        for (int i = currentTryCount; i < maxTryCount; i++) {
            System.out.print("Guess the number: ");
            int number = HelperMethods.getNumber(louis);
            boolean guessedCorrectly = tryCheckGuess(louis, expected, i, number);
            if(guessedCorrectly){
                break;
            }
        }
    }

    private static boolean tryCheckGuess(Scanner louis, int expected, int currentTryCount, int guess){

        int K = 5;
        int maxTryCount = K;

        if (guess <= 10 && guess >= 1){

            boolean guessResult = checkGuess(expected, guess);
            if(guessResult){
                return true;
            }

            if(maxTryCount == currentTryCount && !guessResult){
                System.out.println("\nYou have exhausted all of your " + maxTryCount + " trials.\n");
                System.out.println("The number was " + guess);
            }
            else{
                System.out.println("\nYou have exhausted " + (currentTryCount + 1) + " trial(s).\n\n");
            }

        }
        else{
            System.out.print("\nYour number was either too high or too low, so please only input a number between 1 and 10 : ");
            int newValid = HelperMethods.getNumber(louis);
            tryCheckGuess(louis, expected, currentTryCount,newValid);
            System.out.println();
        }
        return false;
    }

    private static boolean checkGuess(int expected, int input){
        if(expected == input){
            System.out.println("\nCongratulations! You guessed the number.");
            return true;
        }
        if(input > expected){
            System.out.println("\nThe number is less than " + input);
        }else {
            System.out.println("\nThe number is higher than " + input);
        }
        return false;
    }
}