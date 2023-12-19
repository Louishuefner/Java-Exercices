import java.util.Scanner;
public class PalindromeChecker {
    

    public static void run(){
        String word = getPalindrome();
        isPalindrome(word);
        printPalindrome(word);
        printChoice();
    }


    public static String getPalindrome(){
        System.out.print("Which word would you like to check? : ");
        return HelperMethods.getInput();
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


    public static void printChoice(){
        
        while(true){

            System.out.print("\n\nWould you like to see another Palindrome Checker? Enter a new word or enter a number to stop the program : ");
            String newWord = HelperMethods.getInput();
            isPalindrome(newWord);
        }
    }
}
