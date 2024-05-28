import java.util.Random;
public  class CarIdUtil {
    private  static final Random idGenerator = new Random();

    public static String generateCarId() {
        char [] carIdArray = new char[8];
        carIdArray[0] = 'C';
        carIdArray[1] = generateLetter();
        carIdArray[2] = generateLetter();
        carIdArray[3] = '-';
        for (int i = 4; i < 8; i++) {
            carIdArray[i] = generateNumber();
        }
        return new String(carIdArray);
    }

    public static String generateTaxiId() {
        char [] TaxiIdArray = new char[7];
        TaxiIdArray[0] = 'T';
        TaxiIdArray[1] = generateLetter();
        TaxiIdArray[2] = generateLetter();
        TaxiIdArray[3] = '-';
        for (int i = 4; i < 7; i++) {
            TaxiIdArray[i] = generateNumber();
        }
        return new String(TaxiIdArray);
    }

    public static String generateElectricCarId() {
        char [] ElectricCarIdArray = new char[8];
        ElectricCarIdArray[0] = 'E';
        ElectricCarIdArray[1] = generateLetter();
        ElectricCarIdArray[2] = generateLetter();
        ElectricCarIdArray[3] = '-';
        for (int i = 4; i < 8; i++) {
            ElectricCarIdArray[i] = generateNumber();
        }
        return new String(ElectricCarIdArray);
    }

    public static String generateEngineId() {
        char [] engineIdArray = new char[8];
        for (int i = 0; i < engineIdArray.length; i++) {
            engineIdArray[i] = (char) (idGenerator.nextInt(10) + '0');
        }
        return new String(engineIdArray);
    }

    public static boolean isValidCarId(String carId) {
        return carId.matches("C[A-Z]{2}-\\d{4}");
    }

    public static boolean isValidTaxiId(String TaxiCarId) {
        return TaxiCarId.matches("T[A-Z]{2}-\\d{3}");
    }

    public static boolean isValidElectricCarId(String ElectricCarId) {
        return ElectricCarId.matches("E[A-Z]{2}-\\d{4}");
    }

    public static char generateLetter() {
       return (char) (idGenerator.nextInt(26) + 65);
    }

    public static char generateNumber() {
        return (char) (idGenerator.nextInt(10) + '0');
    }

    public static String generateColor() {
        return new String[]{"White","Black","Blue"}[idGenerator.nextInt(3)];
    }

}
