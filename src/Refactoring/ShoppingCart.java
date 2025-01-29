package Refactoring;
import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {
    private final List<Product> list = new ArrayList<>();
    public void add(Product product) {
        list.add(product);
    }

    public double calc() {
        double total = 0;
        for (Product product : list) {
            total += product.getPrice();
        }
        return total;
    }

    public void display() {
        System.out.println("Items:");
        for (Product product : list) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
        System.out.println("Total: $" + calc());
    }
}
