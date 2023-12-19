public class StringReversal {


    public static void run(){
        String word = getPalindrome();
        isPalindrome(word);
        printPalindrome(word);
        printChoice();
    }

    public static void printChoice(){
        
        while(true){

            System.out.print("\n\nWould you like to see another ? Enter a new number or enter something else to stop the program : ");
            String choice = HelperMethods.getInput();
            
            try { 
                int intValue = Integer.parseInt(choice); 
                (intValue);
            } 
            catch (NumberFormatException e) { 
                break;
            } 
        }
    }
}