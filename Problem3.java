import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();

        int count;
        if (a % 2 == 0) {
            count = a - 1;
        } else {
            count = a;
        }

        for (int i = 0; i < count; i++) {
            int number = 2 * i + 1;
            System.out.print(number);
            if (i != count - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
