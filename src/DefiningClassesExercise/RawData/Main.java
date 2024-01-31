package DefiningClassesExercise.RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split("\\s+");
            String model = info[0];
            int engineSpeed = Integer.parseInt(info[1]);
            int enginePower = Integer.parseInt(info[2]);
            int cargoWeight = Integer.parseInt(info[3]);
            String cargoType = info[4];
            double tireOnePressure = Double.parseDouble(info[5]);
            //tires
            int tireOneAge = Integer.parseInt(info[6]);
            double tireTwoPressure = Double.parseDouble(info[7]);
            int tireTwoAge = Integer.parseInt(info[8]);
            double tireThreePressure = Double.parseDouble(info[9]);
            int tireThreeAge = Integer.parseInt(info[10]);
            double tireFourPressure = Double.parseDouble(info[11]);
            int tireFourAge = Integer.parseInt(info[12]);

            Car.Model carModel = new Car.Model(model);
            Car.Engine carEngine = new Car.Engine(enginePower, engineSpeed);
            Car.Cargo cargo = new Car.Cargo(cargoWeight, cargoType);
            Car.Tires tires = new Car.Tires(tireOnePressure, tireOneAge,
                    tireTwoPressure, tireTwoAge,
                    tireThreePressure, tireThreeAge,
                    tireFourPressure, tireFourAge);

            Car car = new Car(carModel, carEngine, cargo, tires);
            cars.add(car);
        }

        String typeAction = scanner.nextLine();

        for (Car car : cars) {
            switch (typeAction) {
                case "flamable":
                    if (car.isFlammable()) {
                        System.out.println(car.model.model);
                    }
                    break;
                case "fragile":
                    if (car.isFragile()) {
                        System.out.println(car.model.model);
                    }
                    break;
            }
        }
    }
}
