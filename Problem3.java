import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = scanner.nextInt();  // input a = x

        int limit = (a % 2 == 0) ? a - 1 : a;

        for (int i = 0; i < limit; i++) {
            System.out.print((2 * i + 1) + " ");
        }

        scanner.close();
    }
}
