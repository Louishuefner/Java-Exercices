import java.util.Scanner;

public class FibonacciSeries {

    public static void run(Scanner seChoice){
        
        
        boolean restart = true ;
 
        while(restart){
            int number = takeNumber(seChoice);
            printFibonacci(number);
            restart = HelperMethods.getRestart(seChoice, "Fibonacci Series");
        }
    }

    private static int takeNumber(Scanner louis){ 
        

        System.out.print("\n\n\nPlease enter how long you want the Fibonacci series to be : ");
        while(true){
            int input = HelperMethods.getNumber(louis);
            if(input < 1 || input > 93) {
                System.out.print("\nYour number was either too low (below 0) or too high (above 93) : ");
            }
            else{
                return input;
            }
        }
    }


    private static void printFibonacci(int number){

        System.out.println();
        long firstTerm = 0, secondTerm = 1; 
        System.out.println("Fibonacci Series till " + number + " terms: ");
        System.out.println();
        
        for (int i = 1; i <= number; i++){
            System.out.print(firstTerm);
            if (i <= number - 1){
                System.out.print(", ");
            }

            long nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();
        System.out.println();
    }
}