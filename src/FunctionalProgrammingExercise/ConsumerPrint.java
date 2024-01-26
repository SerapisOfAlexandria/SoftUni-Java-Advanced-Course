package FunctionalProgrammingExercise;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Consumer<String[]> printNames = arr -> {
            for (String name : arr) {
                System.out.println(name);
            }
        };

        printNames.accept(scanner.nextLine().split(" "));
    }
}
