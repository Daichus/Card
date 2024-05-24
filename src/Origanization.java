public class Origanization {
    private int numOfWhiteCars;
    private int numOfBlackCars;
    private int numOfBlueCars;
    private int numOfYellowCars;

    public int getNumOfWhiteCars() {
        return numOfWhiteCars;
    }

    public int getNumOfBlackCars() {
        return numOfBlackCars;
    }

    public int getNumOfBlueCars() {
        return numOfBlueCars;
    }

    public int getNumOfYellowCars() {
        return numOfYellowCars;
    }
    public void buyCar(Car car) {
        String carColor = car.getColor();
        switch(carColor) {
            case "White":
                numOfWhiteCars ++;
                break;
            case "Black":
                numOfBlackCars ++;
                break;
            case "Blue":
                numOfBlueCars ++;
                break;
            case "Yellow":
                numOfYellowCars ++;
                break;
            default:
                break;
        }
    }
}
