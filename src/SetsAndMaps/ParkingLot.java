package SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ParkingLot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, String> parkingLotList = new LinkedHashMap<>();
        String[] input = scanner.nextLine().split(", ");

        while (!input[0].equals("END")) {
            String carID = input[1];
            String action = input[0];

            if (action.equals("IN")) {
                if (!parkingLotList.containsKey(carID)) {
                    parkingLotList.put(carID, action);
                }
            } else if (action.equals("OUT")) {
                if (parkingLotList.containsKey(carID)) {
                    parkingLotList.remove(carID);
                }
            }

            input = scanner.nextLine().split(", ");
        }

        if (parkingLotList.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            System.out.println(parkingLotList.keySet().stream().collect(Collectors.joining("\n")));
        }
    }
}

