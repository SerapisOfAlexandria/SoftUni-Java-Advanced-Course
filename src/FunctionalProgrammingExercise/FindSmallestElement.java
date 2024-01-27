package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class FindSmallestElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Function<int[], Integer> indexOfSmallestElement = nums -> {
            int lowestNum = nums[0];
            int rightmostIndex = 0;

            if (nums.length == 0) {
                return -1;
            }

            for (int num : nums) {
                if (lowestNum > num) {
                    lowestNum = num;
                }
            }

            for (int i = 0; i <= nums.length - 1; i++) {
                if (nums[i] == lowestNum) {
                    rightmostIndex = i;
                }
            }

            return rightmostIndex;
        };

        System.out.println(indexOfSmallestElement.apply(numbers));
    }
}
