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
                + "\n\n1.MultiplicationsTable"
                + "\n\n2.PrimeNumberChecker"
                + "\n\n3.FibonacciSeries" 
                + "\n\n4.GuessNumberGame \n\n[q]uit \n \nINPUT: a number to select option or 'q' to exit the program : ";
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
                default:
                    break;
            }
        }
        return true;
    }
}