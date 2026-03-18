import java.util.Scanner;

public class WordCapitalization {
    
    public static String capitalize(String word) {
        // Check if the word is empty or null
        if (word == null || word.isEmpty()) {
            return word;
        }
        
        // Get the first character and convert it to uppercase
        char firstChar = Character.toUpperCase(word.charAt(0));
        
        // Get the rest of the string (substring from index 1 to end)
        String restOfString = word.substring(1);
        
        // Return the capitalized word
        return firstChar + restOfString;
    }
    
    // Alternative method using StringBuilder for better performance with many operations
    public static String capitalizeUsingStringBuilder(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
        
        StringBuilder sb = new StringBuilder(word);
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        return sb.toString();
    }
    
    // Method to handle multiple words
    public static void processWords(String[] words) {
        for (String word : words) {
            System.out.println("Original: " + word + " → Capitalized: " + capitalize(word));
        }
    }
    
    // Main method for testing
    public static void main(String[] args) {
        // Test cases
        String[] testWords = {
            "hello",      // Should become "Hello"
            "world",      // Should become "World"
            "java",       // Should become "Java"
            "programming", // Should become "Programming"
            "a",          // Should become "A" (single letter)
            "123abc",     // Should become "123abc" (first char is digit, no change)
            "helloWORLD", // Should become "HelloWORLD" (only first letter changes)
            "",           // Empty string - should return empty string
            "c",          // Single character - should become uppercase
            "the quick brown fox" // Should become "The quick brown fox"
        };
        
        System.out.println("=== Word Capitalization Program ===");
        System.out.println("Capitalizing the first letter of each word:\n");
        
        processWords(testWords);
        
        // Interactive version with user input
        System.out.println("\n=== Interactive Version ===");
        System.out.println("Enter words to capitalize (type 'exit' to quit):");
        
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a word: ");
            String input = scanner.nextLine().trim();
            
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            
            String result = capitalize(input);
            System.out.println("Capitalized: " + result);
            System.out.println();
        }
        
        scanner.close();
        System.out.println("Program ended.");
    }
}
