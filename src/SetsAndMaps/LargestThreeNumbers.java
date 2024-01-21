package SetsAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class LargestThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((n1, n2) -> n2.compareTo(n1))
                .collect(Collectors.toList());

        if (numbers.size() < 3) {
            System.out.println(numbers.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.printf("%s ", String.valueOf(numbers.get(i)));
            }
        }
    }
}
