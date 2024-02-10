package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //MatrixOne
        int rowsMatrixOne = scanner.nextInt();
        int columnsMatrixOne = scanner.nextInt();
        int[][] matrixOne = new int[rowsMatrixOne][columnsMatrixOne];
        scanner.nextLine();


        for (int i = 0; i <= rowsMatrixOne - 1; i++) {
            matrixOne[i] = convertToArray(scanner);
        }

        //MatrixTwo
        int rowsMatrixTwo = scanner.nextInt();
        int columnsMatrixTwo = scanner.nextInt();
        int[][] matrixTwo = new int[rowsMatrixTwo][columnsMatrixTwo];
        scanner.nextLine();


        for (int i = 0; i <= rowsMatrixTwo - 1; i++) {
            matrixTwo[i] = convertToArray(scanner);
        }

        //Checking logic
        if (rowsMatrixOne == rowsMatrixTwo && columnsMatrixOne == columnsMatrixTwo) {
            for (int i = 0; i <= rowsMatrixOne - 1; i++) {
                for (int a = 0; a <= columnsMatrixOne - 1; a++) {
                    if (matrixOne[i][a] != matrixTwo[i][a]) {
                        System.out.println("not equal");
                        return;
                    }
                }
            }
        } else {
            System.out.println("not equal");
            return;
        }

        System.out.println("equal");
    }

    public static int[] convertToArray(Scanner scanner) {
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        return arr;
    }
}
