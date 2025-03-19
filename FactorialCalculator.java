import java.util.Scanner;

public class FactorialCalculator {

        public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number;
        
 System.out.print("Enter a non-negative integer: ");
        
 while (!scanner.hasNextInt()) {
System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next();             System.out.print("Enter a non-negative integer: ");
        }
        
        number = scanner.nextInt();
        
                while (number < 0) {
            System.out.println("Please enter a non-negative integer.");
            System.out.print("Enter a non-negative integer: ");
            
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // consume the invalid input
            }
            number = scanner.nextInt();
        }
        
        return number;
    }

       public static long calculateFactorial(int n) {
        long factorial = 1;
        
               if (n == 0) {
            return 1;
        }
               for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        return factorial;
    }

    public static void main(String[] args) {
        int userInput = getNonNegativeInteger(); 
        long result = calculateFactorial(userInput);
        
 System.out.println("The factorial of " + userInput + " is: " + result);
    }
}
