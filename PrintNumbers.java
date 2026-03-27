import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get N from user
        System.out.print("Enter a number N: ");
        int n = scanner.nextInt();
        
        // Validate input
        if (n < 1) {
            System.out.println("Please enter a number greater than or equal to 1");
        } else {
            System.out.println("Numbers from 1 to " + n + ":");
            
            // Print numbers using for loop
            for (int i = 1; i <= n; i++) {
                System.out.print(i);
                
                // Add comma for formatting, except for the last number
                if (i < n) {
                    System.out.print(", ");
                }
            }
            System.out.println(); // Print new line at the end
        }
        
        scanner.close();
    }
}
