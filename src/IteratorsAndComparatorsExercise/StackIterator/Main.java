package IteratorsAndComparatorsExercise.StackIterator;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> tokens;

        tokens = Arrays.stream(input.split("[\\s,]+"))
                    .skip(1)
                    .collect(Collectors.toList());


        StackIterator<String> stackStructure = new StackIterator<>(tokens);
        Iterator<String> stackIterator = stackStructure.iterator();

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            if (command.contains("Push")) {
                tokens = Arrays.stream(command.split("[\\s,]+"))
                        .skip(1)
                        .collect(Collectors.toList());
                stackStructure.push(tokens);
            } else if (command.equals("Pop")){
                stackStructure.pop();
            }
            command = scanner.nextLine();
        }

        stackStructure.forEach(System.out::println);
        stackStructure.forEach(System.out::println);

    }
}
