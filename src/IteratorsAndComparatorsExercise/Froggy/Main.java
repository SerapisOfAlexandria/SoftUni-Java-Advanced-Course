package IteratorsAndComparatorsExercise.Froggy;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("[\\s,]+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        scanner.nextLine();

        Lake lake = new Lake(numbers);
        Iterator<Integer> frog = lake.iterator();
        List<String> numbersAsString = new ArrayList<>();

        while (frog.hasNext()) {
            numbersAsString.add(frog.next().toString());
        }

        System.out.println(String.join( ", ", numbersAsString));
    }
}
