package day5;

public class Toy implements Comparable<Toy> {
    private int productId;
    private String name;
    private float price;
    private String category;
    private int[] ages;
    private int purchaseMonth;
    private int purchaseYear;

    public Toy(int productId, String name, float price, String category, int[] ages, int purchaseMonth, int purchaseYear) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.category = category;
        this.ages = ages;
        this.purchaseMonth = purchaseMonth;
        this.purchaseYear = purchaseYear;
    }

    @Override
    public int compareTo(Toy toy) {
        if (this.getProductId() < toy.getProductId())
            return -1;
        else if (this.getProductId() > toy.getProductId())
            return 1;
        return 0;
    }

    public String toString() {
//        return String.format("\nToy Details >\nID: %d\nName: %s\nPrice: %.2f\nCategory: %s\nAges: %s\nPurchase Month: %d\nPurchase Year: %d\n", productId, name, price, category, ages, purchaseMonth, purchaseYear);
//        return String.format("\nToy Details >\nID: %d\nName: %s\nPrice: %.2f\nCategory: %s\n", productId, name, price, category);
        return name;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int[] getAges() {
        return ages;
    }

    public void setAges(int[] ages) {
        this.ages = ages;
    }

    public int getPurchaseMonth() {
        return purchaseMonth;
    }

    public void setPurchaseMonth(int purchaseMonth) {
        this.purchaseMonth = purchaseMonth;
    }

    public int getPurchaseYear() {
        return purchaseYear;
    }

    public void setPurchaseYear(int purchaseYear) {
        this.purchaseYear = purchaseYear;
    }
}
