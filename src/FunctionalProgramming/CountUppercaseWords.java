package FunctionalProgramming;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.List;

public class CountUppercaseWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Predicate<String> startsWithUppercase = word -> {
            if (Character.isUpperCase(word.charAt(0))) {
                return true;
            } else {
                return false;
            }
        };

        Function<String, List<String>> getAllUpperCase = text -> {
            int numOfUpperCaseWords = 0;
            List<String> upperCaseWords = new ArrayList<>();
            String[] words = text.split(" ");

            for (String word : words) {
                if (startsWithUppercase.test(word)) {
                    upperCaseWords.add(word);
                    numOfUpperCaseWords++;
                }
            }

            upperCaseWords.add(0, String.valueOf(numOfUpperCaseWords));

            return upperCaseWords;
        };

        List<String> testCase = getAllUpperCase.apply(scanner.nextLine());

        testCase.forEach(element -> {
            System.out.println(element);
        });
    }
}
