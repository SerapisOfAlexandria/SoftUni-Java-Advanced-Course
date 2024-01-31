package DefiningClassesExercise.SpeedRacing;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Car> carMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split("\\s+");
            String model = info[0];
            double fuelAmount = Double.parseDouble(info[1]);
            double fuelCostPerKm = Double.parseDouble(info[2]);

            Car car = new Car(model, fuelAmount, fuelCostPerKm);

            carMap.put(model, car);
        }

        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("End")) {
            String model = command[1];
            int distanceToTravel = Integer.parseInt(command[2]);

            carMap.get(model).driveCar(distanceToTravel);

            command = scanner.nextLine().split("\\s+");
        }

        carMap.entrySet().stream()
                .forEach(car -> {
            System.out.println(car.getValue().toString());
        });
    }
}
