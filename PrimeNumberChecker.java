import java.util.Scanner;
public class PrimeNumberChecker {


    public static void run(){
        boolean mainChoice = true;

            while (mainChoice) {
                int number = getNumber();
                printPrime(number);
            }
     }


    public static int getNumber(){ 

        Scanner scNumber = new Scanner(System.in);  
        int number;
        
        
        do{
            System.out.println();

            System.out.print("Which number would you like the multiplication Table for? : ");
            
            while(!scNumber.hasNextInt()){
                System.out.println("That is not a Valid Number");
                scNumber.next();
            } 

            number = scNumber.nextInt();
        }

        while (number <= 1);
        
        return number;
    }


    public static void printPrime(int number){

        if(number/)
    }
}