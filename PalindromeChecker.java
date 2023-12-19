import java.util.Scanner;

public class PalindromeChecker {
    

    public static void run(Scanner seChoice){
        
        int i = 0;
        boolean restart = true ;
 
        while(restart){
            String word = getPalindrome(seChoice);
            isPalindrome(word);// in dieser methode soll ich die printPalindrome aufrufen
            if(i > 0){
                restart = printChoice(seChoice);
            }
            i++;
        }
    }


    public static String getPalindrome(seChoice){
        System.out.print("Which word would you like to check? : ");
        return HelperMethods.get/*methode*/();
    }


    public static boolean isPalindrome(String word) {
        word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

        char[] charArray = word.toCharArray();
        int length = charArray.length;

        for (int i = 0; i < length / 2; i++) {
            if (charArray[i] != charArray[length - i - 1]) {
                return false;
            }
        }
        return true;
    }


    public static void printPalindrome(String word) {

        boolean isPalindrome = isPalindrome(word);

        if (isPalindrome) {
            System.out.println(word + " This is a palindrome :)");
        } else {
            System.out.println(word + " This is not a palindrome :(");
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
