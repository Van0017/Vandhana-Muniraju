public class Problem4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        // Create an array to store counts from 1 to 9
        int[] counts = new int[10]; // index 0 unused

        for (int i = 1; i <= 9; i++) {
            counts[i] = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] % i == 0) {
                    counts[i]++;
                }
            }
        }

        // Print the results
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + ": " + counts[i]);
        }
    }
}
