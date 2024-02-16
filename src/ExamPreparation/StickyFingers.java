package ExamPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StickyFingers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Matrix initialization
        int dimensions = Integer.parseInt(scanner.nextLine());
        char[][] map = new char[dimensions][dimensions];

        //Movement commands container
        List<String> movements = new ArrayList<>();
        String[] inputMovements = scanner.nextLine().split(",");
        for (String movement : inputMovements) {
            movements.add(movement);
        }

        //Matrix information setter
        int[] dilligerPosition = new int[2];
        for (int i = 0; i < dimensions; i++) {
            String[] input = scanner.nextLine().split(" ");
            char[] mapPiece = new char[dimensions];

            for (int a = 0; a < dimensions; a++) {
                mapPiece[a] = input[a].charAt(0);
                if (mapPiece[a] == 'D') {
                    dilligerPosition[0] = i;
                    dilligerPosition[1] = a;
                }
            }
            map[i] = mapPiece;
        }

        int stolenAmount = 0;



        for (String movement : movements) {
            int[] dillagerLastPosition = {dilligerPosition[0], dilligerPosition[1]};
            switch (movement) {
                case "up":
                    if (dilligerPosition[0] - 1 < 0) {
                        System.out.println("You cannot leave the town, there is police outside!");
                    } else {
                        dilligerPosition[0] -= 1;
                    }
                    break;
                case "down":
                    if (dilligerPosition[0] + 1 > dimensions - 1) {
                        System.out.println("You cannot leave the town, there is police outside!");
                    } else {
                        dilligerPosition[0] += 1;
                    }
                    break;
                case "right":
                    if (dilligerPosition[1] + 1 > dimensions - 1) {
                        System.out.println("You cannot leave the town, there is police outside!");
                    } else {
                        dilligerPosition[1] += 1;
                    }
                    break;
                case "left":
                    if (dilligerPosition[1] - 1 < 0) {
                        System.out.println("You cannot leave the town, there is police outside!");
                    } else {
                        dilligerPosition[1] -= 1;
                    }
                    break;
            }

            switch (map[dilligerPosition[0]][dilligerPosition[1]]) {
                case '$':
                    System.out.printf("You successfully stole %d$.\n", dilligerPosition[0] * dilligerPosition[1]);
                    stolenAmount += dilligerPosition[0] * dilligerPosition[1];
                    map[dilligerPosition[0]][dilligerPosition[1]] = 'D';
                    map[dillagerLastPosition[0]][dillagerLastPosition[1]] = '+';
                    break;
                case 'P':
                    System.out.printf("You got caught with %d$, and you are going to jail.\n", stolenAmount);
                    map[dilligerPosition[0]][dilligerPosition[1]] = '#';
                    map[dillagerLastPosition[0]][dillagerLastPosition[1]] = '+';
                    print(map);
                    return;
                case '+':
                    map[dilligerPosition[0]][dilligerPosition[1]] = 'D';
                    map[dillagerLastPosition[0]][dillagerLastPosition[1]] = '+';
                    break;
            }
        }

        System.out.printf("Your last theft has finished successfully with %d$ in your pocket.\n", stolenAmount);
        print(map);
    }

    public static void print(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int a = 0; a < matrix[i].length; a++) {
                System.out.print(matrix[i][a] + " ");
            }
            System.out.println();
        }
    }
}
