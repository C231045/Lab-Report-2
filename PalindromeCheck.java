import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        // Remove spaces and convert to lowercase for accurate checking
        String original = str.replaceAll("\\s+", "").toLowerCase();
        
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        
        if (original.equals(reversed)) {
            System.out.println("\"" + str + "\" is a palindrome");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome");
        }
        
        scanner.close();
    }
}
