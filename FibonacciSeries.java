import java.util.Scanner;

public class FibonacciSeries {


    public static void run(Scanner seChoice){
        
        boolean restart = true ;
 
        while(restart){
            printFibonacci(seChoice);
            restart = HelperMethods.getRestart(seChoice, "Fibonacci Series");
        }
    }


    private static void printFibonacci(Scanner inputScanner){

        int inputNumber = HelperMethods.takeGetNumber(inputScanner, "Fibonacci Series");
        while(true){
            if(inputNumber < 1 || inputNumber > 93) {
                System.out.print("\nYour number was either too low (below 0) or too high (above 93) : ");
            }
            else{
                long firstTerm = 0, secondTerm = 1; 
                System.out.println("\nFibonacci Series till " + inputNumber + " terms: \n");
                
                
                for (int i = 1; i <= inputNumber; i++){
                    System.out.print(firstTerm);
                    if (i <= inputNumber - 1){
                        System.out.print(", ");
                    }

                    long nextTerm = firstTerm + secondTerm;
                    firstTerm = secondTerm;
                    secondTerm = nextTerm;
                }
                System.out.println("\n");
            }
        }
    }
}