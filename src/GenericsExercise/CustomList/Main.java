package GenericsExercise.CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CustomList<String> customList = new CustomList<>();
        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("END")) {
            switch (command[0]) {
                case "Add":
                    String elementToAdd = command[1];
                    customList.add(elementToAdd);
                    break;
                case "Remove":
                    int indexOfElement = Integer.parseInt(command[1]);
                    customList.remove(indexOfElement);
                    break;
                case "Contains":
                    String element = command[1];
                    System.out.println(customList.contains(element));
                    break;
                case "Greater":
                    String compareElement = command[1];
                    System.out.println(customList.countGreaterThan(compareElement));
                    break;
                case "Swap":
                    int indexOne = Integer.parseInt(command[1]);
                    int indexTwo = Integer.parseInt(command[2]);
                    customList.swap(indexOne, indexTwo);
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    customList.printEach();
                    break;
            }
            command = scanner.nextLine().split("\\s+");
        }
    }
}
