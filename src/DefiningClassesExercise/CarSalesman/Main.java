package DefiningClassesExercise.CarSalesman;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Engine> engineList = new ArrayList<>();
        List<Car> carList = new ArrayList<>();

        //Engine
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] infoEngine = scanner.nextLine().split("\\s+");
            String engineModel = infoEngine[0];
            String enginePower = infoEngine[1];
            String displacement = "n/a";
            String efficiency = "n/a";
            Engine engine = null;

            if (infoEngine.length == 4) {
                engine = new Engine(engineModel, enginePower, infoEngine[2], infoEngine[3]);
            } else if (infoEngine.length == 3) {
                if (infoEngine[2].matches("\\d+")) {
                    engine = new Engine(engineModel, enginePower, infoEngine[2], "n/a");
                } else {
                    engine = new Engine(engineModel, enginePower, "n/a", infoEngine[2]);
                }
            } else {
                engine = new Engine(engineModel, enginePower, displacement, efficiency);
            }

            engineList.add(engine);
        }

        //Car
        int m = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < m; i++) {
            String[] infoCars = scanner.nextLine().split("\\s+");
            String carModel = infoCars[0];
            Engine carEngine = null;
            String weight = "n/a";
            String color = "n/a";
            Car car = null;

            for (Engine e : engineList) {
                if (e.model.equals(infoCars[1])) {
                    carEngine = e;
                    break;
                }
            }

            if (infoCars.length == 4) {
                car = new Car(carModel, carEngine, infoCars[2], infoCars[3]);
            } else if (infoCars.length == 3) {
                if (infoCars[2].matches("\\d+")) {
                    car = new Car(carModel, carEngine, infoCars[2], "n/a");
                } else {
                    car = new Car(carModel, carEngine, "n/a", infoCars[2]);
                }
            } else {
                car = new Car(carModel, carEngine, "n/a", "n/a");
            }

            carList.add(car);
        }

        for (Car car : carList) {
            System.out.println(car.toString());
        }
    }
}
