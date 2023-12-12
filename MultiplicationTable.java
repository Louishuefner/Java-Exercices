import java.util.Scanner;
public class MultiplicationTable {

    
    public static void main(String args[]){
        
        run();
    }

    public static void run(){
        boolean mainChoice = true;

            while (mainChoice) {
                int number = getNumber();
                printTable(number);
                mainChoice = getUserChoice();
            }
     }

    public static boolean getUserChoice(){
        
        Scanner scChoice = new Scanner(System.in);  
        System.out.print("Would you like to see another multiplication table? (enter y|n):"); 
        String input = scChoice.nextLine();
        boolean choice = input.equalsIgnoreCase("y");
        
        if(choice){
            return true;
        }
        else if(input.equalsIgnoreCase("n")){
            return false;
        }
        return getUserChoice(); 
    }


    public static int getNumber(){ 

        Scanner scNumber = new Scanner(System.in);  
        int number;
        
        
        do{
            System.out.println();

            System.out.print("Which number would you like the multiplication Table for? : ");
            
            while(!scNumber.hasNextInt()){
                System.out.println("That is not a Valid Number");
                scNumber.next();
            } 

            number = scNumber.nextInt();
        }

        while (number <= 1);
        
        return number;
    }

    public static void printTable(int number){
        
        System.out.println();

        System.out.println("Here is your multiplication table for the number " + number );

        for(int i = 1; i <= 10; i++) {
            int ans = number * i;
            System.out.print(number + "x" + i + " = " +  ans + " | ");
        }
        System.out.println();
        System.out.println();
    }
}