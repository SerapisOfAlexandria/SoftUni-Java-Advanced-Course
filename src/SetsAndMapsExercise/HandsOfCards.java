package SetsAndMapsExercise;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class HandsOfCards {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> playerPoints = new LinkedHashMap<>();
        Pattern pattern = Pattern.compile("(?<p>[23456789]|10|[JQKA])(?<t>[SHDC])");

        String[] input = scanner.nextLine().split(": ");

        while (!input[0].equals("JOKER")) {
            int points = 0;
            String player = input[0];
            Set<String> cards = Arrays.stream(input[1].split(", ")).collect(Collectors.toSet());

            if (playerPoints.containsKey(player)) {
                playerPoints.computeIfAbsent(player, k -> new HashSet<>()).addAll(cards);
            } else {
                playerPoints.put(player, cards);
            }

            input = scanner.nextLine().split(": ");
            }

        playerPoints.entrySet().stream().forEach(entry -> {
            String cards = entry.getValue().toString();
            Matcher matcher = pattern.matcher(cards.toString());
            int points = 0;

            while (matcher.find()) {
                int pValue = 0;
                int tValue = 0;

                String p = matcher.group("p");
                String t = matcher.group("t");

                switch (p) {
                    case "J":
                        pValue = 11;
                        break;
                    case "Q":
                        pValue = 12;
                        break;
                    case "K":
                        pValue = 13;
                        break;
                    case "A":
                        pValue = 14;
                        break;
                    default:
                        pValue = Integer.parseInt(p);
                        break;
                }

                switch (t) {
                    case "S":
                        tValue = 4;
                        break;
                    case "H":
                        tValue = 3;
                        break;
                    case "D":
                        tValue = 2;
                        break;
                    case "C":
                        tValue = 1;
                        break;
                }

                points += pValue * tValue;
            }

            System.out.printf("%s: %d\n", entry.getKey(), points);
        });
    }
}

