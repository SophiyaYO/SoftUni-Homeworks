package DefiningClasses.Google;

public class Car {
    private String carModel;
    private String carSpeed;

    public Car(String carModel, String carSpeed) {
        this.carModel = carModel;
        this.carSpeed = carSpeed;
    }

    @Override
    public String toString() {
        return String.format("%s %s%n", this.carModel, this.carSpeed);
    }
}
