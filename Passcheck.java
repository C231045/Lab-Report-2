import java.util.Scanner;

public class PassCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt(); // number of sections
        int Y = sc.nextInt(); // students per section
        int Z = sc.nextInt(); // students passed

        int totalStudents = X * Y;

        if (Z > totalStudents / 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
