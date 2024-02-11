package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSumOf2x2Matrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Matrix declaration & initialization
        int[] dimensions = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] matrix = new int[dimensions[0]][dimensions[1]];
        for (int i = 0; i < dimensions[0]; i++) {
            matrix[i] = convertToArray(scanner);
        }

        //Finding the greatest 2x2 matrix

        int[][] greatestMatrix = new int[2][2];
        int greatestSum = 0;

        for (int i = 0; i < dimensions[0] - 1; i++) {
            for (int a = 0; a < dimensions[1] - 1; a++) {
                int sumOfElements = matrix[i][a] + //element 1
                        matrix[i][a + 1] + // element 2
                        matrix[i + 1][a] + // element 3
                        matrix[i + 1][a + 1]; // element 4
                if (sumOfElements > greatestSum) {
                    greatestSum = sumOfElements;
                    greatestMatrix[0][0] = matrix[i][a];
                    greatestMatrix[0][1] = matrix[i][a + 1];
                    greatestMatrix[1][0] = matrix[i + 1][a];
                    greatestMatrix[1][1] = matrix[i + 1][a + 1];
                }
            }
        }

        //Output

        System.out.println(String.format("%d %d\n%d %d",
                greatestMatrix[0][0],
                greatestMatrix[0][1],
                greatestMatrix[1][0],
                greatestMatrix[1][1]));
        System.out.println(greatestSum);

    }

    public static int[] convertToArray(Scanner scanner) {
        int[] arr = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        return arr;
    }
}
