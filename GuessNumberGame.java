import java.util.Scanner;
public class GuessNumberGame {


    public static void run(){
        System.out.println();
        System.out.println();
        System.out.println("A number is chosen between 1 to 10, Guess the number within 5 trials.");
        System.out.println();
        System.out.println();
        printGuess();
        printChoice(); 
    }


    public static void printGuess(){
        
        int guess = 1 + (int)(10* Math.random());
        System.out.println();
 
        int K = 5;
        int i;
        int number = 0;
 
        for (i = 0; i < K; i++) {
        
            System.out.print("Guess the number: ");
            
            number = HelperMethods.getNumber();
            if (number < 10 && number > 1){
                if (guess == number) {
                    System.out.println();
                    System.out.println("Congratulations! You guessed the number.");
                    System.out.println();
                    break;
                }
                else if (guess > number && i != K - 1) {
                    System.out.println();
                    System.out.println("The number is greater than " + number);
                    System.out.println();
                }
                else if (guess < number && i != K - 1) {
                    System.out.println();
                    System.out.println("The number is less than " + number);
                    System.out.println();
                }
                
            if (i == K) {
                System.out.println();
                System.out.println("You have exhausted " + K + "trials.");
                System.out.println("The number was " + number);
            }
            }
            else{
                
                System.out.println(" Your number was etheir to High or to Low so Pleas only put in a number between 1 and 10");
                HelperMethods.getNumber();
            }
        }

    }

            

    public static void printChoice(){
        
        while(true){
            System.out.println();
            System.out.println();
            System.out.print("Do you want to check another Guess? Enter a new number or enter something else to stop the program : ");
            String choice = HelperMethods.getInput();
            try {
                int intValue = Integer.parseInt(choice);
                printGuess();
            }
            catch (NumberFormatException e) {
                break;
            }
        }
    }
}