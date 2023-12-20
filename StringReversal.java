import java.util.Scanner;

public class StringReversal {


    public static void run(Scanner seChoice){
        
        boolean restart = true ;
 
        while(restart){
            String word = get/*methode*/(seChoice);
            /*methode*/(word);
            restart = HelperMethods.getRestart(seChoice, "String Reversal");
        }
    }
}