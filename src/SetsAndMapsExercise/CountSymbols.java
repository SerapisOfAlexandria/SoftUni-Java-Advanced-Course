package SetsAndMapsExercise;

import java.util.*;

public class CountSymbols {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> symbols = new TreeMap<>();
        char[] text = scanner.nextLine().toCharArray();


        for (char i : text) {
            if (symbols.containsKey(i)) {
                symbols.put(i, symbols.get(i) + 1);
            } else {
                symbols.put(i, 1);
            }
        }

        symbols.entrySet().forEach(entry ->{
            System.out.printf("%c : %d time/s \n", entry.getKey(), entry.getValue());
        });
    }
}
