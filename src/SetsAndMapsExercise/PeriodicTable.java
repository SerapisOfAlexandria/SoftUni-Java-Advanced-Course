package SetsAndMapsExercise;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;

public class PeriodicTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<String> chemicalElements = new TreeSet<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] elements = scanner.nextLine().split(" ");
            for (var element : elements) {
                chemicalElements.add(element);
            }
        }

        System.out.println(chemicalElements.stream().collect(Collectors.joining(" ")));
    }
}
