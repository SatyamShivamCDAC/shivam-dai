package day5.save_data;

public class Stock {
    public static void main(String[] args) {

        Car car = new Car("Tesla", "X", 1300000);

        SerializeData.saveDataToFile(car);
        car.test();

    }
}
