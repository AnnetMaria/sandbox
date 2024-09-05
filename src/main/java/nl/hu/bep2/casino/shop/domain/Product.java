package nl.hu.bep2.casino.shop.domain;

public class Product {
    private String name;
    private double price;

    private long id;

    public Product(String name, double price, long id) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
