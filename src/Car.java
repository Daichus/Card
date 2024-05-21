public class Car {
    private String carID;
    private final String engineID;
    private String color;

    public Car(String engineID) {
        this.engineID = engineID;
    }

    public Car(String carID, String engineID, String color) {
        this.carID = carID;
        this.engineID = engineID;
        this.color = color;
    }

    public String getEngineID() {
        return engineID;
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
