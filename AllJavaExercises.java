import java.util.Scanner;
public class AllJavaExercises {

    public static void main(String args[]) {
        boolean shouldLoop = true;
        Scanner seChoice = new Scanner(System.in);
        while (shouldLoop){
            shouldLoop = renderMenu(seChoice);
        }   
    }    

    private static boolean renderMenu(Scanner seChoice){
        String output = "\n\n\nEnter the number to select an option:"
                + "\n\n1.Multiplications Table"
                + "\n\n2.PrimeNumber Checker"
                + "\n\n3.Fibonacci Series" 
                + "\n\n4.Guess NumberGame"
                + "\n\n5.Palindrome Checker"
                + "\n\n6.String Reversal"
                + "\n\n7.Array Sorting"
                + "\n\n8.Array Manipulation" 
                + "\n\n[q]uit" 
                + "\n\nINPUT: a number to select option or 'q' to exit the program : ";
        System.out.print(output);
        boolean isNumber = seChoice.hasNextInt();
        if(!isNumber){
            String input = seChoice.nextLine();
            if(input.equalsIgnoreCase("q")){
                return false;
            }
        }
        else{
            int choice = seChoice.nextInt();
            switch (choice) {
                case 1:
                    MultiplicationTable.run();
                    break;
                case 2:
                    PrimeNumberChecker.run();
                    break;
                case 3:
                    FibonacciSeries.run();
                    break;
                case 4:
                    GuessNumberGame.run();
                    break;
                case 5:
                    PalindromeChecker.run();
                    break;
                case 6:
                    StringReversal.run();
                    break;
                case 7:
                    ArraySorting.run();
                    break;
                case 8:
                    ArrayManipulation.run();
                    break;
                default:
                    break;
            }
        }
        return true;
    }
}