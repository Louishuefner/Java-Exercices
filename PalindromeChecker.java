import java.util.Scanner;

public class PalindromeChecker {
    

    public static void run(Scanner seChoice){
        
        boolean restart = true ;
        while(restart){
            printPalindrome(getPalindrome(seChoice));
            restart = HelperMethods.getRestart(seChoice, "Palindrome Checker");
        }
    }


    public static String getPalindrome(Scanner wordInput){
        System.out.print("\n\nWhich word would you like to check? : ");
        return HelperMethods.getWord(wordInput);
    }


    public static boolean isPalindrome(String wordCheck) {
        wordCheck = wordCheck.replaceAll("[^a-zA-Z]", "").toLowerCase();

        char[] charArray = wordCheck.toCharArray();
        int length = charArray.length;

        for (int i = 0; i < length / 2; i++) {
            if (charArray[i] != charArray[length - i - 1]) {
                return false;
            }
        }
        return true;
    }


    public static void printPalindrome(String wordInput) {

        boolean isPalindrome = isPalindrome(wordInput);

        if (isPalindrome) {
            System.out.println("\n" + wordInput + " is a palindrome :)\n");
        } 
        else {
            System.out.println("\n" + wordInput + " is not a palindrome :(\n");
        }
    }
}