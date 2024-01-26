package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Function<String, Integer> getLowestNum = arr -> {
            int num = Arrays.stream(arr.split(" "))
                    .mapToInt(Integer::parseInt)
                    .min()
                    .orElse(Integer.MAX_VALUE);
            return num;
        };

        int lowestNum = getLowestNum.apply(scanner.nextLine());

        System.out.println(lowestNum);
    }
}
