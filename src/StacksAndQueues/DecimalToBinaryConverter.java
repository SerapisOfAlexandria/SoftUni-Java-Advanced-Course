package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int decimal = Integer.parseInt(input.nextLine());

        if (decimal == 0) {
            System.out.println(0);
            return;
        } else {
            while (decimal != 0) {
                stack.push(decimal % 2);
                decimal /= 2;
            }
        }

        System.out.println(stack.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("")));
    }
}
