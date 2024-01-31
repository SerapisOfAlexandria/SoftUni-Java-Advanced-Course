package DefiningClassesExercise.CarSalesman;

public class Engine {
    String model;
    String power;
    String displacement;
    String efficiency;

    public Engine(String model, String power, String displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public Engine(String model, String power, String displacement) {
        this(model, power, displacement, "n/a");
    }

    public Engine(String model, String power) {
        this(model, power, "n/a", "n/a");
    }

}
