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
            if(inputNumber <= 0) {
                System.out.print("\nYour number was to Low so Pleas only put in a number higher than 0 : ");
            }
            else{
                int checkedNumber = inputNumber;
                boolean checker = false;
                for (int i = 2; i <= checkedNumber / 2; ++i) {
                    if ( checkedNumber % i == 0) {
                        checker = true;
                        break;
                    }
                }
                if (!checker){
                    System.out.println("\n" + checkedNumber + " is a prime number.\n");
                }
                else {
                    System.out.println("\n" + checkedNumber + " is not a prime number, i can be divided by more than just 1 and itself.\n");
                }
                again = false;
            }
        }   
    }
}