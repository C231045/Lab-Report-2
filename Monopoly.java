import java.util.*;

public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int R = sc.nextInt();
        int S = sc.nextInt();

        boolean monopoly =
                (P > Q + R + S) ||
                (Q > P + R + S) ||
                (R > P + Q + S) ||
                (S > P + Q + R);

        System.out.println(monopoly ? "Yes" : "No");
    }
}
