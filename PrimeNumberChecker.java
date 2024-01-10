import java.util.Scanner;

public class PrimeNumberChecker {


    public static void run(Scanner seChoice){
        
        boolean restart = true ;
 
        while(restart){
            printPrime(seChoice);
            restart = HelperMethods.getRestart(seChoice, "Prime Number Checker");  
        }
    }


    public static void printPrime(Scanner inputScanner){

        int inputNumber = HelperMethods.takeGetNumber(inputScanner, "Prime Number Checker");
        boolean again = true;
        while(again){
            if(inputNumber <= 0 || inputNumber > 2147483647) {
                if (inputNumber <= 0) {
                    System.out.print("\nYour number was too low. Please enter a number higher than 0: ");
                } else {
                    System.out.print("\nYour number is too large. Please enter a number smaller than or equal to 2147483647: ");
                }
                inputNumber = HelperMethods.takeGetPositiveNumber(inputScanner, "Prime Number Checker");
            } else {
                int checkedNumber = inputNumber;
                boolean checker = false;
                StringBuilder divisibleBy = new StringBuilder();

                for (int i = 2; i <= 10; ++i) {
                    if (checkedNumber % i == 0) {
                        checker = true;
                        divisibleBy.append(i).append(", ");
                    }
                }

                if (!checker){
                    System.out.println("\n" + checkedNumber + " is a prime number.\n");
                } else {
                    System.out.println("\n" + checkedNumber + " is not a prime number, It can be divided by: " + divisibleBy.substring(0, divisibleBy.length() - 2) + ".\n");
                }
                again = false;
            }
        }
    }
}