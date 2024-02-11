package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Matrix initialization
        int dimensions = Integer.parseInt(scanner.nextLine());
        int[][] squareMatrix = new int[dimensions][dimensions];

        for (int i = 0; i < dimensions; i++) {
            squareMatrix[i] = convertToArray(scanner);
        }

        // Diagonals
        StringBuilder diagonalRightToLeft = new StringBuilder();
        StringBuilder diagonalLeftToRight = new StringBuilder();

        for (int i = 0; i < dimensions; i++) {
            diagonalRightToLeft.append(squareMatrix[i][i] + " ");
            diagonalLeftToRight.append(squareMatrix[dimensions - 1 - i][0 + i] + " ");
        }

        System.out.println(diagonalRightToLeft);
        System.out.println(diagonalLeftToRight);
    }

    public static int[] convertToArray(Scanner scanner) {
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        return arr;
    }
}
