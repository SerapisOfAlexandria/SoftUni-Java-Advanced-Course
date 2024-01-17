package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayDeque<String> history = new ArrayDeque<>();
        ArrayDeque<String> forwardHistory = new ArrayDeque<>();

        String action = input.nextLine();
        String currentUrl = null;

        while (!action.equals("Home")) {
            if (action.equals("back")) {
                if (history.isEmpty()) {
                    System.out.println("no previous URLs");
                } else {
                    forwardHistory.push(currentUrl);
                    currentUrl = history.pop();
                    System.out.println(currentUrl);
                }
            } else if (action.equals("forward")) {
                if (forwardHistory.isEmpty()) {
                    System.out.println("no next URLs");
                } else {
                    history.push(currentUrl);
                    currentUrl = forwardHistory.pop();
                    System.out.println(currentUrl);
                }
            } else {
                if (currentUrl != null) {
                    history.push(currentUrl);
                    forwardHistory.clear();
                }
                currentUrl = action;
                System.out.println(currentUrl);
            }

         action = input.nextLine();
        }
    }
}
