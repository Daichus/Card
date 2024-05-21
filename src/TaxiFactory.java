public class TaxiFactory extends CarFactory{
    private int numOfTaxi;

    public int getProducedTaxi() {
        return  numOfTaxi;
    }

    @Override
    public Car produceCar() {
      int [] taxiEngineIDArray = new int[8];
      for(int i = 0 ;i <8; i++) {
          taxiEngineIDArray[i] = idGenerator.nextInt(10);
      }
      String taxiEngineID = taxiEngineIDArray.toString();

      char [] taxiCarIDArray = new char[7];
      taxiCarIDArray[0] = 'T';
      taxiCarIDArray[1] = (char)(idGenerator.nextInt(25)+65);
      taxiCarIDArray[2] = (char)(idGenerator.nextInt(25)+65);
      taxiCarIDArray[3] = '-';

      for(int i = 4 ;i < 7; i++) {
          taxiEngineIDArray[i] = idGenerator.nextInt(10);
      }
      String taxiCarID = taxiCarIDArray.toString();

      return new Car(taxiCarID,taxiEngineID,"Yellow");
    }

    @Override
    public boolean updateCarColor(Car car, String newCarID) {
        newCarID = newCarID.toUpperCase();
        if(newCarID.matches("T\\W{2}-\\d{3}")) {
            car.setCarID(newCarID);
            return true;
        }
        return false;
    }


}
