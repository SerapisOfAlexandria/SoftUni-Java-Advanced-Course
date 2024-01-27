package FunctionalProgrammingExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;

public class ListOfPredicates {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            List<Integer> validNumbers = new ArrayList<>();
            int range = Integer.parseInt(bufferedReader.readLine());
            int[] arrOfDivisors = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            BiPredicate<Integer, int[]> isDivisibleByAllNumbersInRange = (number, divisors) -> {
                for (int i = divisors.length - 1; i >= 0; i--) {
                    if (number % divisors[i] != 0) {
                        return false;
                    }
                }
                return true;
            };

            for (int i = 1; i <= range; i++) {
                if (isDivisibleByAllNumbersInRange.test(i, arrOfDivisors)) {
                    validNumbers.add(i);
                }
            }

            validNumbers.stream().forEach(num -> System.out.printf("%d ", num));

        } catch (IOException e) {
            e.getMessage();
        }
    }
}