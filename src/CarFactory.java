import java.util.Random;
public class CarFactory {

    private int numOfCars;
    protected final Random idGenerator = new Random();

    public int getNumOfCars() {
        return numOfCars;
    }
    public Car produceCar() {
        //生成汽車ID，隨機生成ASCII碼並轉為char，預設跳過陣列第四個元素
        char [] carIdArray = new char[8];
        carIdArray[0] = (char)(idGenerator.nextInt(26)+65);
        carIdArray[1] = (char)(idGenerator.nextInt(26)+65);
        carIdArray[2] = (char)(idGenerator.nextInt(26)+65);
        carIdArray[3] ='-';
        for (int i = 4; i < 8; i++) {
            carIdArray[i] = (char)(idGenerator.nextInt(10) + '0');
        }
        String carID = new String(carIdArray);
        String engineID = generateEngineID();
         //產生汽車物件前，將已生產汽車數量加1
        addNumOfCars();
        //返回一個汽車物件，隨機選擇一個顏色
        return new Car(carID,engineID,new String[]{"White","Black","Blue"}[idGenerator.nextInt(3)]);
    }
    //生成引擎ID方法
    public String generateEngineID(){
        char [] engineIDArray = new char[8];
        for(int i = 0; i < engineIDArray.length ; i++) {
            engineIDArray[i] = (char) (idGenerator.nextInt(10) + '0');
        }
        return new String(engineIDArray);
    }
    //修改汽車ID
    public boolean updateCarId(Car car,String newID) {
        newID = newID.toUpperCase();
        if(newID.matches("[A-Z]{3}-\\d{4}")) {
            car.setCarID(newID);
            return true;
        } else {
            return false;
        }
    }
    //修改顏色
    public boolean updateCarColor(Car car,String newColor) {
            if (newColor.equals("White")||newColor.equals("Black")||newColor.equals("Blue")) {
                car.setColor(newColor);
                return true;
            }
        return false;
    }
    //增加生產汽車總數
    public void addNumOfCars(){
        numOfCars += 1;
    }

}
