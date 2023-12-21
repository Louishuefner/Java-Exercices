import java.util.Scanner;

public class ArraySorting {
    

    public static void run(Scanner seChoice){
        
        boolean restart = true ;
        while(restart){
            int number = amountOfElements(seChoice);
            int numberOfArrays = number;
            int[] intArray =takeNumbers(seChoice, numberOfArrays);
            output(intArray);
            restart = HelperMethods.getRestart(seChoice, "Array Sorting");
        }
    }


    public static int amountOfElements(Scanner numberOfArrays){ 
        
        System.out.print("\n\n\nEnter the amount of elements in the array : ");
        return HelperMethods.getNumber(numberOfArrays);
    }

    
    public static int[] takeNumbers(Scanner arrays, int numberOfArrays){

        System.out.print("Enter Elements : ");
        String numbers = HelperMethods.forNumbers(arrays);
        String[] numberArray = numbers.split(",");
        int[] intArray = new int[numberArray.length];
        for(int i = 0;i < numberArray.length;i++){
            intArray[i] = Integer.parseInt(numberArray[i]);
        }

        while(true){
            for(int i = 0; i < intArray.length - 1; i++){
                while(intArray[i] > intArray[i + 1]){
                    int temp = intArray[i];
                    intArray[i] = intArray[i+1];
                    intArray[i+1] = temp;
                }
                if(intArray[i] < intArray[i + 1]) {
                    break;
                }
             
            }
            System.out.println("array is " + intArray);
            
        }
        return intArray;
    }


    public static void output(int[] intArray){
        
        System.out.print("Sorted Array : ");
        for (int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + ", ");
        }      
    }
}