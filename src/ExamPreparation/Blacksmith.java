package ExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class Blacksmith {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> swordsForged = new TreeMap<>();

        //Steel values insertion in queue
        int[] steelValues = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Deque<Integer> steelQueue = new ArrayDeque<>();
        for (int i = 0; i < steelValues.length; i++) {
            steelQueue.offer(steelValues[i]);
        }

        //Carbon values insertion in carbonValues
        int[] carbonValues = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Deque<Integer> carbonStack = new ArrayDeque<>();
        for (int i = 0; i < carbonValues.length; i++) {
            carbonStack.push(carbonValues[i]);
        }

        while (!steelQueue.isEmpty() && !carbonStack.isEmpty()) {
            int steelValue = steelQueue.poll();
            int carbonValue = carbonStack.pop();

            switch (steelValue + carbonValue) {
                case 70: // Gladius
                    if (doesExist("Gladius", swordsForged)) {
                        swordsForged.put("Gladius", swordsForged.get("Gladius") + 1);
                    } else {
                        swordsForged.put("Gladius", 1);
                    }
                    break;
                case 80: // Shasmir
                    if (doesExist("Shamshir", swordsForged)) {
                        swordsForged.put("Shamshir", swordsForged.get("Shamshir") + 1);
                    } else {
                        swordsForged.put("Shamshir", 1);
                    }
                    break;
                case 90: // Katana
                    if (doesExist("Katana", swordsForged)) {
                        swordsForged.put("Katana", swordsForged.get("Katana") + 1);
                    } else {
                        swordsForged.put("Katana", 1);
                    }
                    break;
                case 110: // Sabre
                    if (doesExist("Sabre", swordsForged)) {
                        swordsForged.put("Sabre", swordsForged.get("Sabre") + 1);
                    } else {
                        swordsForged.put("Sabre", 1);
                    }
                    break;
                default:
                    carbonValue += 5;
                    carbonStack.push(carbonValue);
                    break;
            }
        }

        // 1st line of output (Information)
        if (!swordsForged.keySet().isEmpty()) {
            System.out.printf("You have forged %d swords.\n", swordsForged.values().stream()
                    .mapToInt(Integer::intValue)
                    .sum());
        } else {
            System.out.println("You did not have enough resources to forge a sword.");
        }

        // 2nd line of output (Steel remaining)
        if (steelQueue.isEmpty()) {
            System.out.println("Steel left: none");
        } else {
            System.out.printf("Steel left: %s\n", steelQueue.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        }

        // 3rd line of output (Carbon remaining)
        if (carbonStack.isEmpty()) {
            System.out.println("Carbon left: none");
        } else {
            System.out.printf("Carbon left: %s\n", carbonStack.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        }

        // 4th line of output (Forged swords)
        for (String sword : swordsForged.keySet()) {
            System.out.printf("%s: %d\n", sword, swordsForged.get(sword));
        }
    }

    public static boolean doesExist(String swordName, Map<String, Integer> mapOfSwords) {
        if (mapOfSwords.containsKey(swordName)) {
            return true;
        }
        return false;
    }
}
