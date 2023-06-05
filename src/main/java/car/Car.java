package car;

public class Car {

    private Integer speed;
    private String color;

    public Car() {
    }

    public Car(Integer speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    public Integer speed() {
        return speed;
    }

    public String color() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }
}
