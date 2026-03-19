import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt(); // regular working hours
        int Y = sc.nextInt(); // Wednesday working hours

        int totalHours = 4 * X + Y;

        System.out.println(totalHours);

        sc.close();
    }
}
