package IteratorsAndComparatorsExercise.ListyIterator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().replaceFirst("Create", "").trim().split(" ");
        if (strings[0].equals("")) {
            strings = new String[0];
        }
        ListyIterator listyIterator = new ListyIterator(strings);
        String command = scanner.nextLine();

        while (!command.equals("END")) {
            switch (command) {
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    listyIterator.print();
                    break;
            }
            command = scanner.nextLine();
        }
    }
}