package FunctionalProgrammingExercise;

import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Consumer<String[]> printNames = arr -> {
            for (String name : arr) {
                System.out.println("Sir "+ name);
            }
        };

        printNames.accept(scanner.nextLine().split(" "));
    }
}
