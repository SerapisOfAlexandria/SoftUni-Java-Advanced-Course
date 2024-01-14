package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();
        int n = input.nextInt();
        int s = input.nextInt();
        int x = input.nextInt();
        input.nextLine();
        String stringNumbers = input.nextLine();
        int[] numbers = Arrays.stream(stringNumbers.split(" "))
                .mapToInt(num -> Integer.parseInt(num))
                .toArray();

        for (int num : numbers) {
            stack.push(num);
        }

        for (int i = 0; i < s; i++) {
            stack.pop();
        }

        if (stack.contains(x)) {
            System.out.println("true");
        } else if (stack.isEmpty()) {
            System.out.println(0);
        } else {
            int smallestNumber = stack.pop();

            while(!stack.isEmpty()) {

                int num = stack.pop();

                if (num < smallestNumber) {
                    smallestNumber = num;
                }
            }
            System.out.println(smallestNumber);
        }
    }
}
