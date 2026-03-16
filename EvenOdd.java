import java.util.Scanner; 

public class EvenOddCheck {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        num = scanner.nextInt(); // Read the user input

        if (num % 2 == 0) {
            System.out.println("The given number " + num + " is Even");
        } else {
            System.out.println("The given number " + num + " is Odd");
        }

        scanner.close(); 
    }
}

