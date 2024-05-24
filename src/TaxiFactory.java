public class TaxiFactory extends CarFactory {
    //生成計程車id
    @Override
    public Car produceCar() {
      addNumOfCars();
      return new Car(CarIdUtil.generateTaxiId(), CarIdUtil.generateEngineId(), "Yellow");
    }

    //修改計程車id，調用carIdUtil中檢查計程車id的方法
    @Override
    public boolean updateCarId(Car car, String newCarId) {
        newCarId = newCarId.toUpperCase();
        if (CarIdUtil.isValidTaxiId(newCarId)) {
            car.setCarID(newCarId);
            return true;
        }
        return false;
    }
}
