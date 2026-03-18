public class Solution {
    public static boolean existsIntegerAverage(int A, int C) {
        // Check if A + C is even
        return (A + C) % 2 == 0;
    }
    
    // Alternative method that also returns the value of B if it exists
    public static Integer findAverageInteger(int A, int C) {
        if ((A + C) % 2 == 0) {
            return (A + C) / 2;
        }
        return null; // No integer B exists
    }
    
    // Main method for testing
    public static void main(String[] args) {
        // Test cases
        int[][] testCases = {
            {2, 4},   // A=2, C=4 -> B=3 exists
            {3, 5},   // A=3, C=5 -> B=4 exists
            {1, 2},   // A=1, C=2 -> No integer B exists
            {10, 20}, // A=10, C=20 -> B=15 exists
            {7, 8}    
        };
        
        for (int[] test : testCases) {
            int A = test[0];
            int C = test[1];
            
            boolean exists = existsIntegerAverage(A, C);
            Integer B = findAverageInteger(A, C);
            
            System.out.println("A = " + A + ", C = " + C);
            System.out.println("Integer B exists: " + exists);
            if (exists) {
                System.out.println("B = " + B);
            }
            System.out.println();
        }
    }
}
