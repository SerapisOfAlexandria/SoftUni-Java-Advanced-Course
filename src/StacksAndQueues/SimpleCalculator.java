package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String[] numbers = input.nextLine().split("\\s");

        for (int i = 0; i <= numbers.length - 1; i += 2) {
            if (i == 0) {
                stack.push(Integer.parseInt(numbers[i]));
            } else {
                int number = Integer.parseInt(numbers[i]);
                char operator = numbers[i - 1].charAt(0);

                if (operator == '-') {
                    stack.push(-number);
                } else {
                    stack.push(number);
                }
            }
        }

        int sum = 0;
        int stackSize = stack.size();

        for (int i = 1; i <= stackSize; i++) {
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}
