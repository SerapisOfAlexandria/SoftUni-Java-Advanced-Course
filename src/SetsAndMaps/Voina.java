package SetsAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class Voina {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<Integer> playerOne = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        Set<Integer> playerTwo = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));



        for (int i = 0; i < 50; i++) {
            int playerOneTopNum = playerOne.iterator().next();
            playerOne.remove(playerOneTopNum);
            int playerTwoTopNum = playerTwo.iterator().next();
            playerTwo.remove(playerTwoTopNum);

            if (playerOne.isEmpty() || playerTwo.isEmpty()) {
                break;
            }

            if (playerOneTopNum > playerTwoTopNum) {
                playerOne.add(playerOneTopNum);
                playerOne.add(playerTwoTopNum);
            } else if (playerOneTopNum < playerTwoTopNum) {
                playerTwo.add(playerOneTopNum);
                playerTwo.add(playerTwoTopNum);
            }
        }

        if (playerOne.size() > playerTwo.size()) {
            System.out.println("First player win!");
        } else if (playerOne.size() < playerTwo.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw");
        }
    }
}
