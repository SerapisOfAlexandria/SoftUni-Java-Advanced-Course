package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MatchingBrackets {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();


        for (int i = 0; i <= expression.length() - 1; i++) {
            if (expression.charAt(i) == '(') {
                stack.push(i);
            } else if (expression.charAt(i) == ')') {
                int index = stack.pop();
                System.out.println(expression.substring(index));
            }
        }

        System.out.println(stack.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("\n")));
    }
}


