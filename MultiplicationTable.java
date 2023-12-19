import java.util.Scanner;

public class MultiplicationTable {


    public static void run(Scanner seChoice){
        
        int i = 0;
        boolean restart = true ;
 
        while(restart){
            int number = takeNumber(seChoice);
            printTable(number);
            if(i > 0){
                restart = printChoice(seChoice);
            }
            i++;
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