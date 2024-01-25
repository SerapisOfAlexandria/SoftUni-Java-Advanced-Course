package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FindEvenOrOdds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lowerBound = scanner.nextInt();
        int upperBound = scanner.nextInt();
        scanner.nextLine();
        String filtrationType = scanner.nextLine();

        BiFunction<Integer, Integer, int[]> fillArray = (a, b) -> {
            int[] arr = new int[b - a + 1];
            for (int i = 0; i <= b - a; i++) {
                arr[i] = a + i;
            }
            return arr;
        };

        Function<String, Predicate<Integer>> filterFactory = a ->
                "odd".equals(a) ? n -> n % 2 != 0 : n -> n % 2 == 0;

        int[] arr = fillArray.apply(lowerBound, upperBound);

        for (int i : arr) {
            if (filterFactory.apply(filtrationType).test(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
