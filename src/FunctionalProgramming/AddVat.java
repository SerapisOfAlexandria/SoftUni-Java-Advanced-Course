package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class AddVat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        UnaryOperator<Double> vat = price -> price + (price * 0.2);
        double[] pricesWithoutVat = Arrays.stream(scanner.nextLine().split(", "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        System.out.println("Prices with VAT: ");
        for (double price : pricesWithoutVat) {
            System.out.printf("%.2f\n", vat.apply(price));
        }

    }
}
