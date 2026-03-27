import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        int sum = 0;
        
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        
        double average = (double) sum / size;
        
        System.out.println("\nSum of array: " + sum);
        System.out.println("Average of array: " + average);
        
        scanner.close();
    }
}
