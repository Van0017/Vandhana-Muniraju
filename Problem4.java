import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        int[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        Map<Integer, Integer> result = new LinkedHashMap<>();

        // Initialize map
        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }

        // Count multiples
        for (int i = 1; i <= 9; i++) {
            for (int num : input) {
                if (num % i == 0) {
                    result.put(i, result.get(i) + 1);
                }
            }
        }

        // Print in required format
        System.out.print("{");
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue());
            count++;
            if (count < result.size()) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
