package MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dimensions = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[dimensions][dimensions];
        for (int i = 0; i < dimensions; i++) {
            matrix[i] = convertToArray(scanner);
        }

        int diagonalOneSum = 0;
        int diagonalTwoSum = 0;

        for (int i = 0; i < dimensions; i++) {
            diagonalOneSum += matrix[i][i];
            diagonalTwoSum += matrix[i][(dimensions - 1) - i];
        }

        System.out.println(Math.abs(diagonalOneSum - diagonalTwoSum));
    }

    public static void print(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int a = 0; a < matrix[i].length; a++) {
                System.out.print(matrix[i][a] + " ");
            }
            System.out.println();
        }
    }

    public static int[] convertToArray(Scanner scanner) {
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        return arr;
    }
}
