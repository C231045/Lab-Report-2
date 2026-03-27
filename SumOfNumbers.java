import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number N: ");
        int n = scanner.nextInt();
        
        // Method 1: Using formula (most efficient)
        int sumFormula = n * (n + 1) / 2;
        System.out.println("Sum using formula: " + sumFormula);
        
        // Method 2: Using loop
        int sumLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumLoop += i;
        }
        System.out.println("Sum using loop: " + sumLoop);
        
        scanner.close();
    }
}
