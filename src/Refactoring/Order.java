package Refactoring;

public class Order {
    private final String customerName;
    private final String address;
    private final Product product;
    private final int quantity;

    public Order(String customerName, String address, Product product, int quantity) {
        this.customerName = customerName;
        this.address = address;
        this.product = product;
        this.quantity = quantity;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
