import java.util.Scanner;

public class WordAbbreviation {
    
    public static String abbreviateWord(String word) {
        // Check if the word is too long (length > 10)
        if (word.length() > 10) {
            // Get first character
            char firstChar = word.charAt(0);
            
            // Get last character
            char lastChar = word.charAt(word.length() - 1);
            
            // Calculate number of characters between first and last
            int betweenCount = word.length() - 2;
            
            // Create abbreviation: firstChar + betweenCount + lastChar
            return firstChar + String.valueOf(betweenCount) + lastChar;
        } else {
            // Word is not too long, return as is
            return word;
        }
    }
    
    // Method to process multiple words
    public static void processWords(String[] words) {
        for (String word : words) {
            System.out.println(abbreviateWord(word));
        }
    }
    
    // Main method for testing
    public static void main(String[] args) {
        // Test cases
        String[] testWords = {
            "localization",
            "internationalization",  
            "word",                    
            "abbreviation",            
            "hello",                  
            "accessibility",          
            "cat",                      
            "antidisestablishment"      
        };
        
        System.out.println("=== Word Abbreviation Program ===");
        System.out.println("Words longer than 10 characters will be abbreviated:");
        System.out.println("Format: first_letter + (length-2) + last_letter\n");
        
        processWords(testWords);
        
        // Interactive version with user input
        System.out.println("\n=== Interactive Version ===");
        System.out.println("Enter words (type 'exit' to quit):");
        
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a word: ");
            String input = scanner.nextLine().trim();
            
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            
            if (input.isEmpty()) {
                continue;
            }
            
            String result = abbreviateWord(input);
            System.out.println("Result: " + result);
            System.out.println("Original length: " + input.length() + 
                             ", Abbreviated: " + (input.length() > 10 ? "yes" : "no"));
            System.out.println();
        }
        
        scanner.close();
        System.out.println("Program ended.");
    }
}
