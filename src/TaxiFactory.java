public class TaxiFactory extends CarFactory{
    @Override
    public Car produceCar() {
      char [] taxiCarIDArray = new char[7];
      taxiCarIDArray[0] = 'T';
      taxiCarIDArray[1] = (char)(idGenerator.nextInt(26)+65);
      taxiCarIDArray[2] = (char)(idGenerator.nextInt(26)+65);
      taxiCarIDArray[3] = '-';

      for(int i = 4 ;i < 7; i++) {
          taxiCarIDArray[i] = (char)(idGenerator.nextInt(10) + '0');
      }
      String taxiCarID = new String(taxiCarIDArray);
      String taxiEngineID = generateEngineID();

      addNumOfCars();
      return new Car(taxiCarID,taxiEngineID,"Yellow");
    }

    @Override
    public boolean updateCarId(Car car, String newCarID) {
        newCarID = newCarID.toUpperCase();
        if(newCarID.matches("T[A-Z]{2}-\\d{3}")) {
            car.setCarID(newCarID);
            return true;
        }
        return false;
    }
}
