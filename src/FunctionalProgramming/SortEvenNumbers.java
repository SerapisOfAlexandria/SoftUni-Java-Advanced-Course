package FunctionalProgramming;

/*
NOTE to future self: If you're reading this code and asking yourself "Why all the unnecessary and complicated code blocs?",
this is what the problem description expects of me, please do not lose faith.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Function;

public class SortEvenNumbers {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int[] nums = Arrays.stream(bufferedReader.readLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            Function<int[], List<Integer>> removeOddNums = list -> {
                List<Integer> evenNums = new ArrayList<>();
                for (int i : list) {
                    if (i % 2 == 0) {
                        evenNums.add(i);
                    }
                }
                return evenNums;
            };

            Function<List<Integer>, String> printFunction = list -> {
                String printableFormat = "";
                for (int i = 0; i <= list.size() - 1; i++) {
                    if (i == list.size() - 1) {
                        printableFormat += list.get(i) + "";
                    } else {
                        printableFormat += list.get(i) + ", ";
                    }
                }

                return printableFormat;
            };

            List<Integer> filteredNums = removeOddNums.apply(nums);
            System.out.println(printFunction.apply(filteredNums));
            filteredNums.sort((a, b) -> a.compareTo(b));
            System.out.println(printFunction.apply(filteredNums));
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
