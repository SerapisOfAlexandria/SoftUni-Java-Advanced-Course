package IteratorsAndComparatorsExercise.StackIterator;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Long> integers;

        if (input.equals("Push")) {
            integers = new ArrayList<>();
        } else {
            integers = Arrays.stream(input.replaceFirst("Push ", "").split(", "))
                    .map(Long::parseLong)
                    .collect(Collectors.toList());
        }

        StackStructure<Long> stackStructure = new StackStructure<>(integers);



        String command = scanner.nextLine();
        while (!command.equals("END")) {
            Iterator<Long> stackIterator = stackStructure.iterator();
            if (stackIterator.hasNext()) {
                stackIterator.next();
            } else {
                System.out.println("No elements");
            }
            command = scanner.nextLine();
        }

        StackIterator stackIteratorClass = new StackIterator(stackStructure.stack);
        while (stackIteratorClass.hasNext() || stackIteratorClass.isLast()) {
            System.out.println(stackIteratorClass.next());
        }
        stackIteratorClass = new StackIterator(stackStructure.stack);
        while (stackIteratorClass.hasNext() || stackIteratorClass.isLast()) {
            System.out.println(stackIteratorClass.next());
        }
    }
}
