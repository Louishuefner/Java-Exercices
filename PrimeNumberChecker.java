import java.util.Scanner;
public class PrimeNumberChecker {


    public static void run(){

        int number = takeNumber();
        printPrime(number);
        printChoice(); 
    }


    public static int takeNumber(){ 
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print("Which number do you want to check? : ");
        int numberChecker = HelperMethods.getNumber();
        System.out.println();
        while (numberChecker < 1) {
            System.out.print(" Your number was etheir to High or to Low so Pleas only put in a number between 1 and 10 : ");
            numberChecker = HelperMethods.getNumber();
        }
        return numberChecker;
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
            System.out.println();
            System.out.println("--> " + number + " is a prime number.");
            System.out.println();
        }
        else {
            System.out.println();
            System.out.println("--> " + number + " is not a prime number, i can be devided by more than just 1 and itself.");
            System.out.println();
        }
    }


    public static void printChoice(){
        
        while(true){
            System.out.println();
            System.out.println();
            System.out.print("Do you want to check another number? Enter a new number or enter something else to stop the program : ");
            String choice = HelperMethods.getInput();
            System.out.println();
            try {
                int intValue = Integer.parseInt(choice);
                while (intValue < 1) {
                    System.out.print(" Your number was etheir to High or to Low so Pleas only put in a number between 1 and 10");
                    intValue = HelperMethods.getNumber();
                    System.out.println();
                }
                printPrime(intValue);
                
            }
            catch (NumberFormatException e) {
                break;
            }
        }
    }
}