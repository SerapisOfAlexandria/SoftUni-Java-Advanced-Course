package SetsAndMaps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<Double, Integer> occurrenceList = new LinkedHashMap<>();
        double[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();


        for (double num : numbers) {
            if (occurrenceList.containsKey(num)) {
                occurrenceList.put(num, occurrenceList.get(num) + 1);
            } else if (!occurrenceList.containsKey(num)) {
                occurrenceList.put(num, 1);
            }
        }

        System.out.println(occurrenceList.entrySet().stream()
                .map(entry -> String.format("%.1f -> %d", entry.getKey(), entry.getValue()))
                .collect(Collectors.joining("\n")));
    }
}