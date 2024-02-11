package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int[] dimensions = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] matrix = new int[dimensions[0]][dimensions[1]];
        for (int i = 0; i < dimensions[0]; i++) {
            matrix[i] = convertToArray(scanner);
            sum += Arrays.stream(matrix[i]).sum();
        }

        //Output
        System.out.println(dimensions[0]);
        System.out.println(dimensions[1]);
        System.out.println(sum);

    }

    public static int[] convertToArray(Scanner scanner) {
        int[] arr = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        return arr;
    }
}
