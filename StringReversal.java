import java.util.Scanner;

public class StringReversal {


    public static void run(Scanner seChoice){
        
        int i = 0;
        boolean restart = true ;
 
        while(restart){
            String word = get/*methode*/(seChoice);
            /*methode*/(word);
            if(i > 0){
                restart = printChoice(seChoice);
            }
            i++;
        }
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