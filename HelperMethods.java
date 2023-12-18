import java.util.Scanner;
public class HelperMethods{


    public static int getNumber(){
        
        Scanner scNumber = new Scanner(System.in);  
        int number;
            
        while(!scNumber.hasNextInt()){
            System.out.println();
            System.out.print("That is not a valid number. Please enter a valid number :");
            scNumber.next();
        } 
        number = scNumber.nextInt();
        
        return number;
    }

    public static String getInput(){

        Scanner seChoice = new Scanner(System.in);
            
        return seChoice.next();
    }
}