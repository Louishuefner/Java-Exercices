import java.util.Scanner;
public class ArraySorting {

    public static void printChoice(){
        
        while(true){

            System.out.print("\n\nWould you like to see another multiplication table? Enter a new number or enter something else to stop the program : ");
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