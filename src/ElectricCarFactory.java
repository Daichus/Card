import java.util.Random;
public class ElectricCarFactory extends CarFactory {

    @Override
    public Car produceCar() {
        String CarId = CarIdUtil.generateElectricCarId();
        String engineId = CarIdUtil.generateEngineId();
        addNumOfCars();
        return new Car(CarId, engineId, new String[]{"White", "Black", "Blue"}[new Random().nextInt(3)]);
    }

    @Override
    public boolean updateCarId(Car car, String newCarId) {
        newCarId = newCarId.toUpperCase();
        if (CarIdUtil.isValidElectricCarId(newCarId)) {
            car.setCarID(newCarId);
            return true;
        }
        return false;
    }
}
