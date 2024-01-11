
import java.util.Scanner;

public class ArrayManipulation {


    public static void run (Scanner scChoice){
        
        boolean restart = true ;
        while (restart){
            
            takeNumbers(scChoice);
            restart = HelperMethods.getRestart(scChoice, "Array Manipulation");
        }
    }


    public static int[] takeNumbers (Scanner scChoice) {

        System.out.print("\n\n\nEnter the elements of the array with ',' in between : ");
        String input = scChoice.next();
        String[] numberArray = input.split(",");
        int[] intArray = new int[numberArray.length];
        for (int i = 0; i < numberArray.length; i++) {
            intArray[i] = Integer.parseInt(numberArray[i]);
        }
        
        int sum = 0;
        for (int num : intArray) {
            sum += num;
        }
        System.out.print("\n\n\nSum of elements: " + sum);

        double average = (double) sum / intArray.length;
        System.out.printf("\n\nAverage of elements: %.2f", average);

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
        System.out.print("\n\nMaximum value: " + max);
        System.out.print("\n\nMinimum value: " + min);

        return intArray;
    }
}