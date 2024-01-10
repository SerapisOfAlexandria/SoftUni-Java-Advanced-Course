package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        String action = input.nextLine();

        while (!action.equals("Home")) {
            if (action.equals("back")) {
                if (browserHistory.size() >= 2) {
                    browserHistory.pop();
                    System.out.println(browserHistory.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            } else {
             browserHistory.push(action);
             System.out.println(action);
            }

            action = input.nextLine();
        }
    }
}
