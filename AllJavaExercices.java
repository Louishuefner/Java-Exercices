import java.util.Scanner;
public class AllJavaExercices {

    public static void main(String args[]) {
        boolean choice1;
        do {
            
            Scanner seChoice = new Scanner(System.in);
            System.out.println();
            System.out.print("Do You want To crate a MultiplicationsTable (enter 1) :");
            int input = seChoice.nextInt();
            int choice = input;

            switch (choice) {
                case 1:
                MultiplicationTable.run();
                    break;
                default:
                    break;
            }
             
            System.out.print("Do you want to crate a new Exercices (y|n) :"); 
            String input1 = seChoice.next();
            choice1 = input1.equalsIgnoreCase("y");

        } while (choice1);
    }   
     
}