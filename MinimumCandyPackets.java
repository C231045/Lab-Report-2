import java.util.*;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        int need = Math.max(0, N - X);
        int packets = (need + 3) / 4;

        System.out.println(packets);
    }
}
