package SetsAndMapsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class SetsOfElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int setOneSize = scanner.nextInt();
        int setTwoSize = scanner.nextInt();
        Set<Integer> setOne = new LinkedHashSet<>();
        Set<Integer> setTwo = new LinkedHashSet<>();
        scanner.nextLine();

        for (int i = 0; i < setOneSize; i++) {
            setOne.add(Integer.parseInt(scanner.nextLine()));
        }

        for (int i = 0; i < setTwoSize; i++) {
            setTwo.add(Integer.parseInt(scanner.nextLine()));
        }

        Set<Integer> intersection = new LinkedHashSet<>(setOne);
        intersection.retainAll(setTwo);

        System.out.println(intersection.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}
