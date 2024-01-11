import java.util.Scanner;
public class AllJavaExercises {

    public static void main(String args[]) {
        boolean runRenderMenu = true;
        Scanner scChoice = new Scanner(System.in);
        while (runRenderMenu) {
            runRenderMenu = renderMenu(scChoice);
        }
    }

    private static boolean renderMenu(Scanner scChoice) {
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

        String input = scChoice.next();
        if (input.equalsIgnoreCase("q")) {
            return false;
        } 
        else if (!input.matches("[1-8]+")) {
            System.out.println("\n'" + input + "' is not a valid input");
        } 
        else {
            int choice = Integer.parseInt(input);
            if (choice < 1 || choice > 8) {
                System.out.println("\n'" + choice + "' is not a valid input");
            } 
            else { 
                switch (choice) {
                    case 1:
                        MultiplicationTable.run(scChoice);
                        break;
                    case 2:
                        PrimeNumberChecker.run(scChoice);
                        break;
                    case 3:
                        FibonacciSeries.run(scChoice);
                        break;
                    case 4:
                        GuessNumberGame.run(scChoice);
                        break;
                    case 5:
                        PalindromeChecker.run(scChoice);
                        break;
                    case 6:
                        StringReversal.run(scChoice);
                        break;
                    case 7:
                        ArraySorting.run(scChoice);
                        break;
                    case 8:
                        ArrayManipulation.run(scChoice);
                        break;
                    default:
                        break;
                }
            }
        }
        return true;
    }
}