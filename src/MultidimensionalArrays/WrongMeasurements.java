package MultidimensionalArrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WrongMeasurements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Matrix Initialization
        int rows = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[rows][];
        for (int i = 0; i < rows; i++) {
            matrix[i] = readRow(scanner);
        }
        int columnSize = matrix[0].length;
        int wrongValue = matrix[scanner.nextInt()][scanner.nextInt()];
        scanner.nextLine();

        Map<int[], Integer> corrections = new HashMap<>();


        for (int i = 0; i < rows; i++) {
            for (int y = 0; y < matrix[0].length; y++) {
                if (matrix[i][y] == wrongValue) {
                    int sum = 0;
                    if (i + 1 <= rows - 1 && matrix[i + 1][y] != wrongValue) { // checks if there's a value below
                        sum += matrix[i + 1][y];
                    }
                    if (i - 1 >= 0 && matrix[i - 1][y] != wrongValue) { // checks if there's a value above
                        sum += matrix[i - 1][y];
                    }
                    if (y + 1 <= columnSize - 1 && matrix[i][y + 1] != wrongValue) { // checks if there's a value on the right
                        sum += matrix[i][y + 1];
                    }
                    if (y - 1 >= 0 && matrix[i][y - 1] != wrongValue) { // checks if there's a value on the left
                        sum += matrix[i][y - 1];
                    }

                    corrections.put(new int[]{i , y}, sum);
                }
            }
        }

        for (int[] key : corrections.keySet()) {
            matrix[key[0]][key[1]] = corrections.get(key);
        }

        Arrays.stream(matrix)
                .map(row -> Arrays.stream(row)
                        .mapToObj(Integer::toString)
                        .collect(Collectors.joining(" ")))
                .forEach(System.out::println);
    }

    public static int[] readRow(Scanner scanner) {
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        return arr;
    }
}
