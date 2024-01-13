package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HotPotato {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String gameParticipants = input.nextLine();
        ArrayDeque<String> queue = Arrays.stream(gameParticipants.split(" "))
                .collect(Collectors.toCollection(ArrayDeque::new));
        int tossNumber = Integer.parseInt(input.nextLine());

        while (queue.size() > 1) {

            for (int i = 1; i <= tossNumber; i++) {
                queue.offer(queue.poll());

                System.out.println("Removed " + queue.poll());
            }
        }

        System.out.println("Last is " + queue.poll());
    }
}
