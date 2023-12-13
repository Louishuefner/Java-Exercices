import java.util.Scanner;
public class PrimeNumberChecker {


    public static void run(){
        int number = takeNumber();
        printPrime(number);  
    }


    public static int takeNumber(){ 
        
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
        }
        else {
            System.out.println();
            System.out.println("--> " + number + " is not a prime number.");
        }
    }
}