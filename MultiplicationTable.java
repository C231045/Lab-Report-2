import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the number from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Get the range (optional - how many multiples to display)
        System.out.print("Enter the range (how many multiples): ");
        int range = scanner.nextInt();
        
        System.out.println("\nMultiplication Table of " + number + ":");
        System.out.println("================================");
        
        // Print multiplication table
        for (int i = 1; i <= range; i++) {
            int result = number * i;
            System.out.println(number + " × " + i + " = " + result);
        }
        
        scanner.close();
    }
}
