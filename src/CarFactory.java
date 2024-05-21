import java.util.Random;
public class CarFactory {
    public final Random idGenerator = new Random();
    private int numOfCars;
    private final String [] carColors = new String[]{"White","Black","Blue"};

    public int getNumOfCars() {
        return numOfCars;
    }
    public Car produceCar() {
        //generate car id through random method
        char [] carIdArray = new char[8];
        for (int i = 0; i < 3; i++) {
            carIdArray[i] = (char)(idGenerator.nextInt(25)+65);
        }
        carIdArray[3] ='-';
        for(int i = 4; i < 8; i++) {
            carIdArray[i] = (char)(idGenerator.nextInt(11) + '0');
        }
        String carID = carIdArray.toString();

        //generate engineId
        int [] engineIDArray = new int[8];
        for(int i = 0; i < engineIDArray.length ; i++) {
            engineIDArray[i] = idGenerator.nextInt(10);
        }
        String engineID = engineIDArray.toString();

        numOfCars += 1;
        //return a car object
        return new Car(engineID,carID,carColors[idGenerator.nextInt(3)]);
    }

    public boolean updateCarId(Car car,String newID) {
        newID = newID.toUpperCase();
        if(newID.matches("\\w{3}-\\d{4}")) {
            car.setCarID(newID);
            return true;
        } else {
            return false;
        }
    }
    public boolean updateCarColor(Car car,String newColor) {
        for (int i = 0; i < 3;i++) {
            if (newColor.equals(carColors[i])) {
                car.setColor(carColors[i]);
                return true;
            }
        }
        return false;
    }

}
