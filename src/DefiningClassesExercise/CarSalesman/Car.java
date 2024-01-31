package DefiningClassesExercise.CarSalesman;

public class Car {
    String model;
    Engine engine;
    String weight;
    String color;

    public Car(String model, Engine engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, Engine engine, String weight) {
        this(model, engine, weight, "n/a");
    }

    public Car(String model, Engine engine) {
        this(model, engine, "n/a", "n/a");
    }

    @Override
    public String toString() {
        return String.format("%s:\n" +
                "%s:\n" +
                "Power: %s\n" +
                "Displacement: %s\n" +
                "Efficiency: %s\n" +
                "Weight: %s\n" +
                "Color: %s\n",
                model,
                engine.model,
                engine.power,
                engine.displacement,
                engine.efficiency,
                weight,
                color);
    }
}
