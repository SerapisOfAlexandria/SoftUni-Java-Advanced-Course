package StacksAndQueuesExercise;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Deque<String> stack = new ArrayDeque<>();
        String[] ints = input.nextLine().split("\\s");

        for (String a : ints) {
            stack.push(a);
        }

        System.out.println(stack.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));

    }
}
