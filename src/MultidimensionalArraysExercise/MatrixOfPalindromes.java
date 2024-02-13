package MultidimensionalArraysExercise;

import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        String[][] matrix = new String[rows][columns];

        int character = 97;
        for (int i = 0; i < rows; i++) {
            for (int a = 0; a < columns; a++) {
                String palindrome =  "" + (char) character + (char) (character + a) + (char) character;
                matrix[i][a] = palindrome;
            }
            character++;
        }

        print(matrix);

    }

    public static void print(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int a = 0; a < matrix[i].length; a++) {
                System.out.print(matrix[i][a] + " ");
            }
            System.out.println();
        }
    }
}
