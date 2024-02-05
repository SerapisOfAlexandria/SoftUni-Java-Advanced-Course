package GenericsExercise.GenericCountMethodDouble;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Box<Double> doubleBox = new Box<>();

        for (int i = 0; i < n; i++) {
            doubleBox.addToList(Double.parseDouble(scanner.nextLine()));
        }

        System.out.println(doubleBox.numOfBiggerElements(Double.parseDouble(scanner.nextLine())));

    }
}
