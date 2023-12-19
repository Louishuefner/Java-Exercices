import java.util.Scanner;

public class PrimeNumberChecker {


    public static void run(Scanner seChoice){
        
        int i = 0;
        boolean restart = true ;
 
        while(restart){
            int number = takeNumber(seChoice);
            printPrime(number);
            if(i > 0){
                restart = printChoice(seChoice);
            }
            i++;
        }
    }


    public static int takeNumber(Scanner louis){ 

        System.out.print("\n\n\nWhich number do you want to check? (under 1 Mio) : ");
        /*int louis = HelperMethods.getNumber(louis);
        System.out.println();
        while (louis < 1) {
            System.out.print("Your number was to Low so Pleas only put in a number higher than 0 : ");
            louis = HelperMethods.getNumber(louis);
        }*/
        return HelperMethods.getNumber(louis);
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