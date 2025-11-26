import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * PascalTriangle - boilerplate template for generating Pascal's Triangle.
 * Save as PascalTriangle.java and run with an integer input for the number of rows.
 *
 * Example:
 *   java PascalTriangle 5
 */
public class PascalTriangle {

    /**
     * Generate Pascal's triangle up to numRows (numRows >= 0).
     * elements at row n and position k (0-indexed) is given by binomial coefficient C(n, k).
     * Formula == C(n,k) = n! / (k! * (n-k)!) == n/1 * (n-1)/2 * ... * (n-k+1)/k
     */
    public static long funcNcK(int n , int k){
        if (k < 0 || k > n) return 0L;
        k = Math.min(k, n - k);
        long ans = 1;
            for (int i = 1; i <= k; i++) {
                ans = ans * (n - i + 1);
                ans = ans / i; // multiply first, then divide to avoid truncation
        }
        return ans;
    }

    public static List<List<Long>> generateInN3(int numRows) {
            List<List<Long>> ans = new ArrayList<>();
            for (int i = 0; i < numRows; i++) {
                List<Long> temp = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    temp.add(funcNcK(i, j));
                }
                ans.add(temp);
            }
            return ans;
    }

    public static List<Long> generateRow(int rowIndex) {
        List<Long> row = new ArrayList<>();
        Long ans = 1L;
        row.add(1L);
        for (int col = 1; col <= rowIndex; col++) {
            ans = ans * (rowIndex - col + 1);
            ans = ans / col;
            row.add(ans);
        }
        return row;
    }

    public static List<List<Long>> generate(int numRows) {
        List<List<Long>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            triangle.add(generateRow(i));
        }
        return triangle;
    }

    /**
     * Print the triangle to stdout, one row per line.
     */
    public static void printTriangle(List<List<Long>> triangle) {
        for (List<Long> row : triangle) {
            for (long v : row) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5; // default rows
        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
            } catch (NumberFormatException ignored) { }
        } else {
            // optional: prompt user if no arg provided
            System.out.print("Enter number of rows (default 5): ");
            try (Scanner sc = new Scanner(System.in)) {
                String line = sc.nextLine().trim();
                if (!line.isEmpty()) n = Integer.parseInt(line);
            } catch (Exception ignored) { }
        }

        if (n < 0) {
            System.err.println("Number of rows must be non-negative.");
            System.exit(1);
        }

        List<List<Long>> triangle = generate(n);

        printTriangle(triangle);
    }
}