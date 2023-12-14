import java.util.Scanner;
public class MultiplicationTable {


    public static void run(){
        
        int number = takeNumber();
        printTable(number);
        printChoice();
    }


    public static int takeNumber(){ 
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print("Which number would you like the multiplication Table for? : ");
        return HelperMethods.getNumber();
    }


    public static void printTable(int number){
        
        System.out.println();
        System.out.println("Here is your multiplication table for the number " + number );
        for(int i = 1; i <= 10; i++) {
            int answer = number * i;
            
            System.out.print(number + "x" + i + " = " +  answer + " | ");
        }
        System.out.println();
        System.out.println();
    }


    public static void printChoice(){
        
        while(true){
            System.out.println();
            System.out.println();
            System.out.print("Would you like to see another multiplication table? Enter a new number or enter something else to stop the program : ");
            String choice = HelperMethods.getInput();
            
            try { 
                int intValue = Integer.parseInt(choice); 
                printTable(intValue);
            } 
            catch (NumberFormatException e) { 
                break;
            } 
        }
    }
}