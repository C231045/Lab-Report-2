import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get first number from user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        // Get second number from user
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        // Get operation from user
        System.out.print("Enter operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        
        double result;
        
        // Perform calculation using switch statement
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
                
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
                
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
                
            case '/':
                // Check for division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
                break;
                
            default:
                System.out.println("Error: Invalid operation! Please use +, -, *, or /");
        }
        
        scanner.close();
    }
}
