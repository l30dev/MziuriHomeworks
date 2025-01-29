package Refactoring;

public class OrderProcessor {

    public void processOrder(Order order) {
        double price = order.getProduct().getPrice();
        int quantity = order.getQuantity();
        double totalPrice = price * quantity;

        Discount discountCalculator = new Discount();
        double discount = discountCalculator.calculateDiscount(totalPrice);

        totalPrice -= discount;

        System.out.println("Order Summary:");
        System.out.println("Customer: " + order.getCustomerName());
        System.out.println("Address: " + order.getAddress());
        System.out.println("Product: " + order.getProduct().getName());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price after Discount: $" + totalPrice);
    }

    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 1250.0);
        Order order = new Order("Andria", "123 kupradze St", laptop, 5);

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processOrder(order);
    }
}
