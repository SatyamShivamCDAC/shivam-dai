package day5.save_data;

public class Car implements SerializeToFile, SerializeToDB {
    private String company;
    private String model;
    private int price;

    public Car(String company, String model, int price) {
        this.company = company;
        this.model = model;
        this.price = price;
    }

    @Override
    public void saveToFile() {
        System.out.println("Saved to File");
    }

    @Override
    public void test() {
        System.out.println(SerializeToFile.super.toString());
        SerializeToFile.super.test();
    }

    @Override
    public void saveToDB() {
        System.out.println("Saved to DB");
    }
}
