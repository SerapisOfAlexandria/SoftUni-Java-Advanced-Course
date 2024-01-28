package DefiningClasses.Car;

public class Car {
    private String brand;
    private String model;
    private String horsepower;

    public Car(String brand) {
        this.brand = brand;
        this.model = "unknown";
        this.horsepower = "-1";
    }

    public Car(String brand, String model, String horsepower) {
        this.brand = brand;
        this.model = model;
        this.horsepower = horsepower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(String horsepower) {
        this.horsepower = horsepower;
    }

    public void getInfo() {
        System.out.printf("The car is: %s %s - %s HP.\n", getBrand(), getModel(), getHorsepower());
    }
}
