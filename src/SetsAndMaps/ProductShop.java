package SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ProductShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TreeMap<String, LinkedHashMap<String, Double>> priceList = new TreeMap<>();
        String[] info = scanner.nextLine().split(", ");

        while (!info[0].equals("Revision")) {
            String market = info[0];
            String product = info[1];
            double price = Double.parseDouble(info[2]);

            if (priceList.containsKey(market)) {
                priceList.get(market).put(product, price);
            } else {
                LinkedHashMap<String, Double> productAndPrice = new LinkedHashMap<>();
                productAndPrice.put(product, price);
                priceList.put(market, productAndPrice);
            }

            info = scanner.nextLine().split(", ");
        }

        for (var record : priceList.entrySet()) {
            String marketName = record.getKey() + "->";

            String productPrices = record.getValue().entrySet().stream()
                    .map(entry -> String.format("Product: %s, Price: %.1f", entry.getKey(), entry.getValue()))
                    .collect(Collectors.joining("\n"));

            System.out.println(marketName + "\n" + productPrices);

        }


    }
}