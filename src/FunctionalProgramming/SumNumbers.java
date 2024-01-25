package FunctionalProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            int[] nums = Arrays.stream(bufferedReader.readLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            Function<int[], Integer> sum = numbers -> {
                int sumOfNumbers = 0;
                for (int i : numbers) {
                    sumOfNumbers += i;
                }
                return sumOfNumbers;
            };

            System.out.printf("Count = %d\n", nums.length);
            System.out.printf("Sum = %d", sum.apply(nums));

        } catch (IOException e) {
            e.getMessage();
        }
    }
}
