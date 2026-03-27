import java.util.Scanner;

public class StringCaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        String upperCase = str.toUpperCase();
        String lowerCase = str.toLowerCase();
        
        System.out.println("\nOriginal string: " + str);
        System.out.println("Uppercase: " + upperCase);
        System.out.println("Lowercase: " + lowerCase);
        
        scanner.close();
    }
}
