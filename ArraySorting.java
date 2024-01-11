import java.util.Scanner;

public class ArraySorting {
    

    public static void run(Scanner seChoice){
        
        boolean restart = true ;
        while(restart){
            int[] intArray = takeNumbers(seChoice);
            output(intArray);
            restart = HelperMethods.getRestart(seChoice, "Array Sorting");
        }
    }

    
    public static int[] takeNumbers(Scanner arrays) {

        System.out.print("\n\nEnter Elements with a ',' in between: ");
        String numbers = HelperMethods.forNumbers(arrays);
        String[] numberArray = numbers.split(",");
        int[] intArray = new int[numberArray.length];
        for (int i = 0; i < numberArray.length; i++) {
            intArray[i] = Integer.parseInt(numberArray[i]);
        }

        if (!isSorted(intArray)) {
            for (int l = 0; l < intArray.length; l++) {
                for (int i = 0; i < intArray.length - 1; i++) {
                    while (intArray[i] > intArray[i + 1]) {
                        int temp = intArray[i];
                        intArray[i] = intArray[i + 1];
                        intArray[i + 1] = temp;
                    }
                }
            }
        }
        return intArray;
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void output(int[] intArray) {

        System.out.print("\nSorted Array : ");
        for (int i = 0; i < intArray.length - 1; i++) {
            System.out.print(intArray[i] + ", ");
        }
        System.out.print(intArray[intArray.length - 1] + "\n");
    }
}