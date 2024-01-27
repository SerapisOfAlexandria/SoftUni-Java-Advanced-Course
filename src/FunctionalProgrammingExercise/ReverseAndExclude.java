package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int numToFilter = Integer.parseInt(scanner.nextLine());

        BiFunction<List<Integer>, Integer, String> reverseAndExclude = (list, num) ->
                list.stream()
                        .sorted(Collections.reverseOrder())
                        .filter(n -> n % num != 0)
                        .map(String::valueOf)
                        .collect(Collectors.joining(" "));

        System.out.println(reverseAndExclude.apply(numbers, numToFilter));
    }
}
