import java.util.Scanner;

public class StringReversal {


    public static void run(Scanner seChoice){
        
        boolean restart = true ;
        while(restart){
            printStringReversal(getReversal(seChoice));
            restart = HelperMethods.getRestart(seChoice, "String Reversal");
        }
    }


    public static String getReversal(Scanner getInput){
        System.out.print("\n\nWhich String would you like to revers? : ");
        return HelperMethods.getWord(getInput);
    }


    public static void printStringReversal(String wordReversal){
        
        String reverse = "";
 
        for(int i = wordReversal.length() - 1; i >= 0; i--)
        {
        reverse = reverse + wordReversal.charAt(i);
        }
        
        System.out.print("\nReversed string is : " + reverse + "\n");
    }
}