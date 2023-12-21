import java.util.Scanner;

public class ArraySorting {
    

    public static void run(Scanner seChoice){
        
        boolean restart = true ;
        while(restart){
            int number = amountOfElements(seChoice);
            int numberOfArrays = number;
            int[] intArray =takeNumbers(seChoice, numberOfArrays);
            output(intArray, number);
            restart = HelperMethods.getRestart(seChoice, "Array Sorting");
        }
    }


    public static int amountOfElements(Scanner numberOfArrays){ 
        
        System.out.print("\n\n\nEnter the amount of elements in the array : ");
        return HelperMethods.getNumber(numberOfArrays);
    }

    
    public static int[] takeNumbers(Scanner arrays, int numberOfArrays){
        int j, temp;

        System.out.print("Enter Elements : ");
        String numbers = HelperMethods.forNumbers(arrays);
        String[] numberArray = numbers.split(" ");
        int[] intArray = new int[numberArray.length];
        for(int i = 0;i < numberArray.length;i++){
   
            intArray[i] = Integer.parseInt(numberArray[i]);
            
            for (i = 0; i < ( numberOfArrays - 1 ); i++) {
                for (j = 0; j < numberOfArrays - i - 1; j++) {
                  if (intArray[j] < intArray[j+1]) 
                  {
                    temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                  }
                }
              }
        }
        return intArray;
    }


    public static void output(int[] intArray, int number){
        int i;
        System.out.print("Sorted Array : ");
        for (i = 0; i < number; i++) 
            System.out.print(intArray);
    }
}