
import java.util.Scanner;

public class ArrayManipulation {


    public static void run(Scanner seChoice){
        
        boolean restart = true ;
        while(restart){
            
            takeNumbers(seChoice);
            restart = HelperMethods.getRestart(seChoice, "Array Manipulation");
        }
    }


    public static int[] takeNumbers(Scanner arrays){

        System.out.print("\n\n\nEnter the elements of the array with ',' in between : ");
        String input = HelperMethods.forNumbers(arrays);
        String[] numberArray = input.split(",");
        int[] intArray = new int[numberArray.length];
        for(int i = 0; i < numberArray.length; i++){
            intArray[i] = Integer.parseInt(numberArray[i]);
        }
        
        int sum = 0;
        for (int num : intArray) {
            sum += num;
        }
        System.out.println("\n\nSum of elements: " + sum);

        double average = (double) sum / intArray.length;
        System.out.println("\nAverage of elements: " + average);

        int max = intArray[0];
        int min = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
            if (intArray[i] < min) {
                min = intArray[i];
            }
        }
        System.out.println("\nMaximum value: " + max);
        System.out.println("\nMinimum value: " + min);

        return intArray;
    }
}