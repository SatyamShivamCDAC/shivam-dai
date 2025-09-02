package day7.store;

public class Toy {
    private int id;
    private String name;
    private int price;
    private String category;
    private String ageGroup;
    private int purchaseMonth;
    private int purchaseYear;

    public Toy(int id, String name, int price, String category, String ageGroup, int purchaseMonth, int purchaseYear) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.ageGroup = ageGroup;
        this.purchaseYear = purchaseYear;
        this.purchaseMonth = purchaseMonth;
    }

    @Override
    public String toString() {
        return name + " " + price + " " + purchaseYear;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public int getPurchaseYear() {
        return purchaseYear;
    }

    public int getPurchaseMonth() {
        return purchaseMonth;
    }
}
