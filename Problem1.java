import java.util.Scanner;

public class Problem1 {
    double a, b;

    public Problem1(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculate(String operation) {
        if (operation.equalsIgnoreCase("add")) {
            return a + b;
        } else if (operation.equalsIgnoreCase("subtract")) {
            return a - b;
        } else if (operation.equalsIgnoreCase("multiply")) {
            return a * b;
        } else if (operation.equalsIgnoreCase("divide")) {
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("Cannot divide by zero");
                return 0;
            }
        } else {
            System.out.println("Invalid operation");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number a: ");
        double a = input.nextDouble();

        System.out.print("Enter number b: ");
        double b = input.nextDouble();

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String op = input.next();

        Problem1 calc = new Problem1(a, b);
        double result = calc.calculate(op);
        System.out.println("Result: " + result);
    }
}
