import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        System.out.print("\nEnter the element to search: ");
        int searchElement = scanner.nextInt();
        
        int position = -1;
        for (int i = 0; i < size; i++) {
            if (numbers[i] == searchElement) {
                position = i;
                break;
            }
        }
        
        if (position != -1) {
            System.out.println("\nElement " + searchElement + " found at index " + position);
        } else {
            System.out.println("\nElement " + searchElement + " not found in the array");
        }
        
        scanner.close();
    }
}
