import java.util.Scanner;
public class FibonacciSeries {


    public static void run(){

        int number = takeNumber();
        printFibonacci(number);
        printChoice(); 
    }


    public static int takeNumber(){ 
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print("Please enter how long you want the Fibonacci series to be : ");
        int numberChecker = HelperMethods.getNumber();
        while (numberChecker < 1) {
            System.out.print(" Your number was etheir to High or to Low so Pleas only put in a number between 1 and 10 : ");
            numberChecker = HelperMethods.getNumber();
        }
        return numberChecker;
    }


    public static void printFibonacci(int number){

        System.out.println();
        int firstTerm = 0, secondTerm = 1; 
        System.out.println("Fibonacci Series till " + number + " terms:");
        System.out.println();
        
        for (int i = 1; i <= number; i++){
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();
        System.out.println();
    }


    public static void printChoice(){
        
        while(true){
            System.out.println();
            System.out.println();
            System.out.print("Do you want to check another Series? Enter a new number or enter something else to stop the program : ");
            String choice = HelperMethods.getInput();
            try {
                int intValue = Integer.parseInt(choice);
                while (intValue < 1) {
                    System.out.print(" Your number was etheir to High or to Low so Pleas only put in a number between 1 and 10");
                    intValue = HelperMethods.getNumber();
                }
                printFibonacci(intValue);
                
            }
            catch (NumberFormatException e) {
                break;
            }
        }
    }
}