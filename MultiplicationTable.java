import java.util.Scanner;
public class MultiplicationTable {


    public static void run(){
        int number = takeNumber();
        printTable(number);  
    }


    public static int takeNumber(){ 
        
        System.out.println();
        System.out.print("Which number would you like the multiplication Table for? : ");
        return HelperMethods.getNumber();
    }


    public static void printTable(int number){
        
        System.out.println();
        System.out.println("Here is your multiplication table for the number " + number );
        for(int i = 1; i <= 10; i++) {
            int answer = number * i;
            System.out.print(number + "x" + i + " = " +  answer + " | ");
        }
        System.out.println();
        System.out.println();
    }
}