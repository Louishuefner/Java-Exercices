import java.util.Scanner;

public class StringReversal {


    public static void run(Scanner seChoice){
        
        boolean restart = true ;
 
        while(restart){
            String word = getReversal(seChoice);
            printStringReversal(word);
            restart = HelperMethods.getRestart(seChoice, "String Reversal");
        }
    }


    public static String getReversal(Scanner getInput){
        System.out.print("\n\nWhich String would you like to revers? : ");
        return HelperMethods.getWord(getInput);
    }


    public static void printStringReversal(String word){
        
        String reverse = " "; //reminder: du muss mit regex arbeiten
 
        for(int i = word.length() - 1; i >= 0; i--)
        {
        reverse = reverse + word.charAt(i);
        }
        
        System.out.print("\nReversed string is : " + reverse + "\n");
    }
}