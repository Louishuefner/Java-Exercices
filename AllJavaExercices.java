import java.util.Scanner;
public class AllJavaExercices {

    public static void main(String args[]) {
        
        boolean shouldLoop = true;

        while (shouldLoop){
            System.out.println();
            System.out.println();
            Scanner seChoice = new Scanner(System.in);
            System.out.println();
            System.out.print("Do You want To crate:\n\n--> MultiplicationsTable (enter 1) \n\n--> PrimeNumberChecker (enter 2) \n\n--> FibonacciSeries (enter 3) \n\n--> GuessNumberGame (enter 4)  \n\n--> Or type in 'q' to Quit \n \nPleas Enter here: ");
            boolean isNumber = seChoice.hasNextInt();
            
            if(!isNumber){
                String input = seChoice.nextLine();
                if(input.equalsIgnoreCase("q")){
                    shouldLoop = false;
                    break;
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
        }   
    }    
}