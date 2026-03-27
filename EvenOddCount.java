import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        int evenCount = 0;
        int oddCount = 0;
        
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("\nEven numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
        
        scanner.close();
    }
}
