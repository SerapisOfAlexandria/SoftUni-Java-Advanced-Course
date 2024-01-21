package SetsAndMaps;

import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // ccc - continent country city
        LinkedHashMap<String, LinkedHashMap<String, List<String>>> ccc = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split(" ");
            String continent = info[0];
            String country = info[1];
            String city = info[2];

            if (ccc.containsKey(continent)) {
                if (ccc.get(continent).containsKey(country)) {
                    ccc.get(continent).get(country).add(city);
                } else {
                    List<String> cityToAdd = new ArrayList<>();
                    cityToAdd.add(city);
                    ccc.get(continent).put(country, (ArrayList<String>) cityToAdd);
                }
            } else {
                LinkedHashMap<String, List<String>> countryAndCity = new LinkedHashMap<>();
                List<String> cityToAdd = new ArrayList<>();
                cityToAdd.add(city);
                countryAndCity.put(country, cityToAdd);
                ccc.put(continent, countryAndCity);
            }
        }


        ccc.entrySet().forEach(entry -> {
            System.out.printf("%s:%n", entry.getKey());
            entry.getValue().entrySet().forEach(entry2 -> {
                System.out.printf("  %s -> %s%n", entry2.getKey(), String.join(", ", entry2.getValue()));
            });
        });
    }
}
