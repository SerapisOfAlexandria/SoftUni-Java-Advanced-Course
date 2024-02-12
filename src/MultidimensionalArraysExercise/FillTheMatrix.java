package MultidimensionalArraysExercise;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] dimensionsAndType = scanner.nextLine().split(", ");
        int dimensions = Integer.parseInt(dimensionsAndType[0]);
        char type = dimensionsAndType[1].charAt(0);
        int[][] matrix;

        if (type == 'A') {
            matrix = createArrTypeA(dimensions);
        } else {
            matrix = createArrTypeB(dimensions);
        }

        print(matrix);
    }

    public static int[][] createArrTypeA(int dimensions) {
        int[][] matrix = new int[dimensions][dimensions];
        for (int i = 0; i < dimensions; i++) {
            for (int a = 0; a < dimensions; a++) {
                matrix[i][a] = (i + 1) + dimensions * a;
            }
        }
        return matrix;
    }

    public static int[][] createArrTypeB(int dimensions) {
        int[][] matrix = new int[dimensions][dimensions];
        int count = 1;
        for (int i = 0; i < dimensions; i++) {
            if (i % 2 == 0) {
                for (int a = 0; a < dimensions; a++) {
                    matrix[a][i] = count++;
                }
            } else {
                for (int a = dimensions - 1; a >= 0; a--) {
                    matrix[a][i] = count++;
                }
            }
        }
        return matrix;
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int a = 0; a < matrix[i].length; a++) {
                System.out.print(matrix[i][a] + " ");
            }
            System.out.println();
        }
    }
}
