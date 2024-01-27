package FunctionalProgrammingExercise;

import java.util.Scanner;
import java.util.function.BiPredicate;

public class PredicateName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int desiredLength = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split(" ");

        BiPredicate<String, Integer> validName = (name, length) -> (name.length() <= length ? true : false);

        for (String name : names) {
            if (validName.test(name, desiredLength)) {
                System.out.println(name);
            }
        }
    }
}
