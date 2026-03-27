import java.util.Scanner;

public class ArrayNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[5];
        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("\nNumbers in the array:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
        
        scanner.close();
    }
}
