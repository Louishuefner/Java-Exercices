import java.util.Scanner;

public class GuessNumberGame {

    
    public static void run(Scanner seChoice){
        
        int i = 0;
        boolean restart = true ;
        System.out.println("\n\n\nA number is chosen between 1 to 10, Guess the number within 5 trials.\n\n");
        while(restart){
            startGuessingGame();
            if(i > 0){
                restart = printChoice(seChoice);
            }
            i++;
        }
    }


    public static void startGuessingGame(int number){ 
        int guess = 1 + (int)(10* Math.random());
        System.out.println();
 

        int i = 0;
        
        boolean guessedCorrectly = tryCheckGuess(guess, i, number);
        if(guessedCorrectly){
            return;
        }
        i++;

        startTries(i, guess);

    }
    
    public static void startGuessingGame(){

        int guess = 1 + (int)(10* Math.random());
        System.out.println();
 

        int i = 0;
        
        startTries(i, guess);

    }
    
    private static void startTries(int currentTryCount, int expected){
        for (int i = currentTryCount; i < maxTryCount; i++) {
            System.out.print("Guess the number: ");
            int number = HelperMethods.getNumber();
            boolean guessedCorrectly = tryCheckGuess(expected, i, number);
            if(guessedCorrectly){
                break;
            }
        }
    }

    private static boolean tryCheckGuess(int expected, int currentTryCount, int guess){

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
            int newValid = HelperMethods.getNumber();
            tryCheckGuess(expected, currentTryCount,newValid);
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
            
    public static boolean printChoice(Scanner input){
        
        while(true){

            System.out.print("\n\nWould you like to see another multiplication table? (y|n)");
            String choice = HelperMethods.getInput(input);
            
            if(choice == "y"){
                return true;
            }
            else if(choice == "n"){
                return false;
            }
        }
    }
}