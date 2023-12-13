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
        return HelperMethods.getNumber();
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
            System.out.println("--> " + number + " is not a prime number.");
            System.out.println();
        }
    }


    public static void printChoice(){
        while(true){
            System.out.println();
            System.out.println();
            System.out.print("Do you want to check another number? Enter a new number or enter something else to stop the program : ");
            String choice = HelperMethods.getInput();
            try {
                int intValue = Integer.parseInt(choice);
                printPrime(intValue);
            }
            catch (NumberFormatException e) {
                break;
            }
        }

    }
}