import java.util.Scanner;

public class IIUCTV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // number of friends
        int X = sc.nextInt(); // cost of one subscription

        // Calculate minimum subscriptions needed
        int subscriptions = (N + 5) / 6;  // ceiling division

        // Total cost
        int totalCost = subscriptions * X;

        System.out.println(totalCost);

        sc.close();
    }
}
