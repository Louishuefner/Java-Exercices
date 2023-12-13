import java.util.Scanner;
public class HelperMethods{


    public static int getNumber(){
        Scanner scNumber = new Scanner(System.in);  
        int number;
            
        while(!scNumber.hasNextInt()){
            System.out.println("That is not a Valid Number");
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