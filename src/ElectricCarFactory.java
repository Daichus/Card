public class ElectricCarFactory extends CarFactory {

    @Override
    public Car produceCar() {
        char [] ElectricCarIdArray = new char[8];
        ElectricCarIdArray[0] ='E';
        ElectricCarIdArray[1] =(char)(idGenerator.nextInt(26)+65);
        ElectricCarIdArray[2] =(char)(idGenerator.nextInt(26)+65);
        ElectricCarIdArray[3] ='-';
        for(int i = 4 ;i < 8; i++) {
            ElectricCarIdArray[i] = (char)(idGenerator.nextInt(10) + '0');
        }
        String ElectricCarId = new String(ElectricCarIdArray);
        String ElectricEngineId = generateEngineID();

        addNumOfCars();
        return new Car(ElectricCarId,ElectricEngineId,new String[]{"White","Black","Blue"}[idGenerator.nextInt(3)]);
    }
    @Override
    public boolean updateCarId(Car car, String newCarID) {
        newCarID = newCarID.toUpperCase();
        if(newCarID.matches("E[A-Z]{2}-\\d{4}")) {
            car.setCarID(newCarID);
            return true;
        }
        return false;
    }
}
