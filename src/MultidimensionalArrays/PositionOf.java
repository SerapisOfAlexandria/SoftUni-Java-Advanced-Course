package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PositionOf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int matrixRows = scanner.nextInt();
        int matrixColumns = scanner.nextInt();
        int[][] matrix = new int[matrixRows][matrixColumns];
        scanner.nextLine();


        for (int i = 0; i <= matrixRows - 1; i++) {
            matrix[i] = convertToArray(scanner);
        }

        int magicNumber = Integer.parseInt(scanner.nextLine());
        boolean noMagicNumberFound = true;

        for (int i = 0; i <= matrixRows - 1; i++) {
            for (int a = 0; a <= matrixColumns - 1; a++) {
                if (matrix[i][a] == magicNumber) {
                    System.out.println(String.format("%d %d", i, a));
                    noMagicNumberFound = false;
                }
            }
        }

        if (noMagicNumberFound) {
            System.out.println("not found");
        }
    }

    public static int[] convertToArray(Scanner scanner) {
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        return arr;
    }
}
