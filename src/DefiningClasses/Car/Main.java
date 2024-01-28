package DefiningClasses.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Car> carList = new ArrayList<>();
        Car car;


        for (int i = 0; i < n; i++) {
            String[] carInfo = scanner.nextLine().split(" ");

            if (carInfo.length == 1) {
                car = new Car(carInfo[0]);
            } else {
                car = new Car(carInfo[0], carInfo[1], carInfo[2]);
            }

            carList.add(car);
        }

        for (Car carr : carList) {
            carr.getInfo();
        }
    }
}
