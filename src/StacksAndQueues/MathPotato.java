package StacksAndQueues;

import java.util.*;
import java.util.stream.Collectors;

public class MathPotato {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String participants = input.nextLine();
        PriorityQueue<String> queue = Arrays.stream(participants.split(" "))
                .collect(Collectors.toCollection(PriorityQueue::new));
        int n = Integer.parseInt(input.nextLine());
        int cycle = 1;

        while (queue.size() > 1) {
            for (int i = 1 ; i < n; i++) {
                queue.offer(Objects.requireNonNull(queue.poll()));
            }

            if (isPrime(cycle)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }
            cycle++;
        }

        System.out.println("Last is " + queue.poll());
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        if (number <= 1) {
            return false;
        }
        return true;
    }
}
