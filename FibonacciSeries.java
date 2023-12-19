public class FibonacciSeries {

    public static void run(){
        int number = takeNumber();
        printFibonacci(number);
        runAgain(); 
    }

    private static int takeNumber(){ 
        
        System.out.print("\n\n\nPlease enter how long you want the Fibonacci series to be : ");
        int numberChecker = HelperMethods.getNumber();
        while (numberChecker < 1 || numberChecker > 93) {
            System.out.print("\nYour number was either too low (below 0) or too high (above 93) : ");
            numberChecker = HelperMethods.getNumber();
        }
        return numberChecker;
    }


    private static void printFibonacci(int number){

        System.out.println();
        long firstTerm = 0, secondTerm = 1; 
        System.out.println("Fibonacci Series till " + number + " terms: ");
        System.out.println();
        
        for (int i = 1; i <= number; i++){
            System.out.print(firstTerm);
            if (i <= number - 1){
                System.out.print(", ");
            }

            long nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();
        System.out.println();
    }


    private static void runAgain(){
        
        while(true){
            
            System.out.print("\n\nWould you like to see another Fibonacci Series? Enter a new number or enter something else to stop the program. : ");
            String choice = HelperMethods.getInput();
            try {
                int intValue = Integer.parseInt(choice);
                while (intValue < 1) {
                    System.out.print("Your number was to Low so Pleas only put in a number higher than 0 : ");
                    intValue = HelperMethods.getNumber();
                }
                printFibonacci(intValue);
                
            }
            catch (NumberFormatException e) {
                break;
            }
        }
    }
}