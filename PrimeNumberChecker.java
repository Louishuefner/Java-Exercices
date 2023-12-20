import java.util.Scanner;

public class PrimeNumberChecker {


    public static void run(Scanner seChoice){
        
        boolean restart = true ;
 
        while(restart){
            int number = takeNumber(seChoice);
            printPrime(number);
            restart = HelperMethods.getRestart(seChoice, "Prime Number Checker");
            
        }
    }


    public static int takeNumber(Scanner louis){ 

        System.out.print("\n\n\nWhich number do you want to check? (under 1 Mio) : ");
        while(true){
            int input = HelperMethods.getNumber(louis);
            if(input <= 0) {
                System.out.print("\nYour number was to Low so Pleas only put in a number higher than 0 : ");
            }
            else{
                return input;
            }
        }
    }



    public static void printPrime(int number){

        boolean checker = false;
        for (int i = 2; i <= number / 2; ++i) {
            if ( number % i == 0) {
                checker = true;
                break;
            }
        }
        if (!checker){
            System.out.println("\n--> " + number + " is a prime number.");
            System.out.println();
        }
        else {
            System.out.println("\n--> " + number + " is not a prime number, i can be divided by more than just 1 and itself.");
            System.out.println();
        }
    }
}