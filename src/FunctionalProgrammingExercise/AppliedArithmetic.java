package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] newNumbers = new int[numbers.length];

        Function<int[], int[]> add = arr -> {
            for (int i = 0; i <= arr.length - 1; i++) {
                arr[i] = arr[i] + 1;
            }
            return arr;
        };

        Function<int[], int[]> multiply = arr -> {
            for (int i = 0; i <= arr.length - 1; i++) {
                arr[i] = arr[i] * 2;
            }
            return arr;
        };

        Function<int[], int[]> subtract = arr -> {
            for (int i = 0; i <= arr.length - 1; i++) {
                arr[i] = arr[i] - 1;
            }
            return arr;
        };

        Consumer<int[]> printNums = nums -> {
            Arrays.stream(nums).forEach(num -> {
                System.out.printf("%d ", num);
            });
            System.out.println("");
        };

        Function<String, Function<int[], int[]>> selectAction = action -> {
          if (action.equals("add")) {
              return add;
          } else if (action.equals("multiply")) {
              return multiply;
          } else if (action.equals("subtract")) {
              return subtract;
          }
          return null;
        };

        String operation = scanner.nextLine();

        while (!operation.equals("end")) {
            if (operation.equals("print")) {
                printNums.accept(numbers);
            } else {
                numbers = selectAction.apply(operation).apply(numbers);
            }

            operation = scanner.nextLine();
        }
    }
}
