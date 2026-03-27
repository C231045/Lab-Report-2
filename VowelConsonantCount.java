import java.util.Scanner;

public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        String lowerStr = str.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        
        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
        System.out.println("\nString: \"" + str + "\"");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        
        scanner.close();
    }
}
