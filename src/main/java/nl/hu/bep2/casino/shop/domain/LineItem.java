package nl.hu.bep2.casino.shop.domain;

public class LineItem {
    private Product product;
    private int quantity;

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addProducts(int amount) {
        this.quantity =+ amount;
    }
}
