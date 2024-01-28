package DefiningClasses.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Car> carList = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String[] carInfo = scanner.nextLine().split(" ");
            Car car = new Car();
            car.setBrand(carInfo[0]);
            car.setModel(carInfo[1]);
            car.setHorsepower(Integer.parseInt(carInfo[2]));
            carList.add(car);
        }

        for (Car car : carList) {
            car.getInfo();
        }
    }
}
