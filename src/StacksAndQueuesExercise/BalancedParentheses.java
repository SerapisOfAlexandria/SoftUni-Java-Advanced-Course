package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sequence = input.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (char ch : sequence.toCharArray()) {

            if (isOpenBracket(ch)) {
                stack.push(ch);
            } else {
                if (stack.isEmpty() || !isMatchingBracket(stack.pop(), ch)) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println(stack.isEmpty() ? "YES" : "NO");
    }

    public static boolean isMatchingBracket(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '[' && closing == ']') ||
                (opening == '{' && closing == '}');
    }

    public static boolean isOpenBracket(char parenthesis) {
        return parenthesis == '(' || parenthesis == '{' || parenthesis == '[';
    }
}
