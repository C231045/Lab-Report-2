import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the number from user
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        
        // Validate input
        if (number < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers!");
        } else {
            long factorial = 1;
            
            // Calculate factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            
            // Display the result with step-by-step explanation
            System.out.print(number + "! = ");
            
            // Print the multiplication sequence
            for (int i = number; i >= 1; i--) {
                System.out.print(i);
                if (i > 1) {
                    System.out.print(" × ");
                }
            }
            
            System.out.println(" = " + factorial);
        }
        
        scanner.close();
    }
}
