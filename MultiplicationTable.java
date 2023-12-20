import java.util.Scanner;

public class MultiplicationTable {


    public static void run(Scanner seChoice){
        
        boolean restart = true ;
 
        while(restart){
            int number = takeNumber(seChoice);
            printTable(number);
            restart = HelperMethods.getRestart(seChoice, "Multiplication Table");
        }
    }


    public static int takeNumber(Scanner louis){ 
        
        System.out.print("\n\n\nWhich number would you like the multiplication Table for? : ");
        return HelperMethods.getNumber(louis);
    }


    public static void printTable(int number){
        
        System.out.println("\nHere is your multiplication table for the number " + number );
        for(int i = 1; i <= 10; i++) {
            int answer = number * i;
            
            System.out.print(number + "x" + i + " = " +  answer);
            if (i <= 9){
                System.out.print(" | ");
            }
        }
        System.out.println();
        System.out.println();
    }
}