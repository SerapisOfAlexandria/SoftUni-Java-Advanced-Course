package SetsAndMapsExercise;

import java.util.*;

public class UniqueUsernames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<String> uniqueWords = new LinkedHashSet<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            if (!uniqueWords.contains(input)) {
                uniqueWords.add(input);
            }
        }

        for (var word: uniqueWords) {
            System.out.println(word);
        }
    }
}
