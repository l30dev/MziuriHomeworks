package Refactoring;
public class Product1 {//products davarqmevdi mara packegshi
    // maqvs ukve product klasi
    private final String name;
    private final double price;

    public Product1(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
