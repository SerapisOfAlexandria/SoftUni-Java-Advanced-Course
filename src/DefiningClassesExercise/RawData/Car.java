package DefiningClassesExercise.RawData;

import java.util.ArrayList;
import java.util.List;

public class Car {
    Model model;
    Engine engine;
    Cargo cargo;
    Tires tires;

    public Car(Model m, Engine e, Cargo c, Tires t) {
        this.model = m;
        this.engine = e;
        this.cargo = c;
        this.tires = t;

    }

    public static class Tires {
        double tireOnePressure;
        int tireOneAge;
        double tireTwoPressure;
        int tireTwoAge;
        double tireThreePressure;
        int tireThreeAge;
        double tireFourPressure;
        int tireFourAge;

        public Tires(double tireOnePressure,
        int tireOneAge,
        double tireTwoPressure,
        int tireTwoAge,
        double tireThreePressure,
        int tireThreeAge,
        double tireFourPressure,
        int tireFourAge) {
            this.tireOnePressure = tireOnePressure;
            this.tireOneAge = tireOneAge;
            this.tireTwoPressure = tireTwoPressure;
            this.tireTwoAge = tireTwoAge;
            this.tireThreePressure = tireThreePressure;
            this.tireThreeAge = tireThreeAge;
            this.tireFourPressure = tireFourPressure;
            this.tireFourAge = tireFourAge;
        }
    }

    public static class Engine {
        int power;
        int speed;

        public Engine(int power, int speed) {
            this.power = power;
            this.speed = speed;
        }
    }

    public static class Cargo {
        int weight;
        String type;

        public Cargo(int weight, String type) {
            this.weight = weight;
            this.type = type;
        }
    }

    public static class Model {
        String model;

        public Model(String model) {
            this.model = model;
        }
    }

    public boolean isFragile() {
        List<Double> tirePressures = new ArrayList<>();
        tirePressures.add(tires.tireOnePressure);
        tirePressures.add(tires.tireTwoPressure);
        tirePressures.add(tires.tireThreePressure);
        tirePressures.add(tires.tireFourPressure);

        boolean hasLowPressureTire = tirePressures.stream().anyMatch(pressure -> pressure < 1.00);

        if (hasLowPressureTire && cargo.type.equals("fragile")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFlammable() {
        if (engine.power > 250 && cargo.type.equals("flamable")) {
            return true;
        } else {
            return false;
        }
    }
}
