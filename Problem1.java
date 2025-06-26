public class Problem1 {
    public double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "add": return a + b;
            case "subtract": return a - b;
            case "multiply": return a * b;
            case "divide": return b != 0 ? a / b : 0;
            default: throw new IllegalArgumentException("Invalid operation");
        }
    }

    public static void main(String[] args) {
        Problem1 calc = new Problem1();
        System.out.println(calc.calculate(10, 5, "add"));        
        System.out.println(calc.calculate(10, 5, "subtract"));   
        System.out.println(calc.calculate(10, 5, "multiply"));  
        System.out.println(calc.calculate(10, 5, "divide"));     
    }
}
