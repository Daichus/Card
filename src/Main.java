public class Main {
    public static void main(String[] args) {
        Origanization myCollection = new Origanization();
        CarFactory volkswagen = new CarFactory();
        TaxiFactory toyota = new TaxiFactory();
        ElectricCarFactory Tesla = new ElectricCarFactory();

        for(int i = 0; i < 3; i++) {
            myCollection.buyCar(volkswagen.produceCar());
        }
        for(int i = 0; i < 5; i++) {
            myCollection.buyCar(Tesla.produceCar());
        }
        for(int i = 0; i < 2; i++) {
            myCollection.buyCar(toyota.produceCar());
        }
        System.out.print("White Cars: " + myCollection.getNumOfWhiteCars() + "\n");
        System.out.print("Black Cars: " + myCollection.getNumOfBlackCars() + "\n");
        System.out.print("Blue Cars: " + myCollection.getNumOfBlueCars() + "\n");
        System.out.print("Yellow Cars: " + myCollection.getNumOfYellowCars() + "\n");







    }
}