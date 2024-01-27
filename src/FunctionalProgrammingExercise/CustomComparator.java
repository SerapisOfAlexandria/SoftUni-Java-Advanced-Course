package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        Comparator<Integer> comparator = (a, b) -> {
            boolean aIsEven = a % 2 == 0;
            boolean bIsEven = b % 2 == 0;

            if (aIsEven && !bIsEven) {
                return -1;
            } else if (!aIsEven && bIsEven) {
                return 1;
            } else {
                return a.compareTo(b);
            }
        };

        Arrays.sort(numbers, comparator);
        System.out.println(Arrays.stream(numbers).map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
