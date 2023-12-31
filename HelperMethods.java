import java.util.Scanner;
public class HelperMethods{


    public static int getNumber(Scanner scNumber){
        
        int number;
        while(!scNumber.hasNextInt()){
            System.out.print("\nThat is not a valid number. Please enter a valid number : ");
            scNumber.next();
        } 
        number = scNumber.nextInt();
        
        return number;
    }


    public static String getWord(Scanner scWord){
            
        while(scWord.hasNextInt()){
            System.out.print("\nThat is not a valid word. Please enter a valid word : ");
            scWord.next();
        }
        scWord.nextLine();
        String input = scWord.nextLine();
        
        return input;
    }
    

    public static String getInput(Scanner seChoice){
        
        return seChoice.next();
    }


    public static String forNumbers(Scanner seChoice){

        return seChoice.next();
    }


    public static boolean getRestart(Scanner seChoice, String name ){
        
        System.out.print("\n\nWould you like to see another " + name + " enter 'y', to stop the program enter something else : ");
        String choice = getInput(seChoice);
        Boolean restart = false;
    
        if(choice.equalsIgnoreCase("y")) {  
            restart = true;
        }
        return restart;
    }
    

    public static int takeGetNumber (Scanner scNumber, String name){
        
        System.out.print("\n\n\nEnter a Number for the " + name + " : ");
        int number = getNumber(scNumber);
        return number;
    }
}