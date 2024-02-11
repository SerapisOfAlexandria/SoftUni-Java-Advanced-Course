package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int matrixRows = scanner.nextInt();
        int matrixColumns = scanner.nextInt();
        scanner.nextLine();
        char[][] matrixOne = createCharMatrix(matrixRows, matrixColumns, scanner);
        char[][] matrixTwo = createCharMatrix(matrixRows, matrixColumns, scanner);

       returnIntersections(matrixOne, matrixTwo, matrixRows, matrixColumns);

    }

    public static char[] convertToArray(Scanner scanner) {
        char[] arr = scanner.nextLine().replaceAll("\\s+", "")
                .toCharArray();
        return arr;
    }

    public static char[][] createCharMatrix(int rows, int columns, Scanner scanner) {
        char[][] matrix = new char[rows][columns];

        for (int i = 0; i < rows; i++) {
            matrix[i] = convertToArray(scanner);
        }

        return matrix;
    }

    public static void returnIntersections(char[][] matrixOne, char[][] matrixTwo, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            StringBuilder intersections = new StringBuilder();
            for (int a = 0; a < columns; a++) {
                if (matrixOne[i][a] == matrixTwo[i][a]) {
                    intersections.append(matrixOne[i][a] + " ");
                } else {
                    intersections.append('*' + " ");
                }
            }
            System.out.println(intersections);
        }

    }
}
