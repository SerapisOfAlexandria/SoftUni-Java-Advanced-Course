package StacksAndQueuesExercise;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long[] memory = new long[n + 1];
        System.out.println(fibonacci(n, memory));
    }

    private static long fibonacci(int n, long[] memo){
        if (n <= 2) {
            return 1;
        }

        if (memo[n] != 0) {
            return memo[n];
        }

        memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        return memo[n];
    }
}
