package MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Matrix declaration & initialization
        int[] dimensions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] matrix = new int[dimensions[0]][dimensions[1]];
        for (int i = 0; i < dimensions[0]; i++) {
            matrix[i] = convertToArray(scanner);
        }

        //Finding the greatest 2x2 matrix

        int[][] greatestMatrix = new int[3][3];
        int greatestSum = 0;

        for (int i = 0; i < dimensions[0] - 2; i++) {
            for (int a = 0; a < dimensions[1] - 2; a++) {
                int sumOfElements = matrix[i][a] + //element 1
                        matrix[i][a + 1] + // element 2
                        matrix[i][a + 2] + // element 3
                        matrix[i + 1][a] + // element 4
                        matrix[i + 1][a + 1] + // element 5
                        matrix[i + 1][a + 2] + // element 6
                        matrix[i + 2][a] + // element 7
                        matrix[i + 2][a + 1] + // element 8
                        matrix[i + 2][a + 2]; // element 9

                if (sumOfElements > greatestSum) {
                    greatestSum = sumOfElements;
                    greatestMatrix[0][0] = matrix[i][a];
                    greatestMatrix[0][1] = matrix[i][a + 1];
                    greatestMatrix[0][2] = matrix[i][a + 2];
                    greatestMatrix[1][0] = matrix[i + 1][a];
                    greatestMatrix[1][1] = matrix[i + 1][a + 1];
                    greatestMatrix[1][2] = matrix[i + 1][a + 2];
                    greatestMatrix[2][0] = matrix[i + 2][a];
                    greatestMatrix[2][1] = matrix[i + 2][a + 1];
                    greatestMatrix[2][2] = matrix[i + 2][a + 2];
                }
            }
        }

        //Output
        System.out.println("Sum = " + greatestSum);
        print(greatestMatrix);
    }

    public static int[] convertToArray(Scanner scanner) {
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        return arr;
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
