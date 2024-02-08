package IteratorsAndComparatorsExercise.Collection;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().replaceFirst("Create", "").trim().split(" ");
        if (strings[0].equals("")) {
            strings = new String[0];
        }
        Collection listyIterator = new Collection(strings);
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
                case "PrintAll":
                    Iterator<String> iterator = listyIterator.iterator();
                    while (iterator.hasNext()) {
                        System.out.print(iterator.next() + " ");
                    }
                    System.out.println();
                    break;
            }
            command = scanner.nextLine();
        }
    }
}