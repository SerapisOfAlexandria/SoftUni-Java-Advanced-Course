package FunctionalProgramming;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterAge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> individuals = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] nameAge = scanner.nextLine().split(", ");
            individuals.put(nameAge[0], Integer.parseInt(nameAge[1]));
        }

        String[] condition = new String[2];
        condition[0] = scanner.nextLine();
        condition[1] = scanner.nextLine();
        String format = scanner.nextLine();

        BiFunction<Map<String, Integer>, String[], Map<String, Integer>> filter = (data, conditions) -> {
            int age = Integer.parseInt(conditions[1]);
            Map<String, Integer> filteredData = new LinkedHashMap<>();
            switch (conditions[0]) {
                case "older":
                    for (String key : data.keySet()) {
                        if (data.get(key) >= age) {
                            filteredData.put(key, data.get(key));
                        }
                    }
                    break;
                case "younger":
                    for (String key : data.keySet()) {
                        if (data.get(key) <= age) {
                            filteredData.put(key, data.get(key));
                        }
                    }
                    break;
            }
            return filteredData;
        };

        Map<String, Integer> names = filter.apply(individuals, condition);

        switch (format) {
            case "name age":
                names.entrySet().stream().forEach(entry -> {
                    System.out.printf("%s - %d\n", entry.getKey(), entry.getValue());
                });
                break;
            case "name":
                names.entrySet().stream().forEach(entry -> {
                    System.out.printf("%s\n", entry.getKey());
                });
                break;
            case "age":
                names.entrySet().stream().forEach(entry -> {
                    System.out.printf("%d\n", entry.getValue());
                });
                break;
        }
    }
}


