package MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatrixShuffling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("^(?<command>swap) (?<fromRow>\\d+) (?<fromColumn>\\d+) (?<toRow>\\d+) (?<toColumn>\\d+)$");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        scanner.nextLine();
        String[][] matrix = new String[rows][columns];

        for (int i = 0; i < rows; i++) {
            matrix[i] = convertToArray(scanner);
        }

        String command = scanner.nextLine();
        while (!command.contains("END")) {
            Matcher matcher = pattern.matcher(command);

            if (matcher.find()) {
                int fromRow = Integer.parseInt(matcher.group("fromRow"));
                int fromColumn = Integer.parseInt(matcher.group("fromColumn"));
                int toRow = Integer.parseInt(matcher.group("toRow"));
                int toColumn = Integer.parseInt(matcher.group("toColumn"));

                if ((fromRow > rows - 1 || fromRow < 0) ||
                        (fromColumn > columns - 1 || fromColumn < 0) ||
                        (toRow > rows - 1 || toRow < 0) ||
                        (toColumn > columns - 1 || toColumn < 0)) {
                    System.out.println("Invalid input!");
                } else {
                    String temp = matrix[fromRow][fromColumn];
                    matrix[fromRow][fromColumn] = matrix[toRow][toColumn];
                    matrix[toRow][toColumn] = temp;
                    print(matrix);
                }
            } else {
                System.out.println("Invalid input!");
            }

            command = scanner.nextLine();
        }
    }

    public static void print(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            String matrixLine = Arrays.toString(matrix[i])
                    .replace("[", "")
                            .replace("]", "")
                                    .replace(", ", " ");
            System.out.println(matrixLine);
        }
    }

    public static String[] convertToArray(Scanner scanner) {
        String[] arr = scanner.nextLine().split(" ");
        return arr;
    }
}

