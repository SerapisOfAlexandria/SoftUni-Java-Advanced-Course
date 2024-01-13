package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrinterQueue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();
        String line = scanner.nextLine();

        while (!line.equals("print")) {

            if (line.equals("cancel") && queue.size() == 0) {
                System.out.println("Printer is on standby");
            } else if (line.equals("cancel") && queue.size() > 0) {
                System.out.println("Canceled " + queue.poll());
            } else {
                queue.offer(line);
            }

            line = scanner.nextLine();
        }

        System.out.println(queue.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("\n")));
    }
}
