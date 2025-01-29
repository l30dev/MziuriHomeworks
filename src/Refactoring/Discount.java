package Refactoring;
public class Discount {
    public double calculateDiscount(double totalPrice) {
        if (totalPrice > 5000) {
            return totalPrice * 0.1;
        } else if (totalPrice > 2000) {
            return totalPrice * 0.05;
        }
        return 0;
    }
}