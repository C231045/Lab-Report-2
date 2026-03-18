import java.util.Scanner;

public class SimpleUniqueFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter three numbers (two equal, one different):");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        // Find the unique one
        int result = (a == b) ? c : (a == c) ? b : a;
        
        System.out.println("The unique number is: " + result);
        
        scanner.close();
    }
}
