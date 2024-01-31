package DefiningClassesExercise.CarSalesman;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Engine> engines = new LinkedHashMap<>();
        Map<String, Car> cars = new LinkedHashMap<>();

        //Engine
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] infoEngine = scanner.nextLine().split("\\s+");
            String engineModel = infoEngine[0];
            String enginePower = infoEngine[1];
            Engine engine = null;
            String displacement = "";

            switch (infoEngine.length) {
                case 2:
                    engine = new Engine(engineModel, enginePower);
                    break;
                case 3:
                    if (infoEngine[2].matches("\\d+")) {
                        engine = new Engine(engineModel, enginePower, infoEngine[2], "n/a");
                    } else {
                        engine = new Engine(engineModel, enginePower,"n/a", infoEngine[2]);
                    }
                    break;
                case 4:
                    displacement = infoEngine[2];
                    String efficiency = infoEngine[3];
                    engine = new Engine(engineModel, enginePower, displacement, efficiency);
                    break;
            }

            engines.put(engineModel, engine);
        }

        //Car
        n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
           String[] infoCars = scanner.nextLine().split("\\s+");
           String carModel = infoCars[0];
           String carEngine = infoCars[1];
           Car car = null;
           String weight = "";

           switch (infoCars.length) {
               case 2:
                   car = new Car(carModel, engines.get(carEngine));
                   break;
               case 3:
                    if (infoCars[2].matches("\\d+")) {
                        car = new Car(carModel, engines.get(carEngine), infoCars[2]);
                    } else {
                        car = new Car(carModel, engines.get(carEngine), "n/a", infoCars[2]);
                    }
                   break;
               case 4:
                   weight = infoCars[2];
                   String color = infoCars[3];
                   car = new Car(carModel, engines.get(carEngine), weight, color);
                   break;
           }

           cars.put(carModel, car);
        }

        cars.entrySet().stream()
                .forEach(entry -> System.out.print(entry.getValue().toString()));
    }
}
