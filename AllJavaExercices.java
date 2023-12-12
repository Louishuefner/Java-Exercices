import java.util.Scanner;
public class AllJavaExercices {

    public static void main(String args[]) {
        
        boolean shouldLoop = true;

        while (shouldLoop){
            Scanner seChoice = new Scanner(System.in);
            System.out.println();
            System.out.print("Do You want To crate a MultiplicationsTable (enter 1) :");
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

                default:
                    break;
                }
            }
        }   
    }    
}