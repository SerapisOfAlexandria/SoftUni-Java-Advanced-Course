package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Predicate<String> predicate;
        List<String> names = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .collect(Collectors.toList());

        String[] inputAction = scanner.nextLine().split(" ");

        while (!inputAction[0].equals("Party!")) {
            String action = inputAction[0];
            String filterSelect = inputAction[1];
            String lookforString = inputAction[2];

            switch (filterSelect) {
                case "StartsWith":
                    predicate = s -> s.startsWith(lookforString);
                    break;
                case "EndsWith":
                    predicate = s -> s.endsWith(lookforString);
                    break;
                default:
                    predicate = s -> s.length() == Integer.parseInt(lookforString);
                    break;
            }

            switch (inputAction[0]) {
                case "Double":
                    List<String> namesDouble = names.stream().filter(predicate).collect(Collectors.toList());
                    names.addAll(namesDouble);
                    break;
                case "Remove":
                    names.removeIf(predicate);
                    break;
            }
            inputAction = scanner.nextLine().split(" ");
        }

        if (names.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            System.out.println(names.stream().sorted().collect(Collectors.joining(", ")) + " are going to the party!");
        }
    }
}
