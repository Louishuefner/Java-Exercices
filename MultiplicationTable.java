import java.util.Scanner;

public class MultiplicationTable {


    public static void run(Scanner seChoice){
        
        boolean restart = true ;
 
        while(restart){
            printTable(seChoice);
            restart = HelperMethods.getRestart(seChoice, "Multiplication Table");
        }
    }


    public static void printTable(Scanner inputScanner){
        
        int inputNumber = HelperMethods.takeGetNumber(inputScanner, "Multiplication Table");
        System.out.println("\nHere is your multiplication table for the number " + inputNumber );
        for(int i = 1; i <= 10; i++) {
            int answer = inputNumber * i;
            
            System.out.print(inputNumber + "x" + i + " = " +  answer);
            if (i <= 9){
                System.out.print(" | ");
            }
        }
        System.out.println("\n");
    }
}