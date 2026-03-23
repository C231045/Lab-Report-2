import java.util.*;

public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int lower = Math.max(A, C);

        if (lower <= B) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
