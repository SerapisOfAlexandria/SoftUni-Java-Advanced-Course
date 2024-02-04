package GenericsExercise.GenericSwapMethodInteger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<BoxSwaper<Integer>> boxSwaperList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            BoxSwaper<Integer> boxSwaper = new BoxSwaper<>(Integer.parseInt(scanner.nextLine()));
            boxSwaperList.add(boxSwaper);
        }

        int indexOne = scanner.nextInt();
        int indexTwo = scanner.nextInt();
        scanner.nextLine();

        BoxSwaper.swap(indexOne, indexTwo, boxSwaperList);

        boxSwaperList.forEach(System.out::print);
    }


}
