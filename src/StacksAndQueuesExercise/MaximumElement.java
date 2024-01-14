package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {
            int[] command = Arrays.stream(input.nextLine().split(" "))
                    .mapToInt((a -> Integer.parseInt(a)))
                    .toArray();

            if (command[0] == 1) {
                stack.push(command[1]);
            } else if (command[0] == 2) {
                stack.pop();
            } else if (command[0] == 3) {
                System.out.println(findHighestNumber(stack));
            }
        }
    }

    public static int findHighestNumber(ArrayDeque<Integer> deque) {
        int highest = Integer.MIN_VALUE;
        for (int num : deque) {
           if (num > highest) {
               highest = num;
           }
        }



        return highest;
    }
}
