package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Deque<Integer> numQueue = new ArrayDeque<>();
        int n = input.nextInt();
        int s = input.nextInt();
        int x = input.nextInt();
        input.nextLine();
        int[] numbers = Arrays.stream(input.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int num : numbers) {
            numQueue.offer(num);
        }

        for (int i = 0; i < s; i++) {
            numQueue.poll();
        }

        if (numQueue.contains(x)) {
            System.out.println("true");
        } else if (numQueue.isEmpty()) {
            System.out.println("0");
        } else {
            int smallestNumber = Integer.MAX_VALUE;
            for (int num : numQueue) {
                if (num < smallestNumber) {
                    smallestNumber = num;
                }
            }

            System.out.println(smallestNumber);
        }
    }
}
