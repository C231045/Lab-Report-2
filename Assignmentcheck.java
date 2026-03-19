import java.util.Scanner;

public class AssignmentCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt(); // starting time in pm (24-hour format)

        if (X + 3 <= 22) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
