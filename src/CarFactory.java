public class CarFactory {
  private int numOfCars;

  public int getNumOfCars() {
    return numOfCars;
  }

  public Car produceCar() {
    String carId = CarIdUtil.generateCarId();
    String engineId = CarIdUtil.generateEngineId();
    //產生汽車物件前，將已生產汽車數量加1
    addNumOfCars();
    //返回一個汽車物件，隨機選擇一個顏色
    return new Car(carId,engineId, CarIdUtil.generateColor());
  }

  //修改汽車ID
  public boolean updateCarId(Car car, String newId) {
    newId = newId.toUpperCase();
    if (CarIdUtil.isValidCarId(newId)) {
      car.setCarID(newId);
      return true;
    } else {
      return false;
    }
  }

  //修改汽車顏色
  public boolean updateCarColor(Car car, String newColor) {
    if (newColor.equals("White") || newColor.equals("Black") || newColor.equals("Blue")) {
      car.setColor(newColor);
      return true;
    }
    return false;
  }

  //增加生產汽車總數
  public void addNumOfCars() {
    numOfCars += 1;
  }

}
